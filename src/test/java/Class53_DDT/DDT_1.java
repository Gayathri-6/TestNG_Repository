package Class53_DDT;

import org.testng.annotations.Test;


public class DDT_1 {
	
	@Test(dataProvider="appdata1", dataProviderClass=DDT_COMM.class)
	public void test1(String arg1,String arg2)
	{
		System.out.println("test1--"+arg1+" "+arg2);
	}
	
	

}
