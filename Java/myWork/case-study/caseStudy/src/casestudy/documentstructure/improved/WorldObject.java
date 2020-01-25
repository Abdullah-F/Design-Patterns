package casestudy.documentstructure.improved;
/************************************************************************
 *                                                                      *
 * @author abdullah-fadhel
 *
 * an abstract class that corresponds to a world object, and its implementation
 * could be of any type (ex. circle, square, or even a composite object)
 ************************************************************************/
public abstract class WorldObject {
	
	/**
	 * Print the name of your world object
	 */
	public abstract void print();
	
	/**
	 * 
	 * @return the name of the world object
	 */
	public abstract String getName();
	
	
}
