package Class54_ReadingEXCEL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class AllDataProvider {
	@DataProvider(name="appdatanew")
		public static Object[][] test() throws FileNotFoundException, IOException {
			XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("./TestData/data.xlsx")));
		//	String val=wb.getSheet("firstsheet").getRow(0).getCell(0).getStringCellValue();
			
			int rows=wb.getSheet("firstsheet").getPhysicalNumberOfRows();
			
			int columns=wb.getSheet("firstsheet").getRow(0).getPhysicalNumberOfCells();
			
			Object[][] arr=new Object[rows][columns];
			
			for(int i=0;i<rows;i++) {
				
				for(int j=0;j<columns;j++) {
					arr[i][j]=wb.getSheet("firstsheet").getRow(i).getCell(j).getStringCellValue();
					
				}
			}
			wb.close();
			return arr;
		}

}
