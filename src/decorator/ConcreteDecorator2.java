package decorator;

public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component){
        this.setComponent(component);
    }

    @Override
    public void methodA() {
        System.out.println("ConcreteDecorator 2: method A invoked");
        this.getComponent().methodA();
    }

    @Override
    public void methodB() {
        System.out.println("ConcreteDecorator 2: method B invoked");
        this.getComponent().methodB();
    }
}
