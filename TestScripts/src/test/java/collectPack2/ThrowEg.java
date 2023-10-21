package collectPack2;

public class ThrowEg {
	
	int age;
	
	public ThrowEg(int ag) {
		age = ag;
	}
	public void validateAge() {
		if(age<18) {
			throw new ArithmeticException("Not eligible to Vote");
		}else
			System.out.println("Eligible to Vote");
	}
	public static void main(String[] args) {
		ThrowEg tg = new ThrowEg(17);
		tg.validateAge();

	}

}
