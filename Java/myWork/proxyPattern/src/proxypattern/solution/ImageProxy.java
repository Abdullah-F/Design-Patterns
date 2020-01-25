package proxypattern.solution;


public class ImageProxy extends Image{

    private Image image;// a real image is encapsulated here by the image proxy

    public ImageProxy(String url) {
        super();
        this.url = url;// gets the image url but does not instantiate the image
    }

    @Override
    public void draw() {
        if(image ==null){
            image = new Image(this.url);// instantiation only happens when calling 
                                        //a method in the encapsulated object
                                        // so instantiation happens when needed
                                        // and no more preloading happens
        }
        image.draw();// then it delegates the call to the image object
    }
}
