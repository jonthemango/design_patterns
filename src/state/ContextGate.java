package state;

public class ContextGate {
    /**
     *
     * Represents a turnstyle type gate.
     *
     */



    private StateGate state;

    public ContextGate(){
        this.setState(new StateClosedGate(this));
    }

    public ContextGate(StateGate initial){
        this.setState(initial);
    }

    public void setState(StateGate nextState){
        this.state = nextState;
    }

    public void enter(){
        this.state.enter();
    }

    public void payFailed(){
        this.state.payFailed();
    }

    public void payOk(){
        this.state.payOk();
    }
}
