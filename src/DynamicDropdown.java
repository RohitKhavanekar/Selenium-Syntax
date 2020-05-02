import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000L);//For Synchronization
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();//Clicking first one from Dropdown
		Thread.sleep(2000L);//Wait for 2 seconds
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();//SELECTING SECOND OPRTION FROM DROPDOWN BY SPECIFING THE INDEX [2]
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click(); //SELECTING SECOND OPTION WITHOUT USING INDEX(PARENT CHILD RELATIONSHIP XPATH)
			

	}

}
