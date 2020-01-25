package compositepattern.solution;


import java.util.ArrayList;
import java.util.List;

/***
 * 
 * @author abdullah-fadhel
 * 
 * this class acts as a node that can reference a leaf node (line, rectangle, ...etc)
 * and also it can reference another node (or Group).
 */

public class GraphicItemGroup implements Graphic {

    private List<Graphic> graphics = new ArrayList<Graphic>();// here we only maintain a list of another
                                                            // node or leaf (the Graphic interface
                                                            // helps us to treat nodes uniformally)

    @Override
    public void draw() {// a draw method that delegates the call to contained nodes.
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
    }

    public List<Graphic> getGraphics() {
        return graphics;
    }
}
