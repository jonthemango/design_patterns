package iterator;

public abstract class Aggregate<Item> {
    abstract void add(Item i);
    abstract Iterator<Item> iterator();
    abstract void remove(Item i);
    abstract int size();
    abstract Item get(int i);
}
