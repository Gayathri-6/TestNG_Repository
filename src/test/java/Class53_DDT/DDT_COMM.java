package Class53_DDT;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DDT_COMM {
	
	@Test
	@DataProvider(name="appdata1")
	public static Object[][]  testdata()
	{
		Object[][] arr=new Object[3][2];//rows,columns
		arr[0][0]="LAkmalisvg@gmail.com";
		arr[0][1]="admin123";	
		
		arr[1][0]="LAkmag@gmail.com";
		arr[1][1]="admin";	
		
		arr[2][0]="LAkmali@gmail.com";
		arr[2][1]="admin12";	
		return arr;
	}

	@Test
	@DataProvider(name="appdata2")
	public static Object[][]  testdata2()
	{
		Object[][] arr=new Object[1][1];
		arr[0][0]="a";
		arr[0][1]="aa";	
		
		arr[1][0]="b";
		arr[1][1]="bb";	
		
	
		return arr;
	}
}
