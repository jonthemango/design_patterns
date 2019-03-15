package bridge;

public class ArtistImplementor implements MediaResourceImplementor  {

    private Artist artist;
    public ArtistImplementor(Artist artist){
        this.artist = artist;
    }
    @Override
    public void snippet() {
        System.out.println("ArtistImplementor snippet: " + artist.getAlbums());
    }

    @Override
    public void url() {
        System.out.println("ArtistImplementor url: " + artist.getSongs() + ".com");
    }

    @Override
    public void title() {
        System.out.println("ArtistImplementor title: " + artist.getName());
    }

    @Override
    public void image() {
        System.out.println("ArtistImplementor image: " + artist.getName() + ".jpg");
    }
}
