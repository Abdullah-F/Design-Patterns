package singltonsolution;

public class Preferences {
	
	// holder of the single instance for the singleton class
    private static Preferences instance = null;// here is a nil instance
 
    /**
     * No other classes can instantiate a singleton
     * it is a protected (not private ) to enable children classes to see the constructor of the parent
     */
    protected Preferences() {}// make the constructor private or protected so it can not be created 
                              //from outside
    
 
    /**
     * Create a singleton instance.
     * 
     * Use synchronized to allow one one instance when using multiple threads
     * 
     */
    private synchronized static void createInstance () {
        if (instance == null) instance = new Preferences();
    }
 
    /**
     * Access method to get hold of singleton instance
     * @return the one singleton instance
     */
    public static Preferences getInstance () {
        if (instance == null) createInstance ();
        return instance;
    }
    
    public void helloSingleton(){
    	System.out.println("Hello i'm a singleton");
    }
    
}
