import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        WebGame game = new WebGame(7, 7, 5);
        WebServer server = new WebServer(game::play);
        game.setServer(server);
        // TextGame game = new TextGame(7, 7, 5);
        // game.startGame();

    }
}
