package builder.buildersolution;
/**
this class is responsible only for building a mongo query object and it returns a mongo query object
**/
public class MongoDbQueryBuilder implements QueryBuilder{

	private MongoDbQuery query = new MongoDbQuery();// defining a mongo query object
	
	@Override
	public void from(String from) {
		query.setFrom(from);
	}

	@Override
	public void where(String where) {
		query.setWhere(where);
	}

	@Override
	public Query getQuery() {
		return query;// returns the built mongo query object which will be used to execute the query
	}

}
