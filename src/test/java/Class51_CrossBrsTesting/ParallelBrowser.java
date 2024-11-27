package Class51_CrossBrsTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelBrowser {
	@Parameters("Browser")
	@Test
	public void test(@Optional("Firefox") String Browser) {
		
		if (Browser.equalsIgnoreCase("Chrome")){
			System.out.println("thread id--"+Thread.currentThread().getName());
		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		}
		
		
		else if (Browser.equalsIgnoreCase("Firefox")){
			System.out.println("thread id--"+Thread.currentThread().getName());
		WebDriver driver=new FirefoxDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		}
		
		else if (Browser.equalsIgnoreCase("Edge")){
			System.out.println("thread id--"+Thread.currentThread().getName());
			WebDriver driver=new EdgeDriver();
			driver.get("https://freelance-learn-automation.vercel.app/login");
			}
		
	}

}
