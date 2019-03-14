package decorator;

public class ConcreteComponent extends Component {

    @Override
    public void methodA() {
        System.out.println("ConcreteComponent: method A invoked");
    }

    @Override
    public void methodB() {
        System.out.println("ConcreteComponent: method B invoked");
    }
}
