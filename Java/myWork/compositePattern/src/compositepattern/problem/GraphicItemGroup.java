package compositepattern.problem;


import java.util.ArrayList;
import java.util.List;

public class GraphicItemGroup {

    private List<Line> lines = new ArrayList<Line>();// the problem is we maintain a lest for line

    private List<Rectangle> rectangles = new ArrayList<Rectangle>();// another list of rectangles

    public List<Line> getLines() {
        return lines;
    }

    public List<Rectangle> getRectangles() {
        return rectangles;
    }

    public void draw(){
        /**
         * the biggest problem here is the draw method has a lot of complexity 
         * it has a heavy lifting to maintain the drawing of lines and rectangles
         * what if we have more shapes in our  group ?????
         */
        for (Line line : lines) {
            line.draw();
        }

        for (Rectangle rectangle : rectangles) {
            rectangle.draw();
        }
    }
}
