package abstractfactory.solution;

public class YellowThemeWidgetFactory implements WidgetFactory {

	@Override
	public ScrollBar createScrollBar() {
		return new YellowThemeScrollbar();// creates a yellow scroll bar for a yellow window
	}

	@Override
	public Window createWindow() {
		return new YellowThemeWindow();//creates a yellow themed window
	}
        
        /**
         * all logic here is about making parts of a theme products 
         * so at the end can produce all parts related to a platform or product
         * assembled and created together to form a single unit product (a Yellow theme in here) 
         */

}
