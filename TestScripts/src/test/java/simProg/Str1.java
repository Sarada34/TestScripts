package simProg;

//String Reverse using StringBuilder reverse() 
public class Str1 {

	public static void main(String[] args) {
		String str1 = "Automation";
		StringBuilder str2 = new StringBuilder();
		//append str1 to str2 because reverse method belongs to StringBuilder only
		str2.append(str1);
		str2 = str2.reverse();
		System.out.println(str2);

	}

}

