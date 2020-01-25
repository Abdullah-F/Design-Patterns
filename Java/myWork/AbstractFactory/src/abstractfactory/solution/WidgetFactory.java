package abstractfactory.solution;

public interface WidgetFactory {

	ScrollBar createScrollBar();// a methd that will ber implemented
                                   // it will be responsible for creating themed 
                                   // scroll bars products suitable for the window product 
                                   // theme type they depend on and ship with
	
	Window createWindow(); //craetes a themed window (any type of window) 
                               // with its suitable scroll bar above
	
}
