package bridge;

public class LongViewAbstraction extends ViewAbstraction {

    public LongViewAbstraction(MediaResourceImplementor i){
        super(i);
    }

    @Override
    public void show() {
        this.implementor.title();
        this.implementor.image();
        this.implementor.url();
        this.implementor.snippet();
    }
}
