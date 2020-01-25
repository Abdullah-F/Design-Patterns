package decoratorpattern.problem;


public class IconScrollbarWindow extends Window{
/***
   here we need a window that is both an icon window and a scrollbar window
   so a gain we extend the Window class to add such feature 
   but extending it again each time we add a new window type will lead to
   an explosion of classes, and the decorator pattern can solve such a problem
    
   ***/
    @Override
    public void draw() {
        System.out.println("Draw icon");
        System.out.println("Draw scrollbar");
        super.draw();
    }
}
