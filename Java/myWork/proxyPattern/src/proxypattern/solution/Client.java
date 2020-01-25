package proxypattern.solution;




import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        ImageProxy image = new ImageProxy("test image");
        ImageProxy image2 = new ImageProxy("second image");

        List<Image> images = new ArrayList<Image>();
        images.add(image);// adds just a virtual proxy for the image and no loading happens
        images.add(image2);// adds just a virtual proxy for the image and no loading happens

        Application application = new Application(images);


        System.out.println("Application setup");

        application.draw();// here only we get the list images loaded
                           // (when we needed them)

    }

}
