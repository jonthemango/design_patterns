package decorator;

public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component){
        this.setComponent(component);
    }


    @Override
    public void methodA() {
        System.out.println("ConcreteDecorator 1: method A invoked");
        this.getComponent().methodA();
    }

    @Override
    public void methodB() {
        System.out.println("ConcreteDecorator 1: method B invoked");
        this.getComponent().methodA();
    }
}
