package iterator;

public interface Iterator<I> {
    boolean hasNext();
    I next();
    I first();
}
