package casestudy.multiplatform.improved;

public abstract class Window {

	// this is the bridge pattern, and the iwindowimpl contains the drawwWindow fuctionality
	private WindowImpl impl;//a bridge between Windos types and their 
                               ////implementaion in different platforms
	
	public Window(WindowImpl impl){// Window constructor
		this.impl = impl;
	}
	
	public void drawWindow(){// now this method is shared between all children
                                 // and no method reption
                                 // so this method delegates the responsiblity to the specialized 
                                 // platform acting as a bridge 
		impl.drawWindow();//implements the window drawing based on the bridge object above
                                  // if impl is for mac then it draws the window for mac platform
                                  // else if impl is a windows object it draws the window for windows
	}

	public void setImpl(WindowImpl impl) {
		this.impl = impl;
	}
	
	
}
