package abstractfactory.problem;

public class Client {

		
	public static void initializeGUI(ScrollBar bar, Window window){
		System.out.println("Do initialize logic here with "+
                        bar.getClass().getName()+" and "+window.getClass().getName());
	}

	public static void main(String [] args){

        ScrollBar bar = new YellowThemeScrollbar();//here the client is responsible for 
                                                   // creating the while product componets which is 
                                                   // wrong since it can missup something
        Window window = new YellowThemeWindow();// the client is responsible here for creating 
                                               // the window(Yellow one) with its corresponding 
                                               // scrollbar (Yellow one) which is something the cleint
                                               // should not tackle and can lead to problems and 
                                               // difficult to maintain code when having a lot of products
                                               // that are dependent on each other.

        initializeGUI(bar,window);


        bar = new YellowThemeScrollbar();// the same thing happens again and a again and 
                                        //the client is in trubble!
        window = new PinkThemeWindow(); // !!

        initializeGUI(bar, window);

		
	}
	
	
	
}
