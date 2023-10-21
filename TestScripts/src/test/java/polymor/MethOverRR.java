package polymor;

public class MethOverRR {

	private int id;
	private double salary;
	private String name;
	
	public MethOverRR(int id,double salary,String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return id+" "+salary+" "+name;
	}
	
	public static void main(String[] args) {
		MethOverRR mr = new MethOverRR(1414, 8956560.99, "Samrat");
		System.out.println(mr.toString());
	}

}
