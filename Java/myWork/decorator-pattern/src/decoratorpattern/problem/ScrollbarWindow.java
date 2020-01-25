package decoratorpattern.problem;


public class ScrollbarWindow extends Window {// here we extend the base class (Window) to add 
                                             // a scrolling functionality (responsibility or feature)

    @Override
    public void draw() {
        System.out.println("Draw scrollbar");
        super.draw();
    }
}
