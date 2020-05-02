import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\Selenium Driver NEVER DELETE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		
		Assert.assertFalse((driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected()));//Check wether checkbox is TICKED or not
		driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).click();//TICKING THE CHECKBOX
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());//Check wether checkbox is TICKED or not
		
		
		//Count the number of checkboxes
		//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());//  driver.findelement-S-     IN ELEMENT --"s" SHOULD BE ADDED
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);//Use ASSERTION to check 

	}

}
