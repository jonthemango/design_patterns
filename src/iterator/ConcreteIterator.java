package iterator;

public class ConcreteIterator<Item> implements Iterator {
    private Aggregate<Item> aggregate;
    private int current;
    public ConcreteIterator(Aggregate<Item> aggregate){
        this.aggregate = aggregate;
        current = 0;
    }

    @Override
    public boolean hasNext() {
        try{
            if (aggregate.get(current) != null) {
                return true;
            }
            return false;
        } catch(Exception e) {
            return false;
        }
    }

    @Override
    public Item next() {
        Item item = aggregate.get(current);
        current = current + 1;
        return item;
    }

    @Override
    public Item first() {
        return aggregate.get(0);
    }
}
