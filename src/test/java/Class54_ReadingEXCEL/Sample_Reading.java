package Class54_ReadingEXCEL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample_Reading {
	@Test
	public void test() throws FileNotFoundException, IOException {
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("./TestData/data.xlsx")));
		String val=wb.getSheet("firstsheet").getRow(0).getCell(0).getStringCellValue();
		System.out.println("test values---"+val);
		
		
		
	}
	
}
