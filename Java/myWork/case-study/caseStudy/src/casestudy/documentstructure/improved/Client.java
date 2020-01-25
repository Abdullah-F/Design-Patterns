package casestudy.documentstructure.improved;

public class Client {

	public static void main(String [] args){
		
		ComposedWorldObject root = new ComposedWorldObject("root");// defines the root 
                                                                           //(main) composite object
		
                ComposedWorldObject house = new ComposedWorldObject("house");//defines a nother composite object
                                                                             //which will be containd by 
                                                                             //the root object
		
		Circle circle = new Circle("circle");// create a circle object
		Square square = new Square("square");// create a square object
		
		Circle secondCircle = new Circle("secondCircle");// create another circle
		Square secondSquare = new Square("secondSquare");// creates another sqaure
		
		
		
		// link objects together
		
		root.getWorldObjects().add(house); // adds the house to the main object
		house.getWorldObjects().add(circle);// adds a circle to the house
		house.getWorldObjects().add(square);// adds a square to the house
		
		root.getWorldObjects().add(secondSquare);// adds a squre  beside the house in the root object
		root.getWorldObjects().add(secondCircle);// adds a circle beside the house in the root object
		
		// print the tree
		
		
		// root = composite object
		root.print();
		
		
	}
	
}
