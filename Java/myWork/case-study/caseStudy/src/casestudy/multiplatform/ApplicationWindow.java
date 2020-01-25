package casestudy.multiplatform;

public abstract class ApplicationWindow extends Window{

	/**
	 * Draws the normal window, plus adds an application icon in the toolbar
	 */
	public abstract void drawApplicationWindow();
        
        // this class is an abstract class that has an abstract method for drawing application window
        //this method will be repeated in all child classes and so the draw window of the Window parent class
        //this repetion of methods is the big problem in here 
        // the solution is the bridge design pattern

	
}
