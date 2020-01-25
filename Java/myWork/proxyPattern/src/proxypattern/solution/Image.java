package proxypattern.solution;

/**
 * 
 * @author abdullah-fadhel
 * a usual image class that will be encapsulated by the image proxy (virtual proxy for the image
 *  object ) which will delay the instantiation of the image objects until we need them. 
 */
public class Image {

    protected String url;

    public Image() {
    }

    public Image(String url) {
        System.out.println("Loading image");
        this.url = url;
    }

    public void draw(){
        System.out.println("Draw image from url "+url);
    }

}
