import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = "/prod")
public class ProductServlet extends HttpServlet {
    private static Logger logger = LogManager.getLogger((ProductServlet.class));


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().printf("<html><body>");
        resp.getWriter().printf("<h1>" + "PRODUCTS:" + "</h1>");
        resp.getWriter().printf("<h2>" + new Product(1,"Milk",100) + "</h2>");
        resp.getWriter().printf("<h2>" + new Product(2,"Tee",200) + "</h2>");
        resp.getWriter().printf("<h2>" +new Product(3,"Water",300) + "</h2>");
        resp.getWriter().printf("<h2>" +new Product(4,"Cake",400) + "</h2>");
        resp.getWriter().printf("<h2>" +new Product(5,"Cheese",500) + "</h2>");
        resp.getWriter().printf("<h2>" +new Product(6,"Apple",600) + "</h2>");
        resp.getWriter().printf("<h2>" +new Product(7,"Orange",700) + "</h2>");
        resp.getWriter().printf("<h2>" +new Product(8,"Juice",800) + "</h2>");
        resp.getWriter().printf("<h2>" +new Product(9,"Corn",900) + "</h2>");
        resp.getWriter().printf("<h2>" +new Product(10,"Soap",1000) + "</h2>");
        resp.getWriter().printf("</body></html>");
    }


    @Override
    public void init() throws ServletException {
        logger.debug("Init");
    }

}
