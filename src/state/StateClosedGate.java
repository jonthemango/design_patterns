package state;

public class StateClosedGate implements StateGate {

    private ContextGate gate;

    public StateClosedGate(ContextGate gate){
        this.gate = gate;
    }

    @Override
    public void enter() {
        System.out.println("State: CLOSED. Transition: enter. Next State: CLOSED");
        this.gate.setState(new StateClosedGate(this.gate));
    }

    @Override
    public void payOk() {
        System.out.println("State: CLOSED. Transition: payOk. Next State: OPEN");
        this.gate.setState(new StateOpenGate(this.gate));
    }

    @Override
    public void payFailed() {
        System.out.println("State: CLOSED. Transition: payFailed. Next State: CLOSED");
        this.gate.setState(new StateClosedGate(this.gate));
    }
}
