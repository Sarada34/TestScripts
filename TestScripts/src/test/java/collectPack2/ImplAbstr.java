package collectPack2;

public class ImplAbstr extends Abstrclass{

	@Override
	public void abstMethod() {
		System.out.println("This is Abstract Method");
	}	
	
	public static void main(String[] args) {
		Abstrclass a = new ImplAbstr();
		a.abstMethod();
		a.concMethod();

	}

	
}
