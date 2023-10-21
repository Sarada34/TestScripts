package collectPack1;

public class Array2DTest {

	public static void main(String[] args) {
		
		String[][] data = new String[2][3];
		
		data[0][0] = "TestScriptID";
		data[0][1] = "Username";
		data[0][2] = "Password";
		data[1][0] = "111";
		data[1][1] = "Admin";
		data[1][2] = "Sid45";
		
		System.out.println(data.length);
		System.out.println(data[0].length);
		System.out.println(data[1].length);
		//System.out.println(data[0][0].length());
		//System.out.println(data[0][1].length());
		
		System.out.println(data[0][0]);
		System.out.println(data[0][1]);
		System.out.println(data[0][2]);
		System.out.println(data[1][0]);
		System.out.println(data[1][1]);
		System.out.println(data[1][2]);
		
		String[][] rawdata = {
				{"TestID","Un","Pwd"},
				{"11","Adm","45Ter"}
		
		};
		System.out.println(rawdata[0][0]+" "+rawdata[0][1]+" "+rawdata[0][2]);
		System.out.println(rawdata[1][0]+" "+rawdata[1][1]+" "+rawdata[1][2]);
	}

}
