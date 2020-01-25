package mementopattern.solution;


import java.awt.geom.Point2D;

public class ConnectionSolver {

    private Point2D firstPoint;// point one in space

    private Point2D secondPoint;//pint two in space

/**
 * this method calculates the line distance between the two points
 */
    public void calculateLine(){

        System.out.println("Calculate line between: "+firstPoint+" and "+secondPoint);

    }

    public ConnectionSolverMemento createMemento(){// creates a memento
        return new ConnectionSolverMemento(firstPoint,secondPoint);
    }


    public void setMemento(ConnectionSolverMemento memento){// sets the memento
        firstPoint = memento.getFirstPoint();
        secondPoint = memento.getSecondPoint();
    }


    public void setFirstPoint(Point2D firstPoint) {
        this.firstPoint = firstPoint;
    }

    public void setSecondPoint(Point2D secondPoint) {
        this.secondPoint = secondPoint;
    }
}
