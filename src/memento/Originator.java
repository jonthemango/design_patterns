package memento;

public class Originator {

    // state of the object
    private String state1;
    private int state2;
    private boolean state3;

    public void setState(String state1, int state2, boolean state3){
        this.state3 = state3;
        this.state2 = state2;
        this.state1 = state1;
    }

    public void setMemento(Memento m){
        this.state1 = m.getState1();
        this.state2 = m.getState2();
        this.state3 = m.getState3();
    }

    public Memento createMemento(){
        return new Memento(state1, state2, state3);
    }

    @Override
    public String toString() {
        return this.state1 + " " + this.state2 + " " + this.state3;
    }
}
