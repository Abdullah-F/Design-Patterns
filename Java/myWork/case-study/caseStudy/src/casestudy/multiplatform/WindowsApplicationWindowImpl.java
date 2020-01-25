package casestudy.multiplatform;

public class WindowsApplicationWindowImpl extends ApplicationWindow{

	@Override
	public void drawWindow() { // this method is repeated in mac implementation and the difference is only
                                   // in the string
		System.out.println("Draw application window for Windows");
		
	}

	@Override
	public void drawApplicationWindow() {// this method is also repeated in the mac application window 
                                            // implementaion and the difference is only on the string
		drawWindow();
		System.out.println("Add windows application icon");
		
	}

}
