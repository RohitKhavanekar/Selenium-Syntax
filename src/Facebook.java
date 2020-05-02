import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\SELENIUM'\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		//driver.findElement(By.cssSelector("[input#email.inputtext.login_from_input_box]")).sendKeys("RCK"); 			
		//driver.findElement(By.cssSelector("input#pass.inputtext.login_from_input_box]")).sendKeys("123");			
		
		
		driver.findElement(By.cssSelector("input[name*='email']")).sendKeys("RCK");;
		driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[value*='Log']")).click();
		
		
		/*driver.findElement(By.xpath("//input[@class,'input r4 wide mb16']")).sendKeys("RCK");//Xpath
		driver.findElement(By.cssSelector("input#password]")).sendKeys("123");
		driver.findElement(By.cssSelector("input[value*='Log']")).click();
		*/
		

	}

}
