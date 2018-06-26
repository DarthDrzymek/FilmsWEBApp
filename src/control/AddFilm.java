package control;

import model.Film;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/AddFilm")
public class AddFilm extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message=null;
        try {
        String title = request.getParameter("title");
        String year = request.getParameter("year");
        int director = Integer.valueOf(request.getParameter("director"));
        String desc = request.getParameter("desc");
        String img = request.getParameter("img");
        Film film = new Film(title,director,desc,year,img);
            FIlmDAO fIlmDAO=new FIlmDAO();
            fIlmDAO.saveFilm(film);
            message="added";
        } catch (Exception e) {
            e.printStackTrace();
            message="error";
        }
        request.setAttribute("Message",message);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }


}
