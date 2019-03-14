package proxy;

public class Proxy implements IBookParser {
    private BookParser parser;
    private String book;

    public Proxy(String book){
        // not expensive
        this.parser = null;
        this.book = book;
        System.out.println("Proxy created.");
    }

    public void parse(){
        System.out.println("Proxy.parse() invoked.");
        if (parser == null){
            this.parser = new BookParser(this.book);
            System.out.println("Proxy created Book Parser");
        }
        System.out.println("Proxy invoking parse on Book Parser.");
        this.parser.parse();
    }
}
