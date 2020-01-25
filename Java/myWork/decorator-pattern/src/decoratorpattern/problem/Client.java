package decoratorpattern.problem;


public class Client {

    public static void main(String[] args) {
        /**
         * here the client defines window with the too many subclasses we have of window
         */
        IconWindow iconWindow = new IconWindow();
        iconWindow.draw();

        ScrollbarWindow scrollbarWindow = new ScrollbarWindow();
        scrollbarWindow.draw();


        IconScrollbarWindow iconScrollbarWindow = new IconScrollbarWindow();
        iconScrollbarWindow.draw();

    }

}
