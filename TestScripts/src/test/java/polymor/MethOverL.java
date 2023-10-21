package polymor;

public class MethOverL {
	
	
	public void display() {
		System.out.println("Hello");
	}
	public void display(String firstName) {
		System.out.println("Hello "+firstName);
	}
	public void display(String firstName,String lastName) {
		System.out.println("Hello "+firstName+" "+lastName);
	}
	public static void display(String firstName,String lastName,int id) {
		System.out.println("Hello "+firstName+" "+lastName+" "+id);
	}
	
	public static void main(String[] args) {
		MethOverL ml = new MethOverL();
		ml.display();
		ml.display("Sriram");
		ml.display("Sriram", "Hare");
		MethOverL.display("SIva", "Sankar", 45484);
		

	}

}
