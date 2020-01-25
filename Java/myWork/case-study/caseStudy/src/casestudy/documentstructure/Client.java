package casestudy.documentstructure;



public class Client {

	public static void main(String[] args){
		
		// this represents the root tree node
		Composed root = new Composed();
		
		root.getCircles().add(new Circle());// adding a circle to the root composite object
		root.getCircles().add(new Circle());//adding another circle to root
		root.getSquares().add(new Square());// adding a squre to the root composite object
		root.getSquares().add(new Square());//adding another square
		
		
		// retrieve the tree
		// call the print method
/*********************************************************************************************
*                                     rendering the root composite object                    *                                             *
**********************************************************************************************/

               for (Circle circle : root.getCircles()) { //rendering circles
			circle.print();
		}
		
		for (Square square : root.getSquares()) {//rendering squares
			square.print();
		}
/********************************************************************************************/		
	}
	
}
