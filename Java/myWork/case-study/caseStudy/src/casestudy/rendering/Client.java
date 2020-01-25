package casestudy.rendering;


import casestudy.documentstructure.improved.ComposedWorldObject;

public class Client {

	public static void main(String[] args){
	
		ComposedWorldObject root = new ComposedWorldObject("root");// define a root world object

		
		
		RenderingSystem renderingSystem = new RenderingSystem();//defines a rendering object
		
		WorldObjectRenderer renderer = new QuickRenderer();// defines a world object renderer
		WorldObjectRenderer finalImageRenderer = new DetailedRenderer();//defines a detaild renderer

		renderingSystem.setWorldObjectRenderer(renderer);//add quik renderer to 
                                                                //the renering system object
		renderingSystem.render(root);// render the world object using quik renderer
		
		renderingSystem.setWorldObjectRenderer(finalImageRenderer);// add detaild renderer object
                                                                           //to the rendering system object
		renderingSystem.render(root);//render the world object using the detailed renderer
		
	}
	
}
