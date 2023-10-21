package collectPack2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChkExcept2 {

	public static void main(String[] args) {
		
		
		try {
			Thread.sleep(2000);
			File fle = new File("Testdata.xlsx");
			FileInputStream inpstr = new FileInputStream(fle);
		} catch (InterruptedException ie) {
			System.out.println(ie.toString());
		} catch (FileNotFoundException fne) {
			System.out.println(fne.toString());
		}
		//catch (Throwable e) {
		//	System.out.println(e.toString());
		//}

	}

}
