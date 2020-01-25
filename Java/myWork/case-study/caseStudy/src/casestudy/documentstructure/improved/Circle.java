package casestudy.documentstructure.improved;

public class Circle extends WorldObject {

private String specification;// type of the single object
	
	public Circle(String specification){
		this.specification = specification;
	}
	
	
	@Override
	public void print() {
		System.out.println(specification);
	}


	@Override
	public String getName() {
		return specification;
	}
	
	
}
