import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

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
        Map<String, String[]> parameterMap = request.getParameterMap();
        Set<String> keys = parameterMap.keySet();
        for (String key : keys) {

            String[] value = parameterMap.get(key);

            System.out.println(key + " = " + value[0]);

        }

        String[] values = request.getParameterValues("hob");
        System.out.println(Arrays.toString(values));
        System.out.println();

        if (request.getParameter("username").equalsIgnoreCase("zs")) {
            //请求转发
            request.getRequestDispatcher(request.getContextPath() + "success.jsp").forward(request, response);

        } else {
            //重定向
            response.sendRedirect(request.getContextPath() + "chongdingxiang.jsp");

        }
//        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100);
//        //图形验证码写出，可以写出到文件，也可以写出到流
//        lineCaptcha.write("d:/line.png");
        //


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
