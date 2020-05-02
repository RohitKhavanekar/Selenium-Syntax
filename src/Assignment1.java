
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\Selenium Driver NEVER DELETE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();//TICKING THE CHECKBOX
		Assert.assertTrue((driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected()));//Check wether checkbox is TICKED or not
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();//TICKING THE CHECKBOX
		Assert.assertEquals(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected(), false);
		//(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());//Check wether checkbox is TICKED or not
		
		
		//Count the number of checkboxes
		//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());//  driver.findelement-S-     IN ELEMENT --"s" SHOULD BE ADDED
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).getSize()); 

	}

}

