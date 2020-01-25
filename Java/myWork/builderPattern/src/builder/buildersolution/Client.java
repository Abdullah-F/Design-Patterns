package builder.buildersolution;

public class Client {

	public static void main(String[] args){
		
		// setup the director
		QueryBuildDirector director = new QueryBuildDirector(); // setting up a query builder director
		String from="client table"; // setting query from clause
		String where="client name = ..."; // setting query where clause
                
                QueryBuilder mongoQueryBuilder = new MongoDbQueryBuilder();// setting a mongo query builder
                QueryBuilder sqlQueryBuilder = new SqlQueryBuilder();// setting sql query builder
                
                Query mongoquery = director.buildQuery(from, where, mongoQueryBuilder);// building mongo query
                mongoquery.execute();// executing mongo query !
                
                Query sqlquery = director.buildQuery(from, where, sqlQueryBuilder);// building sql query
                sqlquery.execute();// executing sql query
		



	}
	
}
