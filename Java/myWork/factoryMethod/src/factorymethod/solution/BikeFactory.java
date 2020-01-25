package factorymethod.solution;

public class BikeFactory extends TransportFactory{
        @Override
	Transport create() {
		return new Bike();// a specialized factory method that creates a bike object and returns it
	}
}
