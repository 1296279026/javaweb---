import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "login", value = "/login")
public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String method = request.getMethod();

        System.out.println(method);
        System.out.println(username);
        System.out.println(password);

        String[] values = request.getParameterValues("hob");
        System.out.println(Arrays.toString(values));
        System.out.println();
        //请求转发
       // request.getRequestDispatcher(request.getContextPath() + "success.jsp").forward(request, response);

        //重定向
        response.sendRedirect(request.getContextPath()+"chongdingxiang.jsp");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
