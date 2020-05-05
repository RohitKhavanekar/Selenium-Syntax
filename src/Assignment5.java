import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\Selenium Driver NEVER DELETE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		Thread.sleep(4000L);
		
		//System.out.println(driver.findElements(By.tagName("frame")).size());
		
		driver.switchTo().frame(0);//SWITCH TO TOP FRAME
		//SWITCHING FRAME WITHIN FRAME
		driver.switchTo().frame(1);//SWITCH TO MIDDLE FRAME WITHIN THE TOP FRAME						
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		driver.switchTo().defaultContent();//TO GET OUT OF FRAME AND WORK WITH WINDOW
		
		

	}

}
