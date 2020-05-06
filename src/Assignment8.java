import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\SELENIUM\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");

	    Thread.sleep(2000);

	    String tex = driver.findElement(By.id("autocomplete")).getAttribute("value"); 
		 
	    while(!tex.equalsIgnoreCase("India"))
	    {
	    	driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    	tex = driver.findElement(By.id("autocomplete")).getAttribute("value");

	    //driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	    }
	    System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
		   
	
	}
		}
		


	


