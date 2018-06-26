package control;

import model.Film;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/SearchFilm")
public class SearchFilm extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchField = request.getParameter("searchField");
        String searchSelection = request.getParameter("searchParam");
        ArrayList<Film> films=new ArrayList<>();
        try {
            FIlmDAO dao=new FIlmDAO();
            if (searchSelection.equals("Name")){
               films=dao.readByTitle(searchField);
            }else if (searchSelection.equals("Director")){
                films=dao.readByDirector(Integer.valueOf(searchField));
            }else if (searchSelection.equals("Year")){
                films=dao.readByYear(searchField);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (films.size()==0){
            response.sendRedirect("/nothingSearched.jsp");
        }else{
        for (Film film: films){
            System.out.println(film.toString());
        }
        request.setAttribute("filmsList",films);
        request.getRequestDispatcher("/searchResult.jsp").forward(request, response);
        }
    }

}
