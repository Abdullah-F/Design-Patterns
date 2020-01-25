package decoratorpattern.solution;

public class Client {

    public static void main(String[] args) {

        Window window = new Window();//create a window
        
        IconWindowDecorator iconWindowDecorator = new IconWindowDecorator(window);// add an icon
        
        //add scrollbar to the icon window decorator (the window with icon actually
        //since the IconWindowDecorator is a window actually)
        ScrollbarWindowDecorator scrollbarWindowDecorator = new ScrollbarWindowDecorator(iconWindowDecorator);

        scrollbarWindowDecorator.draw();// drow a ScrollableIconWindow



    }

}
