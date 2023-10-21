package encap;

public class Emp {

	int id;
	double salary;
	String name;
	
	public void setId(int id) {
		if(id<=0) {
			System.out.println("Invalid id");
			System.exit(1);
		}else
			this.id = id;
		
	}
	public int getId() {
		return id;
	}

	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}


	public static void main(String[] args) {
		

	}

}
