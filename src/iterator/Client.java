package iterator;

public class Client {
    public static void main(String args[]){
        Aggregate collection = new ConcreteAggregate();
        collection.add("Hello");
        collection.add("World");
        collection.add("This");
        collection.add("Seems");
        collection.add("Weird");
        
        Iterator iterator = collection.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
