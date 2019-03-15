package bridge;

import javax.swing.text.View;

public abstract class ViewAbstraction {
    MediaResourceImplementor implementor;

    ViewAbstraction(MediaResourceImplementor i){
        this.implementor = i;
    }

    ViewAbstraction(){
        this.implementor = null;
    }

    abstract void show();
}
