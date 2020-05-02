import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2ClearTrip {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\Selenium Driver NEVER DELETE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		
		 driver.findElement(By.cssSelector(".keyValue.span.span24.required.arabicChars.ui-autocomplete-input.placeholder")).sendKeys("Mumbai");//Type "Mumbai" in sorce textbox
		Thread.sleep(2000L);//wait for 2 seconds to loading of the auto suggestions
		driver.findElement(By.cssSelector(".keyValue.span.span24.required.arabicChars.ui-autocomplete-input.placeholder")).sendKeys(Keys.ARROW_DOWN);//select the auto suggestive option
		Thread.sleep(2000L);//wait for 2 second for processing and moving to next textbox
		
		
		driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys("Goa");//insert "Goa" in other textbox
		Thread.sleep(5000L);//wait for 5 sec for loading of auto suggestions
		driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys(Keys.ENTER);//click enter after auto suggestion are displayed 
		
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();//Select default date form CalanderUI
		
		
		Select a = new Select(driver.findElement(By.id("Adults")));//select number of adults
		a.selectByValue("2");
		
		
		Select c = new Select(driver.findElement(By.id("Childrens")));//select number of children
		c.selectByValue("1");
		
		
		driver.findElement(By.id("SearchBtn")).click();//click on search button
		
		
		
		

	}

}
