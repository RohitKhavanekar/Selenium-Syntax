import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList"));
		
		//a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//keyDown is used to press a sepcific key | Keys.SHIFT specify "SHIFT" key to be downed | doubleClick is use to perform doubel click | BUILD & PERFOEM is used to build & perform the action which is mandatory while using ACTION CLASS
		a.moveToElement(move).contextClick().build().perform();//Context click is used to perform RIGHT CLICK
		
		
		
		

	}

}
