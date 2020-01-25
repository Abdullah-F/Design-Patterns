package abstractfactory.solution;

public class Client {

	
	public static void initializeGUI(WidgetFactory factory){
		initializeGUI(factory.createScrollBar(), factory.createWindow());// theme creating with
                                                       //the theme factory
	}
		
	public static void initializeGUI(ScrollBar bar, Window window){
		System.out.println("Do initazation logic here with "+bar.getClass().getName()+" and "+window.getClass().getName());
	}
	
	public static void main(String [] args){

        WidgetFactory factory = new PinkThemeWidgetFactory();// creates a specilized factory
                                                             // for pink theme widget
        initializeGUI(factory);// uses the factory to create a pink theme widget

        factory = new  YellowThemeWidgetFactory();// a yelloe theme factory
        initializeGUI(factory);//cretes a yelloe theme widget with the factpry

		
	}
	
	
	
}
