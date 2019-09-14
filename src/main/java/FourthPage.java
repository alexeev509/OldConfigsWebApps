import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FourthPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Path of the context: " + getServletContext().getRealPath(req.getServletPath()));
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String message = "Hi";
        try {
            writer.write("<h2>" + message + "</h2>");
            writer.flush();
        } finally {
            writer.close();
        }

    }
}
