package observerpattern.solution;


public interface Subject {

    void attachObserver(Observer observer);// adds an observer

    void detachObserver(Observer observer); // removes an observer

    void change();// class the observers update method

}
