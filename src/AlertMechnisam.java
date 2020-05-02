import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMechnisam {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\Selenium Driver NEVER DELETE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys("Rohit");//ENTER ROHIT IN TEXTBOX
		driver.findElement(By.id("alertbtn")).click();//CLICK ON BUTTON
		System.out.println(driver.switchTo().alert().getText());//GET TEXT OF THE GENERATED ALERT TO VERIY CORRECT ALERT IS GENERATED
		driver.switchTo().alert().accept();// CLICK'S ON "OK" OF THE ALERT BUTTON BY USING accept() method
		driver.findElement(By.id("confirmbtn")).click();//CLICK ON CONFORM BUTTON TO GENERATE ALERT
		System.out.println(driver.switchTo().alert().getText());//GET TEXT OF THE ALERT
		driver.switchTo().alert().dismiss();//CLICK ON "CANCEL" OF THE ALERT BY USING dismiss() method
		
	}

}
//switch() METHOD IS USED TO SELECT ALERT WINDOWS  