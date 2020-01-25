package casestudy.multiplatform.improved;

public class IconWindow extends Window{

	public IconWindow(WindowImpl impl) {
		super(impl);
	}

	public void drawIconWindow(){
		drawWindow();//calls the parent method which delegates the call to the bridge object
		System.out.println("Draw Icon");//draws an icon window
	}

}
