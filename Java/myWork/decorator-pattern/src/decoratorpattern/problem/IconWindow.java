package decoratorpattern.problem;


public class IconWindow extends Window{// we extend the Window class to add an icon

    @Override
    public void draw() {
        System.out.println("Draw Icon");
        super.draw();
    }
}
