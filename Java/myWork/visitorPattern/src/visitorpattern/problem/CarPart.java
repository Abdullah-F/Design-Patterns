package visitorpattern.problem;

/**
 * 
 * @author abdullah-fadhel
 */
public abstract class CarPart {
/**
 * those methods will be repeated for each car part
 * with the visitor  pattern we can make a visitor to implement each one and just have a 
 * method that only excepts a visitor  here
 */
    abstract void print();

    abstract void render();

    abstract void upgrade();

}
