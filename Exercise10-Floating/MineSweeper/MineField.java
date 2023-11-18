import java.util.Random;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class MineField {
    private int height;
    private int width;
    private Set<Coord> field;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getNumMines() {
        return field.size();
    }

    private void populateField(int numMines) {
        Random rnd = new Random();
        List<Coord> coords = new ArrayList<Coord>();

        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                coords.add(new Coord(i, j));
            }
        }

        for (int i = 0; i < numMines; i++) {
            int index = rnd.nextInt(coords.size());
            Coord coord = coords.remove(index);
            field.add(coord);
        }
    }

    public MineField(int width, int height, int numMines) {
        this.width = width;
        this.height = height;
        field = new HashSet<Coord>();
        populateField(numMines);
    }

    public boolean hasMine(Coord coord) {
        return field.contains(coord);
    }

    public boolean inside(Coord coord) {
        int x = coord.getX();
        int y = coord.getY();

        return x >= 0 && y >= 0 && x < width && y < height;
    }

    public int adjacentMines(Coord coord) {
        int result = 0;
        for(int i = -1; i <= 1; i++) {
            for(int j = -1; j <= 1; j++) {
                Coord newCoord = coord.offset(i, j);
                result += hasMine(newCoord) ? 1 : 0;
            }
        }

        return result;
    }
}