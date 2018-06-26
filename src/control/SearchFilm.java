package control;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SearchFilm")
public class SearchFilm extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchField = request.getParameter("searchField");
        String searchSelection = request.getParameter("searchParam").toString();
        System.out.println(searchSelection);
        System.out.println(searchField);
        String jobCat = request.getParameter("jobCat");
        System.out.println(jobCat);
    }

}
