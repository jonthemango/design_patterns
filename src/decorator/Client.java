package decorator;

public class Client {
    public static void main(String args[]){
        Component component = new ConcreteComponent();

        Decorator dec1 = new ConcreteDecorator1(component);
        Decorator dec2 = new ConcreteDecorator2(dec1);
        Decorator dec3 = new ConcreteDecorator1(dec2);
        dec3.methodA();
    }
}
