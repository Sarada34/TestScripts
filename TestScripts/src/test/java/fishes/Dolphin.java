package fishes;

import sharks.Meg;

public class Dolphin extends Meg{

	public String name = "Playful Fish";
	protected char gender = 'F'; 
	
	public void play() {
		System.out.println("It plays");
	}
	
	protected void speak2() {
		System.out.println("Dolphin tone");
	}
	
	public static void main(String[] args) {
		Dolphin dp = new Dolphin();
		dp .play();
		dp.speak2();
		dp.speak();
		dp.speak1();
		Apollo ap = new Apollo();
		ap.bite();
		ap.speak1();
		Meg mg = new Meg();
		mg.kill();
		mg.speak1();
		System.out.println(ap.id);
		System.out.println(ap.gender);
		System.out.println(dp.name);
		System.out.println(dp.gender);
	}

}
