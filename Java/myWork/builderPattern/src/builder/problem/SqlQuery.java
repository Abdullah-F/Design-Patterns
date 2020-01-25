package builder.problem;

public class SqlQuery implements Query {

	private String from;
	
	private String where;
	
	@Override
	public void execute() {
		System.out.println("Executing sqlQuery from: "+from+" where "+where);
	}

	public void setFrom(String from) { // query construction code
		this.from = from;
	}

	public void setWhere(String where) { // query construction code
		this.where = where;
	}
	
	

}
