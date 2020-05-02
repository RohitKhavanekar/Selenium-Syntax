import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEndAutomationSpicejet {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\Selenium Driver NEVER DELETE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click(); //Chick on Source Textbox
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//a[@value='BOM']")).click();//Find Mumbai from dropdown
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR'] //a[@value='GOI']")).click();//shifts automaticlly to Destination textbox simply select GOA from dropdown by EXCLUSIVELY SPECIFIN OTHER DROPDOWN   
		Thread.sleep(2000L);
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();//Click on DEFAULT Calander Date 
		
		driver.findElement(By.id("divpaxinfo")).click();
		Select n = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"))); //Passenger option is  SELECT Dropdown
		n.selectByValue("6");
		
		Select c = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));//Select Dropdown
		c.selectByValue("USD");
		
		driver.findElement(By.xpath("//input[@name='ControlGroupSearchView$AvailabilitySearchInputSearchView$ButtonSubmit']")).click();//Click on Search Button
				
		
	}

}
