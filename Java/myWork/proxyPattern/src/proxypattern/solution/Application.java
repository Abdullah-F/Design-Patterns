package proxypattern.solution;


import java.util.ArrayList;
import java.util.List;

public class Application {

    private List<Image> images = new ArrayList<Image>();

    public Application(List<Image> images) {
        this.images = images;
    }

    public void draw(){     //draws images in the list
        for (Image image : images) {
            image.draw();
        }
    }

}
