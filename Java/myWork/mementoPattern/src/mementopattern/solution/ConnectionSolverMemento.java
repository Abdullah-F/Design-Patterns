package mementopattern.solution;


import java.awt.geom.Point2D;
// a memento class that hods the state of the connection solver
public class ConnectionSolverMemento {

    private Point2D firstPoint;

    private Point2D secondPoint;


    public ConnectionSolverMemento(Point2D firstPoint, Point2D secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Point2D getFirstPoint() {
        return firstPoint;
    }

    public Point2D getSecondPoint() {
        return secondPoint;
    }
}
