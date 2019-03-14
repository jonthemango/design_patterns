package adapter;

public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("Adapter wraps Adaptee.");
        adaptee.specific_request();
        System.out.println("Adapter wraps Adaptee.");
    }

}
