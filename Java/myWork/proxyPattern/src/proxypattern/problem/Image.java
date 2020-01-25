package proxypattern.problem;


public class Image {

    protected String url;

    public Image(String url) {// image is loaded when created 
                             // we will use proxy pattern
                             // to make the images only loads (get instantiated) when
                             // we need them.
        System.out.println("Loading image");
        this.url = url;
    }

    public void draw(){
        System.out.println("Draw image from url "+url);
    }

}
