package factorymethod.problem;


public class Car extends Transport {
/*
    this class extends the transport interface for transport 
    we can add it its implementation as we need
    **/
    
    @Override
    public String drive()
    {
        return "driving a car";
    }
}
