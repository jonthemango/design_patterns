package bridge;

import javax.swing.text.View;

public class Client {
    public static void main(String args[]){
        Book book = new Book("HP", "2018","Book about Magic.", "99");
        Artist artist = new Artist("Drake", "Lots of music", "2020","Hits"); // Book and Artist share NO inheritance hierachy.

        MediaResourceImplementor bookImplementor = new BookImplementor(book);
        MediaResourceImplementor artistImplementor = new ArtistImplementor(artist);

        // We are able to compose this functionality together (here it's contrived cause 2+2 == 2*2 but if we had
        // 5 implementors and 10 views you can see how 5*10 >>> 5+10. We are able to compose objects to what
        // behavior we want them to have.
        ViewAbstraction longViewBook = new LongViewAbstraction(bookImplementor);
        ViewAbstraction longViewArtist = new LongViewAbstraction(artistImplementor);

        ViewAbstraction shortViewBook = new ShortViewAbstraction(bookImplementor);
        ViewAbstraction shortViewArtist = new ShortViewAbstraction(artistImplementor);


        longViewArtist.show();
        longViewBook.show();
        shortViewArtist.show();
        shortViewBook.show();

    }
}
