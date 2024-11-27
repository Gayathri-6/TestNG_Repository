package Class54_ReadingEXCEL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample_Reading2 {

	@Test(dataProvider = "appdatanew",dataProviderClass = AllDataProvider.class)
	public void test1(String user,String pwd) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("111--"+user+" "+pwd);
		driver.get("https://freelance-learn-automation.vercel.app/login");
		System.out.println("222");
		
		driver.findElement(By.id("email1")).sendKeys(user);
		driver.findElement(By.id("password1")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.quit();
		
		
	}

	
}
