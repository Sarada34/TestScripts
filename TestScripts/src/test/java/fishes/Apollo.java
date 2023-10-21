package fishes;

import sharks.Meg;

public class Apollo {

	public int id = 1111;
	protected char gender = 'M';
	
	public void bite() {
		System.out.println("It doesn't bite");
	}
	
	protected void speak1() {
		System.out.println("Apollo tone");
	}
	public static void main(String[] args) {
		Apollo ap = new Apollo();
		ap.bite();
		ap.speak1();
		Dolphin dp = new Dolphin();
		dp.play();
		dp.speak2();
		Meg mg = new Meg();
		mg.kill();
		System.out.println(ap.id);
		System.out.println(ap.gender);
		System.out.println(dp.name);
		System.out.println(dp.gender);
		
	}

}
