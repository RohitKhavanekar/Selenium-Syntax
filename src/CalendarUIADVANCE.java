import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUIADVANCE {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\Selenium Driver NEVER DELETE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.cssSelector("input#travel_date")).click();
		Thread.sleep(2000L);
		while(!driver.findElement(By.cssSelector("div.datepicker-days .datepicker-switch")).getText().contains("April"))//CHECK IF MONTH NOT EQUAL(!) TO "APRIL"
		{
			driver.findElement(By.cssSelector("div.datepicker-days .next")).click();//THAN CLICK NEXT
		}
		
		List<WebElement> dates = driver.findElements(By.cssSelector(".day"));//convert dates into list
		
		int count = driver.findElements(By.cssSelector(".day")).size();//calculate the whole count 
		
		for (int i = 0; i < count; i++) //Iterate throughout the whole list  
			{
			//String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			String text1 = driver.findElements(By.cssSelector(".day")).get(i).getText();//check each TEXT of date
			if (text1.equalsIgnoreCase("24")) // check if the VALUE IN TEXT IS 24
			{
				driver.findElements(By.cssSelector(".day")).get(i).click();//IF 24 than CLICK
				break;
			}
			
		}
		

	}

}
