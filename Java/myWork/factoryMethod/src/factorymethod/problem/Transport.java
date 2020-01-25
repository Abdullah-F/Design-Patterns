package factorymethod.problem;

public class Transport {
	
	public String drive(){// a method of driving a vichle that can be overddien later in subclasses 
                              // to add special driving for each new type of transportation
        return "I'm a transport driving";
    }

}
