package Class53_DDT;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DDT_2 {
	@Test(dataProvider="appdata1", dataProviderClass=DDT_COMM.class)
	public void test1(String username,String password)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.findElement(By.id("email1")).sendKeys(username);
		driver.findElement(By.id("password1")).sendKeys(password);
	//	driver.quit();
	}


}
