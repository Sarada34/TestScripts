package simProg;

//String Reverse using tocharArray()
public class Str2 {

	public static void main(String[] args) {
		String str1 = "Hello World";
		char[] strchar = str1.toCharArray();    //convert and traverse in reverse
		for(int i=strchar.length-1; i >=0; i--) {
			System.out.print(strchar[i]);
		}
		

	}

}

