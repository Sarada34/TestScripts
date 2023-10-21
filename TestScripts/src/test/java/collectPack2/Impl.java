package collectPack2;

public class Impl implements I3{

	@Override
	public void display1() {
		System.out.println("This is display 1");	
	}

	@Override
	public void display2() {
		System.out.println("This is display 2");	
	}

	@Override
	public void display3() {
		System.out.println("This is display 3");	
	}
	
	public static void main(String[] args) {
		I3 i3 = new Impl();
		i3.display1();
		i3.display2();
		i3.display3();

	}


}
