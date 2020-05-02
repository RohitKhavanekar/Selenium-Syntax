import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingCheckbox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\Selenium Driver NEVER DELETE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());//Check wether checkbox is TICKED or not
		driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).click();//TICKING THE CHECKBOX
		System.out.println(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());//Check wether checkbox is TICKED or not
		
		
		//Count the number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());//  driver.findelement-S-     IN ELEMENT --"s" SHOULD BE ADDED   

	}

}
