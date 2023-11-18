import com.sun.net.httpserver.HttpExchange;
import java.util.Map;

public class WebGame extends MineSweeper {
    private String message;
    private WebServer server;

    public WebGame(int width, int height, int numMines) {
        super(width, height, numMines);

        message = "Welcome to MineSweeper!";
    }  

    public void setServer(WebServer server) {
        this.server = server;
    }

    protected void onWin() { 
        message = "You won, congratulations!";
    }

    protected void onLose() { 
        message = "BOOM!!!";
    }

    protected void onMark(Coord coord) { 
        message = "Coordinate " + coord.toString() + " marked.";
    }

    protected void onUnmark(Coord coord) { 
        message = "Coordinate " + coord.toString() + " unmarked.";
    }

    protected void onSkip() {
        message = "Well that did nothing...";
    }

    protected void onStep(Map<Coord, Integer> visitedSquares) { 
        int size = visitedSquares.size();
        switch (size) {
            case 0: message = "Well that did nothing..."; break;
            case 1: message = "So far so good..."; break;
            default: message = "Wohooo, cleared " + size + " squares!";
        }
    }

    private String squareToCell(Coord coord) {
        String link = "http://localhost:" + WebServer.PORT;
        String coordData = "&x=" + coord.getX() + "&y=" + coord.getY();
        String result = "<td";
        if (!isGameOver()) { 
            result += " oncontextmenu=\"window.location.replace('" + link + "?action=mark" + coordData + "'); return false;\"";
        }
        result += ">";
        if (isMarked(coord)) result += "?";
        else if (hasMine(coord)) result += "*";
      
        else {
            int adjacentMines = adjacentMines(coord);
            switch (adjacentMines) {
                case -1: 
                    if (this.isGameOver()) { 
                        result += "·"; 
                    } else {
                        result += "<a href=" + link + "?action=step" + coordData + ">·</a>";
                    }
                    break;
                case 0: break;
                default: result += Integer.toString(adjacentMines);
            }
        }    
        return result;
    }

    private String boardToTable() { 

        String result = "<table>";
        for(int y = 0; y < getHeight(); y++) {
            result += "<tr>";
            for(int x = 0; x < getWidth(); x++) {
                result += squareToCell(new Coord (x, y));
            }
            result += "</tr>";
        }

        result += "</table>";
        return result;
    
    }

    private String page() {
        String title = "<title>Welcome to MineSweeper</title>";
        String css = "<link rel=\"stylesheet\" href=\"style.css\"></link>";
        String head = "<head>" + title + css + "</head>";
      
        String header = "<h1>" + message + "</h1>";
        String table = boardToTable();
        String body = "<body>" + header + table + "</body>";
        return "<html>" + head + body + "</html>";
    }

    private void parseQuery(String query) {
      if (query == null) { return; }
      String[] data = query.split("&");
      try {
            int x = Integer.parseInt(data[1].split("=")[1]);
            int y = Integer.parseInt(data[2].split("=")[1]);
            Coord coord = new Coord(x, y);
            String command = data[0].split("=")[1];
            switch (command) {
                case "step" : step(coord); break;
                case "mark" : markSquare(coord); break;
                default : 
                    System.out.println("Invalid command: " + command);
            }
      }
      catch(NumberFormatException e) {
          System.out.println("Invalid input: " + e.getMessage());
      }
      catch(ArrayIndexOutOfBoundsException e) {
          System.out.println("Invalid input: " + query);
      }

    }
  
    public void play(HttpExchange io) {
        var senderIP = io.getRemoteAddress().getAddress();
        var request = io.getRequestURI().getPath();
        var query = io.getRequestURI().getQuery();
        System.out.println("Connection from " + senderIP + " for " + request + "with query: " + query);

        parseQuery(query);
        
        server.respond(io, 200, "text/html", page());
    }

}
