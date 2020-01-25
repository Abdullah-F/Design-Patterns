package decoratorpattern.solution;

/**
 * 
 * @author abdullah-fadhel
 * this class is used to add a scrollbar feature to window object at runtime
 */
public class ScrollbarWindowDecorator extends WindowDecorator{
    /**
     * 
     * @param window 
     */
    public ScrollbarWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        System.out.println("Draw a scrollbar");

        window.draw();
    }
}
