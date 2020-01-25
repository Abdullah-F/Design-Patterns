package decoratorpattern.solution;


public class WindowDecorator extends Window{
   /**
    * a decorator class that will be used to add and combine responsibilities (window types)
    * at run time as needed, so they will be more manageable and can be removed and added at runtime easily
    * 
    */
    protected Window window;// it has a reference to window object 
                            // so other subdecorators will use this 
                            // object to add responsbilities to it at runtime
                            //such as adding (icons, scrollbars)

    public WindowDecorator(Window window) {// creates a window
        this.window = window;
    }

    @Override
    public void draw() {
        window.draw();
    }
}
