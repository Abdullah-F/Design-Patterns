package factorymethod.solution;


public class Client {

    public static void main(String [] args){

        TransportFactory factory = new BikeFactory(); // creating a bike factory

        Transport transport = factory.create();// creating a bike transport via the bike factory

        System.out.println(transport.drive());// driving...

        factory  = new CarFactory();// creating a car factory

        transport = factory.create();// reusing the transprot object and creating a car

        System.out.println(transport.drive());// driving a car


    }
	
}
