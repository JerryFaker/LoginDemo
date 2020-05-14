import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;

public class PassServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("pwd");
        String captcha = request.getParameter("captcha");
        HttpSession session = request.getSession();
        String realCaptcha = (String)session.getAttribute("value");
        response.setContentType("text/html;charset=UTF-8");
        if (!name.equals("username")||!password.equals("password")) {
            response.getWriter().println("<h1>用户名或密码错误!</h1>");
        } else if (!captcha.equals(realCaptcha)) {
            response.getWriter().println("<h1>验证码错误!</h1>");
        } else {
            response.getWriter().println("<h1>登陆成功!</h1>");
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        Captcha c = new Captcha();
        HttpSession session = request.getSession();
        session.setAttribute("value",c.getStr());
        response.setContentType("image/png");
        ImageIO.write(c.getImg(),"png",response.getOutputStream());
    }

}
