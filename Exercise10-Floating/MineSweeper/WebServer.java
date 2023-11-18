import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WebServer {
  public static final int PORT = 8080;
  private static final int BACKLOG = 100;
  private static final Charset CHARSET = StandardCharsets.UTF_8;


  public WebServer(HttpHandler handler) throws IOException {
    HttpServer server = HttpServer.create(new InetSocketAddress(PORT), BACKLOG);
    server.createContext("/", handler);
    server.createContext("/index.html", io -> file(io, "text/html", "web/index.html"));
    server.createContext("/code.js", io -> file(io, "application/javascript", "web/code.js"));
    server.createContext("/style.css", io -> file(io, "web/style.css", "web/style.css"));
    server.start();
  }  

  private void file(HttpExchange io, String mime, String filename) {
    System.out.println("Loading: " + filename);
    try {
      var filecontent = Files.readString(Paths.get(filename));
      respond(io, 200, mime, filecontent);
    } catch (IOException e) {
      respond(io, 404, "text/plain", "File not found");
    }
  }
  
  public void respond(HttpExchange io, int code, String mime, String response) {
    try {
      io.getResponseHeaders()
          .set("Content-Type", String.format("%s; charset=%s", mime, CHARSET.name()));
      io.sendResponseHeaders(code, response.getBytes(CHARSET.name()).length);
      io.getResponseBody().write(response.getBytes(CHARSET.name()));
    } catch (Exception e) {
    } finally {
      io.close();
    }
  }

  
}
