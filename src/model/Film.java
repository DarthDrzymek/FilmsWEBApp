package model;

public class Film {
    private int id;
    private String name;
    private String director;
    private String description;
    private int year;
    private String img;

    public Film() {
    }

    public Film(int id, String name, String director, String description, int year, String img) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.description = description;
        this.year = year;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
