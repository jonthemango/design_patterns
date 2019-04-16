package memento;

public class Memento {

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public void setState2(int state2) {
        this.state2 = state2;
    }

    public void setState3(boolean state3) {
        this.state3 = state3;
    }

    // state of the object
    private String state1;
    private int state2;
    private boolean state3;

    public Memento(String state1, int state2, boolean state3) {
        this.setState1(state1);
        this.setState2(state2);
        this.setState3(state3);
    }

    public String getState1() {
        return state1;
    }

    public int getState2() {
        return state2;
    }

    public boolean getState3() {
        return state3;
    }

    @Override
    public String toString() {
        return this.state1 + " " + this.state2 + " " + this.state3;
    }


}
