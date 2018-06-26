package control;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddFilm")
public class AddFilm extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String year = request.getParameter("year");
        String director = request.getParameter("director");
        String desc = request.getParameter("desc");
        String img = request.getParameter("img");
        System.out.println(title+year+director+desc+img);
        String message=null;
        request.setAttribute("Message",message);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }


}
