import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class EnableDisable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\Selenium Driver NEVER DELETE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000L);
		//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		Thread.sleep(1000L);
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) 
		{
			System.out.println("Is Enabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Is disabled");
			
		}
		
	}

}

