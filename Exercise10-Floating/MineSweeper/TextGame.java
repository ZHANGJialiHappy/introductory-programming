import java.util.Scanner;
import java.util.Map;

public class TextGame extends MineSweeper {

    private Scanner scanner;

    public TextGame(int width, int height, int numMines) {
        super(width, height, numMines);
        scanner = new Scanner(System.in);
    }

    @Override
    protected void finalize() {
        scanner.close();
    }

    protected void onWin() {
        System.out.println("You won, congratulations!");
        printBoard();
    }

    protected void onLose() {
        System.out.println("BOOM!!!");
        printBoard();
    }

    protected void onMark(Coord coord) { 
        System.out.println("Coordinate " + coord.toString() + " marked.");
        play();
    }

    protected void onUnmark(Coord coord) { 
        System.out.println("Coordinate " + coord.toString() + " unmarked.");
        play();
    }

    protected void onStep(Map<Coord, Integer> visitedSquares) {
        int size = visitedSquares.size();
        switch (size) {
            case 0: System.out.println("Well that did nothing..."); break;
            case 1: System.out.println("So far so good..."); break;
            default: System.out.println("Wohooo, cleared " + size + " squares!");
        }
        play();
    }

    protected void onSkip() {
        System.out.println("Well that did nothing...");
    }
    
    private void parseInput(String input) {
        String[] data = input.split(" ");
        try {
            int x = Integer.parseInt(data[1]);
            int y = Integer.parseInt(data[2]);
            Coord coord = new Coord(x, y);
            String command = data[0];
            switch (command) {
                case "step" : step(coord); break;
                case "mark" : markSquare(coord); break;
                default : 
                    System.out.println("Invalid command: " + command);
                    parseInput(scanner.nextLine());
            }
        }
        catch(NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
            parseInput(scanner.nextLine());
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input: " + input);
            parseInput(scanner.nextLine());
        }

    }

    private int midDigit(int number, int pos) {
        for(int i = 0; i < pos; i++) {
            number /= 10;
        }
        return number % 10; 
    }

    private static int pow(int a, int b) {
        return (int)Math.round(Math.pow(a, b));
    }

    private static int log10(int a) {
        return (int)(Math.log10(a));
    }

    private String spaces(int num) {
        String result = "";
        for(int i = 0; i < num; i++) { result += " "; }
        return result;
    }

    private String verticalNumbers(int num, String spaces) {
        String result = "";
        for(int i = log10(num); i >= 0; i--) {
            result += spaces;
            int p = pow(10, i);
            for(int j = 0; j < num; j++) {
                int digit = midDigit (j, i);
                result += digit == 0 && i > 0 && p > j ? " " : digit;
                result += " ";
            }
            result += "\n";
        }
        return result;
    }

    private String horizontalNumber(int num, int size) {
        String result = "";
        int numSize = num == 0 ? 0 : log10(num); 

        for(int i = 0; i < size - numSize; i++) { result += " "; }
        result += num;

        return result;
    }

    private String widthBar() {
        String result = "";
        for(int i = 0; i < getWidth(); i++) result += "──";
        return result;
    }

    private String squareToString(Coord coord) {
        if (isMarked(coord)) return "?";
        if (hasMine(coord)) return "*";
        
        int result = adjacentMines(coord);
        switch (result) {
            case -1: return "·";
            case 0: return " ";
            default: return Integer.toString(result);
        }
    }

    private void printBoard() {
        String result = "";
        int width = getWidth();
        int height = getHeight();
        int hsize = log10(height);

        String wb = widthBar();
        String spaces = spaces(hsize + 2);

        result += verticalNumbers(width, spaces + "  ");
        result += spaces + "┌" + wb + "─┐\n";
        for(int y = 0; y < height; y++) {
            result += horizontalNumber(y, hsize) + " │ ";
            for(int x = 0; x < width; x++) {
                result += squareToString(new Coord (x, y)) + " ";
            }
            result += "│\n";
        }
        result += spaces + "└" + wb + "─┘";
        
        System.out.println(result);
    }

    private void printIntro() {
        System.out.println 
        ("Welcome to MineSweeper!\n\n" +
         "Run using the following commands\n" +
         "step <x> <y> -- step on coordinate (x, y)\n" +
         "mark <x> <y> -- mark or unmark the coordinate (x, y). A marked coordinate cannot be stepped on or revealed\n\n" + 
         "examples:\n" +
         "mark 5 3\n" +
         "step 0 0\n\n");

    }

    public void startGame() {
        printIntro();
        play();
    }

    private void play() {
        printBoard();
        parseInput(scanner.nextLine());
    }

}
