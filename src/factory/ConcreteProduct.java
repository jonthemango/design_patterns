package factory;


public class ConcreteProduct implements Product {

    private float cost;

    public ConcreteProduct(float cost){
        this.cost = cost;
    }

    @Override
    public Float cost() {
        System.out.println(cost);
        return this.cost;
    }
}
