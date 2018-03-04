package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String piccode = request.getSession().getAttribute("piccode").toString();
        String checkcode = request.getParameter("checkcode");
        checkcode = checkcode.toUpperCase();
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = response.getWriter();
        if(piccode.equals(checkcode)){
            printWriter.println("验证码输入正确");
        }
        else {
            printWriter.println("验证码输入错误");
        }
        printWriter.flush();
        printWriter.close();
    }
}
