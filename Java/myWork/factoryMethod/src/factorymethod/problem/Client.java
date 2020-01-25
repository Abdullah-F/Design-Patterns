package factorymethod.problem;


public class Client {

    public static void main(String [] args){

    	Transport vehicle = new Transport();// we can define any type of transporatation through 
                                            // the transport interface
                                            // but the problem here is we don't know at runtime what type
                                            // of vehicle will be created
                                            // hopefully this problem will goes by using the factory 
                                            // method design pattern
    	System.out.println(vehicle.drive());
        
        vehicle = new Car();// creating (changing) another type of vehicle manually a again !!
        System.out.println(vehicle.drive());
    	

    	
    }
	
}
