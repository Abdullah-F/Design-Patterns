package factorymethod.solution;

public class Car extends Transport{

        @Override
	public String drive() {
		return "Car driving"; // overriding the abstract method of the parent interface 
                                     // to add special functionality for driving a car type 
                                     // of transporattion
	}

}
