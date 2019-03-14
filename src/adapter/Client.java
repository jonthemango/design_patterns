package adapter;

public class Client {
    public static void main(String args[]){
        Target target = new Adapter(new Adaptee());
        target.request(); // Adaptee().specific_request() is invoked
    }
}
