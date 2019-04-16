package state;

public class Client {
    public static void main(String[] args){
        ContextGate myGate = new ContextGate(); // Starts in closed State

        myGate.enter(); // State: CLOSED. Transition: enter. Next State: CLOSED
        myGate.payFailed(); // State: CLOSED. Transition: payFailed. Next State: CLOSED
        myGate.payOk(); // State: CLOSED. Transition: payOk. Next State: OPEN
        myGate.enter(); // State: OPEN. Transition: enter. Next State: CLOSED
        myGate.payFailed(); // State: CLOSED. Transition: payFailed. Next State: CLOSED
        myGate.payOk(); // State: CLOSED. Transition: payOk. Next State: OPEN
        myGate.enter(); // State: OPEN. Transition: enter. Next State: CLOSED


        /***
         * Gate is state machine
         *
         * 2 state: CLOSED & OPEN
         * 3 transitions: payOk, payFailed, enter
         *
         * CLOSED, payOk => OPEN
         * CLOSED, payFailed => CLOSED
         * CLOSED, enter => CLOSED
         * OPEN, enter => CLOSED
         * OPEN payOK => CLOSED
         * OPEN, payFailed => OPEN
         */
    }
}
