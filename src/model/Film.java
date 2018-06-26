package model;

public class Film {
    private int id;
    private String name;
    private int director;
    private String description;
    private String year;
    private String img;

    public Film() {
    }

    public Film( String name, int director, String description, String year, String img) {
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

    public int getDirector() {
        return director;
    }

    public void setDirector(int director) {
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", director=" + director +
                ", description='" + description + '\'' +
                ", year='" + year + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
