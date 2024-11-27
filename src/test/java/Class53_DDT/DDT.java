package Class53_DDT;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT {
	@Test(dataProvider="appdata")
	public void test1(String arg1,String arg2) {
		
		System.out.println("test data--"+arg1+"   "+arg2);
	}
	
	//high priority
	
	@Test
	@DataProvider(name="appdata")
	public Object[][] testdata()
	{
		Object[][] arr=new Object[2][2];
		arr[0][0]="shy";
		arr[0][1]="aveesh";				
		arr[1][0]="hashi";
		arr[1][1]="leon";
		return arr;
	}

}
