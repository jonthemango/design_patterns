package state;


public class StateOpenGate implements StateGate {

    private ContextGate gate;

    public StateOpenGate (ContextGate gate){
        this.gate = gate;
    }

    @Override
    public void enter() {
        System.out.println("State: OPEN. Transition: enter. Next State: CLOSED");
        this.gate.setState(new StateClosedGate(this.gate));
    }

    @Override
    public void payOk() {
        System.out.println("State: OPEN. Transition: payOk. Next State: CLOSED");
        this.gate.setState(new StateClosedGate(this.gate));
    }

    @Override
    public void payFailed() {
        System.out.println("State: OPEN. Transition: payFailed. Next State: OPEN");
        this.gate.setState(new StateOpenGate(this.gate));
    }
}
