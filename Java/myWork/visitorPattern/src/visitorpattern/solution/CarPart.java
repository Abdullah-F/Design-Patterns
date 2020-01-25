package visitorpattern.solution;

/**
 * 
 * @author abdullah-fadhel
 * 
 * a car part interface that only has one method ( acceptCarPartVisitor )
 */
public abstract class CarPart {

    void acceptCarPartVisitor(CarPartVisitor visitor){
        visitor.visit(this);
    }

}
