package collectPack2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		
		List<String> lst = new ArrayList<String>();
		//List<String> lst = new LinkedList<String>();
		//List<String> lst = new Vector<String>();
		lst.add("uft");
		lst.add("qtp");
		lst.add("selenium");
		lst.add("appium");
		lst.add("win");
		lst.add("selenium");
		System.out.println(lst.isEmpty());
		System.out.println(lst.size());
		System.out.println(lst);
		System.out.println(lst.contains("qtp"));
		lst.remove("selenium");
		System.out.println(lst.size());
		System.out.println(lst);
		lst.clear();
		System.out.println(lst.isEmpty());
		System.out.println(lst.size());
		System.out.println(lst);

	}

}
