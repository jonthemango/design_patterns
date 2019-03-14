package proxy;

public class Client {
    public static void main(String args[]){
        IBookParser parser = new Proxy("example book");
        parser.parse();
    }
}
