package builder.buildersolution;
/*** 
     this class builds an sql query and it returns a built sql query
  **/
public class SqlQueryBuilder implements QueryBuilder{

	private SqlQuery query = new SqlQuery();// defines an sql query object
	
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
		return query;// returns built sql query object that will be executed later at runtime
	}

}
