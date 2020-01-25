package decoratorpattern.solution;

/**
 * 
 * @author abdullah-fadhel
 * this class adds an Icon to the window object of parent decorator
 * at run time
 */
public class IconWindowDecorator extends WindowDecorator{
/**
 * 
 * @param window 
 */
    public IconWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        System.out.println("Drawing icon");
        window.draw();
    }
}
