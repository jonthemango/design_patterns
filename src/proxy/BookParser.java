package proxy;


public class BookParser implements IBookParser {

    public BookParser(String book){

        // heavy computation
        for(int i=0;i<99999999;i++);

        System.out.println("Book parser created: " + book);

    }

    public void parse() {
        System.out.println("Book Parsing complete. ");
    }
}
