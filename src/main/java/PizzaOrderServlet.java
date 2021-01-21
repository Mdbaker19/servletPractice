import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizzaOrder")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletResponse res, HttpServletRequest req) throws IOException, ServletException{
//        res.setContentType("text/html");
//        PrintWriter out = res.getWriter();
//        String topping = req.getParameter("topping");
//        String crust = req.getParameter("crust");
//        String sauce = req.getParameter("sauce");
//        String size = req.getParameter("size");
//
//
//
//        out.printf("<h1>%s%s%s%s</h1>", topping, crust, sauce, size);
    }
}
