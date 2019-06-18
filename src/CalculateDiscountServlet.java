import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateDiscountServlet", urlPatterns = "/display-discount")
public class CalculateDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));
        float amount = price * discount / 100f * 0.1f;
        float discountPrice = price - amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>List price: " + price + "</h1><br/>");
        writer.println("<h1>Discount: " + discount + "%</h1><br/>");
        writer.println("<h1>Discount Amount: " + amount + "</h1><br/>");
        writer.println("<h1>Discount price: " + discountPrice + "</h1><br/>");

        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));
        float amount = price * discount / 100f * 0.1f;
        float discountPrice = price - amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>List price: " + price + "</h1><br/>");
        writer.println("<h1>Discount: " + discount + "%</h1><br/>");
        writer.println("<h1>Discount Amount: " + amount + "</h1><br/>");
        writer.println("<h1>Discount price: " + discountPrice + "</h1><br/>");

        writer.println("</html>");

    }
}
