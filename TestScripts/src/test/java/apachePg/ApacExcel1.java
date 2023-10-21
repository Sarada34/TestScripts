package apachePg;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ApacExcel1 {

	public static void main(String[] args) throws Throwable {
		
		File fle = new File("D:\\NewXls.xls");
		FileInputStream inpstr = new FileInputStream(fle);
		Workbook wb = WorkbookFactory.create(inpstr);
		
		System.out.println("$Sheets: "+wb.getNumberOfSheets());
		Sheet sht = wb.getSheet("Sheet1");
		System.out.println("$Rows:	"+sht.getPhysicalNumberOfRows());
		System.out.println("First Row num:	"+sht.getFirstRowNum());
		System.out.println("Last Row num:	"+sht.getLastRowNum());
		System.out.println("$Columns in First Row:	"+sht.getRow(0).getPhysicalNumberOfCells());
		System.out.println("$Columns in Last Row:	"+sht.getRow(3).getPhysicalNumberOfCells());
		System.out.println("First Column num:	"+sht.getRow(0).getFirstCellNum());
		System.out.println("First Column num:	"+sht.getRow(0).getLastCellNum());
		
		wb.close();
	}

}
