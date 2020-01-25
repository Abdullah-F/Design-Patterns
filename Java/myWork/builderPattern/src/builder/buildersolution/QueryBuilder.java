package builder.buildersolution;

/*** 
          query builder interface that provides run time switching between different query builders
          like (mongo builder, sql builder, ..etc) 
  ***/
public interface QueryBuilder {

	void from(String from);
	
	void where(String where);
	
	Query getQuery();
	
}
