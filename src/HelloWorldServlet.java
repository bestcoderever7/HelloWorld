import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Created by league on 10/30/16.
 */
public class HelloWorldServlet extends HttpServlet {
    static int counter = 9000;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getQueryString();
        PrintWriter responseStream = response.getWriter();
        responseStream.println("<html>");
        responseStream.println("<title>This is the title of my thing so yeah</title>");
        responseStream.println("<head>Yo what up its ya boy HTML here back with a bomb new prank</head>");
        responseStream.println("<h1>Hello</h1>");
        responseStream.println("<p>Hey guys to see my awesome new prank click <a href = \"http://www.youtube.com/watch?v=dQw4w9WgXcQ\">here</a></p>");
        responseStream.println("</body>");
        responseStream.println("</html>");
    }
}
