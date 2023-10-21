package polymor;

public class ConstrOverL {

	int index;
	int salary;
	String name;
	
	private ConstrOverL() {
		index=0;
	}
	private ConstrOverL(int index) {
		this.index=index;
	}
	private ConstrOverL(double salary, String name) {
		this.salary = (int)salary;
		this.name = name;
	}
	
	public void display() {
		System.out.println("index is : "+index);
		System.out.println("salary is : "+salary);
		System.out.println("name is : "+name);
	}
	
	public static void main(String[] args) {
		ConstrOverL co = new ConstrOverL(856856.99,"Hello Sri");
		co.display();
		

	}

}
