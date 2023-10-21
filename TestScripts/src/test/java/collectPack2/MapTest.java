package collectPack2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String, String> mp = new HashMap<String,String>();
		//Map<String, String> mp = new TreeMap<String,String>();
		//Map<String, String> mp = new Hashtable<String,String>();
		mp.put("Testscript", "Tc001");
		mp.put("Username", "Admin");
		mp.put("Password", "Admin123");
		System.out.println(mp.isEmpty());
		System.out.println(mp.size());
		System.out.println(mp);
		System.out.println(mp.get("Username"));
		mp.remove("Password");
		System.out.println(mp.size());
		System.out.println(mp);
		//mp.remove("Username", "Admin");
		mp.remove("Username");
		mp.remove("Testscript");
		System.out.println(mp.isEmpty());
		System.out.println(mp.size());
		System.out.println(mp);
	}

}
