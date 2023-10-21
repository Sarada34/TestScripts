package apachePg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ApacExcel3 {

	public static void main(String[] args) throws RuntimeException, IOException {
		
		File fle = new File("D:\\NewXls.xls");
		FileInputStream inpstr = new FileInputStream(fle);
		Workbook wb = WorkbookFactory.create(inpstr);
		Sheet sht = wb.getSheet("Sheet1");
		
		for(int rowindex=0;rowindex<=5;rowindex++) {
		for(int colindex=0;colindex<5;colindex++) {
		System.out.print(sht.getRow(rowindex).getCell(colindex)+"\t");
		}
		System.out.println();
		}
		
		wb.close();
		
		

	}

}
