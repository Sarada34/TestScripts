package collectPack2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		
		//Set<String> st = new HashSet<String>();
		Set<String> st = new TreeSet<String>();
		st.add("uft");
		st.add("qtp");
		st.add("selenium");
		st.add("appium");
		st.add("win");
		st.add("selenium");
		System.out.println(st.isEmpty());
		System.out.println(st.size());
		System.out.println(st);
		System.out.println(st.contains("qtp"));
		st.remove("selenium");
		System.out.println(st.size());
		System.out.println(st);
		st.clear();
		System.out.println(st.isEmpty());
		System.out.println(st.size());
		System.out.println(st);

	}

}
