package bridge;

public class Book {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    private String year;

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public String getNoPages() {
        return noPages;
    }

    public void setNoPages(String noPages) {
        this.noPages = noPages;
    }

    private String noPages;

    public Book(String name, String year, String description, String noPages){
        this.name = name;
        this.year = year;
        this.description = description;
        this.noPages = noPages;
    }
}
