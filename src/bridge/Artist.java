package bridge;

public class Artist {
    private String name;
    private String albums;
    private String year;
    private String songs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbums() {
        return albums;
    }

    public void setAlbums(String albums) {
        this.albums = albums;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSongs() {
        return songs;
    }

    public void setSongs(String songs) {
        this.songs = songs;
    }

    public Artist(String name, String albums, String year, String songs){
        this.name = name;
        this.albums = albums;
        this.year = year;
        this.songs = songs;
    }
}
