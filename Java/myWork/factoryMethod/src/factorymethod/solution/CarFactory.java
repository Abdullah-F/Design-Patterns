package factorymethod.solution;

public class CarFactory extends TransportFactory{
        @Override
	Transport create() {
		return new Car();// a specialized factory method that creates a car object and returns it
	}
}
