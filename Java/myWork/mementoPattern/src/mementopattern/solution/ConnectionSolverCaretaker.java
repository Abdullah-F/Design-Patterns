package mementopattern.solution;

/**
 * 
 * @author abdullah-fadhel
 * this class is responsible for mementos management
 * it preserves encapsulation
 */
public class ConnectionSolverCaretaker {

    private ConnectionSolverMemento connectionSolverMemento;

    public void saveState(ConnectionSolver connectionSolver){// saves a memento
        connectionSolverMemento = connectionSolver.createMemento();
    }

    public void restoreState(ConnectionSolver connectionSolver){//re aplies the memento

        connectionSolver.setMemento(connectionSolverMemento);

    }


}
