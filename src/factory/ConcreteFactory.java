package factory;

public class ConcreteFactory implements Creator {

    @Override
    public Product create() {
        return new ConcreteProduct(99);
    }

}
