package visitorpattern.solution;

/**
 * 
 * @author abdullah-fadhel
 * a car visitor that as only a visit method which takes any car part as a parameter
 */
public interface CarPartVisitor {

    void visit(CarPart carPart);

}
