package bridge;

public class ShortViewAbstraction extends ViewAbstraction {

    public ShortViewAbstraction(MediaResourceImplementor i){
        super(i);
    }

    @Override
    public void show() {
        this.implementor.title();
        this.implementor.snippet();
    }
}
