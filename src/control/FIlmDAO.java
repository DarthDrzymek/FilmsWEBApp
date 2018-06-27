package control;

import model.Film;

import java.sql.*;
import java.util.ArrayList;

public class FIlmDAO {
    private Connection connection;

    public static void main(String[] args) {
            try {
                FIlmDAO dao=new FIlmDAO();
                ArrayList<Film> films=dao.readByTitle("Desperado");
                for (Film film:films) {
                    System.out.println(film.toString());
                }
                ArrayList<Film> films2=dao.readByYear("1995");
                for (Film film:films2) {
                    System.out.println(film.toString());
                }
                ArrayList<Film> films3=dao.readByDirector(3);
                for (Film film:films3) {
                    System.out.println(film.toString());
                }
                Film f1=new Film("TestFIlm",3,"test","2018","no image");
                System.out.println(dao.saveFilm(f1));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

    }
    public FIlmDAO() throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/films";
        String username = "admin";
        String pass = "pass123";
        this.connection = DriverManager.getConnection(url, username, pass);
    }

    public  String saveFilm(Film film) throws SQLException {
        String SQL = "insert into FILMS(NAME,YEAR,DESCRIPTION,DIRECTOR,IMG) values (?,?,?,?,?)";
        try {
            PreparedStatement prepStmt = connection.prepareStatement(SQL);
            prepStmt.setString(1, film.getName());
            prepStmt.setString(2, film.getYear());
            prepStmt.setInt(4, film.getDirector());
            prepStmt.setString(3, film.getDescription());
            prepStmt.setString(5, film.getImg());
            prepStmt.executeUpdate();
            return "Record saved succesfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            connection.close();
        }
    }
    public ArrayList<Film> readByTitle(String s) throws SQLException {
        String sql = "select * from FILMS where name=?";
        ArrayList<Film> films = new ArrayList<>();
        try {
            PreparedStatement prepStmt = connection.prepareStatement(sql);
            prepStmt.setString(1,s);
            ResultSet result = prepStmt.executeQuery();
            while (result.next()) {
                Film film = new Film();
                film.setId(result.getInt("idFILM"));
                film.setName(result.getString("name"));
                film.setYear(result.getString("year"));
                film.setDirector(result.getInt("director"));
                film.setDescription(result.getString("description"));
                film.setImg(result.getString("img"));
                films.add(film);
            }
            return films;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            connection.close();
        }
    }

    public ArrayList<Film> readByDirector(int s) throws SQLException {
        String sql = "select * from FILMS where DIRECTOR=?";
        ArrayList<Film> films = new ArrayList<>();
        try {
            PreparedStatement prepStmt = connection.prepareStatement(sql);
            prepStmt.setInt(1,s);
            ResultSet result = prepStmt.executeQuery();
            while (result.next()) {
                Film film = new Film();
                film.setId(result.getInt("idFILM"));
                film.setName(result.getString("name"));
                film.setYear(result.getString("year"));
                film.setDirector(result.getInt("director"));
                film.setDescription(result.getString("description"));
                film.setImg(result.getString("img"));
                films.add(film);
            }
            return films;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            connection.close();
        }
    }
    public ArrayList<Film> readByYear(String s) throws SQLException {
        String sql = "select * from FILMS where YEAR=?";
        ArrayList<Film> films = new ArrayList<>();
        try {
            PreparedStatement prepStmt = connection.prepareStatement(sql);
            prepStmt.setString(1,s);
            ResultSet result = prepStmt.executeQuery();
            while (result.next()) {
                Film film = new Film();
                film.setId(result.getInt("idFILM"));
                film.setName(result.getString("name"));
                film.setYear(result.getString("year"));
                film.setDirector(result.getInt("director"));
                film.setDescription(result.getString("description"));
                film.setImg(result.getString("img"));
                films.add(film);
            }
            return films;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            connection.close();
        }
    }

    public Film readByID(int s) throws SQLException {
        String sql = "select * from FILMS where idFILM=?";
        Film film=new Film();
        try {
            PreparedStatement prepStmt = connection.prepareStatement(sql);
            prepStmt.setInt(1,s);
            ResultSet result = prepStmt.executeQuery();
            while (result.next()) {
                film.setId(result.getInt("idFILM"));
                film.setName(result.getString("name"));
                film.setYear(result.getString("year"));
                film.setDirector(result.getInt("director"));
                film.setDescription(result.getString("description"));
                film.setImg(result.getString("img"));
            }
            return film;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            connection.close();
        }
    }
}
