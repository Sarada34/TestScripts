package sharks;

import fishes.Apollo;
import fishes.Dolphin;

public class Meg extends Apollo{

	protected int age = 850;
	
	public void kill() {
		System.out.println("It kills");
	}
	
	protected void speak() {
		System.out.println("Meg tone");
	}
	
	public static void main(String[] args) {
		Meg mg = new Meg();
		mg.kill();
		mg.speak();
		mg.speak1();
		Apollo ap = new Apollo();
		ap.bite();
		Dolphin dp = new Dolphin();
		dp.play();
		System.out.println(ap.id);
		System.out.println(dp.name);
		System.out.println(mg.age);
	}

}
