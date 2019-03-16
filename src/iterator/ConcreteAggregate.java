package iterator;


import java.util.ArrayList;

public class ConcreteAggregate extends Aggregate {

    private ArrayList<String> items;
    private Iterator<String> iterator;

    public ConcreteAggregate(){
        items = new ArrayList<String>();
        iterator = null;
    }

    @Override
    void add(Object i) {
        this.items.add((String)i);
    }

    @Override
    Iterator iterator() {
        if (this.iterator == null){
            this.iterator = new ConcreteIterator<String>(this);
        }
        return this.iterator;
    }

    @Override
    void remove(Object i) {
        this.items.remove((String)i);
    }


    @Override
    int size() {
        return 0;
    }

    @Override
    Object get(int i) {
        return items.get(i);
    }
}
