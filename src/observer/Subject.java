package observer;

import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> observers;

    public Subject(){
        this.observers = new ArrayList<Observer>();
    }

    public void attachObserver(Observer o){
        this.observers.add(o);
        System.out.println(o.toString() + " was attached to Subject.");
    }

    public void detachObserver(Observer o){
        this.observers.remove(o);
        System.out.println(o.toString() + " was removed from Subject.");
    }

    public void notifyObservers(){
        for (Observer o : this.observers){
            o.update();
        }
    }
}
