
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tmp on 21.04.2016. cntl + O, cntrl alv v
 */
public class HelloServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        Map<String, Object> data = new HashMap<String, Object>();
        TemplateUtil.render("hello.html",data,resp.getWriter());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        resp.setCharacterEncoding("UTF-8");
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("username",name);
        TemplateUtil.render("hello.html",data,resp.getWriter());
    }
}
