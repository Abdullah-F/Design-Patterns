package builder.problem;

public class MongoDbQuery implements Query {

	private String from;
	
	private String where;
	
	@Override
	public void execute() {
		System.out.println("Executing mongoDbQuery from: "+from+" where "+where);
	}

	public void setFrom(String from) { // query construction code
		this.from = from;
	}

	public void setWhere(String where) {// query connstruction code
		this.where = where;
	}
	
	

}
