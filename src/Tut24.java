
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tut24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\SELENIUM'\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		//driver.findElement(By.id("username")).sendKeys("RCK");
		driver.findElement(By.cssSelector("\r\n" +"#username")).sendKeys("RCK");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
		
		//driver.close();//Only Closes the Focused Window
		//driver.quit();	//Closes all the instances of webdriver safely		

	}

}
