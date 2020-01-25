package builder.buildersolution;

/*** 
   this class has a single method and it excepts a builder object through its interface and 
   uses it to build the appropriate query by delegating the build process to the builder 
 ***/
public class QueryBuildDirector {

	/**
	 * Creates a query bases on the from and the where
	 * @param from
	 * @param where
	 * @param builder to define end result of the query or the respresnetation of the query
	 * @return
	 */
	public Query buildQuery(String from, String where, QueryBuilder builder){
		builder.from(from);
        builder.where(where);
        return builder.getQuery();
	}// delegates the query building process to the specialized builder at runtime as a propiate
	
	
}
