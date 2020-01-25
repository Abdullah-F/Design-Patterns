package visitorpattern.solution;

/**
 * 
 * @author abdullah-fadhel
 */

public class PrintCarPartVisitor implements CarPartVisitor{

    @Override
    public void visit(CarPart carPart) { // it prints any car part
        System.out.println("Print "+carPart);
    }

}
