package helper;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHelper2 {

	public static String[][] excelHelp(String Xfile, String sheet) throws Exception {
		
		File file = new File(Xfile);
		FileInputStream inpstr = new FileInputStream(file);
		Workbook wb	= WorkbookFactory.create(inpstr);
		Sheet sht = wb.getSheet(sheet);	
		
		String[][] data = new String[sht.getPhysicalNumberOfRows()-1][sht.getRow(0).getPhysicalNumberOfCells()];
		
		for(int rowindex=sht.getFirstRowNum()+1;rowindex<=sht.getLastRowNum();rowindex++) {
		for(int colindex=sht.getRow(rowindex).getFirstCellNum();colindex<sht.getRow(rowindex).getLastCellNum();colindex++) {
		data[rowindex-1][colindex] = sht.getRow(rowindex).getCell(colindex).toString();
		}
		}
		wb.close();
		return data;
		
	}
	
}
