import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HomeServlet", urlPatterns = "/pizzaOrder")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//        String name = req.getParameter("name");
//        if(name == null){
//            name = "World!";
//        } else if(name.equals("bgates")){
//            res.sendRedirect("https://microsoft.com");
//            return;
//        }
//        req.setAttribute("name", name);
//        req.getRequestDispatcher("/home.jsp").forward(req, res); // usually the last line in a do get post method
//        // the /home is path when starting from the webApp dir
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String topping = req.getParameter("topping");
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String size = req.getParameter("size");



        out.printf("<h1>%s%s%s%s</h1>", topping, crust, sauce, size);
    }

}
