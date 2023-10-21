package collectPack1;

public class ForEachTest2 {

	public static void main(String[] args) {
		
		String[][] data = new String[2][3];
		for(String[] str:data) {
			for(String arr:str) {
				System.out.println(arr);
			}
		}

	}

}
