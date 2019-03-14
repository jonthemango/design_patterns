package factory;

public class Client {
    public static void main(String args[]){

        int input = 3;
        Product p;
        Creator creator;
        if (input % 2 == 0){
            creator = new ConcreteFactory();
        } else {
            creator = new ConcreteFactory2();
        }
        p = creator.create();

        p.cost(); // no one knows the type of p

    }
}
