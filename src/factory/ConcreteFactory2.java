package factory;

public class ConcreteFactory2 implements Creator {

    @Override
    public Product create() {
        return new ConcreteProduct(9999);
    }
}
