package state;

public interface StateGate {

    void enter();
    void payOk();
    void payFailed();
}
