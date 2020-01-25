package builder.buildersolution;
/*** 
   a query interface used for run time switching between different query types (sql, mongo, ..etc)  
 ***/
public interface Query {

	void execute();
	
}
