package apachePg;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ApacExcel2 {

	public static void main(String[] args) throws Throwable{
		
		File fle = new File("D:\\NewXls.xls");
		FileInputStream inpstr = new FileInputStream(fle);
		Workbook wb = WorkbookFactory.create(inpstr);
		Sheet sht = wb.getSheet("Sheet1");
		
		System.out.print(sht.getRow(0).getCell(0)+"\t");
		System.out.print(sht.getRow(0).getCell(1)+"\t");
		System.out.print(sht.getRow(0).getCell(2)+"\t");
		System.out.print(sht.getRow(0).getCell(3)+"\t");
		System.out.println(sht.getRow(0).getCell(4));
		
		System.out.print(sht.getRow(1).getCell(0)+"\t");
		System.out.print(sht.getRow(1).getCell(1)+"\t");
		System.out.print(sht.getRow(1).getCell(2)+"\t");
		System.out.print(sht.getRow(1).getCell(3)+"\t");
		System.out.println(sht.getRow(1).getCell(4));
		
		System.out.print(sht.getRow(2).getCell(0)+"\t");
		System.out.print(sht.getRow(2).getCell(1)+"\t");
		System.out.print(sht.getRow(2).getCell(2)+"\t");
		System.out.print(sht.getRow(2).getCell(3)+"\t");
		System.out.println(sht.getRow(2).getCell(4));
		
		System.out.print(sht.getRow(3).getCell(0)+"\t");
		System.out.print(sht.getRow(3).getCell(1)+"\t");
		System.out.print(sht.getRow(3).getCell(2)+"\t");
		System.out.print(sht.getRow(3).getCell(3)+"\t");
		System.out.println(sht.getRow(3).getCell(4));
		
		System.out.print(sht.getRow(4).getCell(0)+"\t");
		System.out.print(sht.getRow(4).getCell(1)+"\t");
		System.out.print(sht.getRow(4).getCell(2)+"\t");
		System.out.print(sht.getRow(4).getCell(3)+"\t");
		System.out.println(sht.getRow(4).getCell(4));
		
		System.out.print(sht.getRow(5).getCell(0)+"\t");
		System.out.print(sht.getRow(5).getCell(1)+"\t");
		System.out.print(sht.getRow(5).getCell(2)+"\t");
		System.out.print(sht.getRow(5).getCell(3)+"\t");
		System.out.println(sht.getRow(5).getCell(4));
		
		
		wb.close();
		
		
		

	}

}
