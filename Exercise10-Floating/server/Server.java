import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Server {
  static final int PORT = 8080;
  static final String CHARSET = StandardCharsets.UTF_8.name();

  public Server() throws IOException {
    HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);
    server.createContext("/", io -> handleRequest(io));
    server.start();
  }

  private void handleRequest(HttpExchange io) {
    var request = io.getRequestURI().getPath();
	if (request.equals("/")) request = "/index.html";
    System.out.print("Request for " + request);
	var query = io.getRequestURI().getQuery();
	if (query != null) System.out.print(" with query "+ query);

	String filename = "web" + request;
	String mime = "text/plain";
	if (request.endsWith(".html")) mime = "text/html";
	else if (request.endsWith(".js")) mime = "application/javascript";
	else if (request.endsWith(".css")) mime = "text/css";
	else if (request.endsWith(".ico")) mime = "image/x-icon";
	System.out.println(", mime type "+ mime);

    try {
      var filecontent = Files.readString(Paths.get(filename));
      respond(io, 200, mime, filecontent);
    } catch (IOException e) {
      respond(io, 404, "text/plain", "404: File not found");
    }
  }

  private void respond(HttpExchange io, int code, String mime, String response) {
    try {
      io.getResponseHeaders()
          .set("Content-Type", String.format("%s; charset=%s", mime, CHARSET));
      io.sendResponseHeaders(code, response.getBytes(CHARSET).length);
      io.getResponseBody().write(response.getBytes(CHARSET));
    } catch (Exception e) {
    } finally {
      io.close();
    }
  }

  public static void main(final String... args) throws IOException {
    new Server();
	System.out.println("Waiting for http requests on port " + PORT);
  }
}
