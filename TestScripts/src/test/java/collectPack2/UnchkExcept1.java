package collectPack2;

public class UnchkExcept1 {

	public static void main(String[] args) {
		
		System.out.println("Code before Exception");
		
		try {
			int i = 100/0;
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		}
		System.out.println("Code after Exception");
	}

}
