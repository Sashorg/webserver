import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 * Created by tmp on 21.04.2016.
 */
public class webserver {
    public static void main(String[] args) throws Exception {
        Server server =new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();
        server.setHandler(handler);
        handler.addServlet(HelloServlet.class,"/path1");
        server.start();
    }
}
