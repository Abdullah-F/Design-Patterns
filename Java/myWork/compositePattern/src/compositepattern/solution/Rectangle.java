package compositepattern.solution;


public class Rectangle implements Graphic{

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");// each node draws itself ! GREAT !!
    }

}
