package memento;

public class Caretaker {
    public static void main(String args[]){
        Originator originator = new Originator();

        originator.setState("myState",99, false); // setting state of originator
        System.out.println("Initial state of originator: " + originator.toString());

        Memento m = originator.createMemento();

        originator.setState("newState", 98, true); // re setting state or originator
        System.out.println("State of originator after settingState: " + originator.toString());


        originator.setMemento(m);
        System.out.println("State of originator after settingMemento: " + originator.toString());

    }
}
