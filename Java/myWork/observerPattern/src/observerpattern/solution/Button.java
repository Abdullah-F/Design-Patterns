package observerpattern.solution;


import java.util.ArrayList;

/**
 * the button here in a concrete subject to be observed
 * @author abdullah-fadhel
 */
public class Button implements Subject{

    java.util.List<Observer> observers = new ArrayList<Observer>();

    /**
     * here the click method logic only is to call the change method from 
     * the subject class 
     */
    public void clicked(){

        change();

    }

    @Override
    public void attachObserver(Observer observer) {
        this.observers.add(observer);// adds an observer
    }

    @Override
    public void detachObserver(Observer observer) {
        this.observers.remove(observer);// removes an observer
    }

    @Override
    public void change() { // calls the update method on observers
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
