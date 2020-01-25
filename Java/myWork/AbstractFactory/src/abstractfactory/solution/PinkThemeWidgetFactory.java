package abstractfactory.solution;

public class PinkThemeWidgetFactory implements WidgetFactory {

	@Override
	public ScrollBar createScrollBar() {
		return new PinkThemeScrollBar();// creates a pink scroll bar for a pink window
	}

	@Override
	public Window createWindow() {
		return new PinkThemeWindow();//creates a pink themed window
	}
        
        
         /**
         * all logic here is about making parts of a theme products 
         * so at the end can produce all parts related to a platform or product
         * assembled and created together to form a single unit product (a pink theme in here) 
         */

}
