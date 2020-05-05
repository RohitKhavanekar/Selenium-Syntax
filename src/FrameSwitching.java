import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameSwitching {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\Selenium Driver NEVER DELETE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));//********SWITCH INTO FRAME**********
		Actions a = new Actions(driver);//***************CREATE ACTION OBJECT*************
		WebElement source = driver.findElement(By.id("draggable"));//LOCATE SOURCE
		WebElement target = driver.findElement(By.id("droppable"));//LOCATE DESTINATION
		a.dragAndDrop(source, target).build().perform();//BUILD AND PERFORM ACTION
		driver.switchTo().defaultContent();//TO GET OUT OF FRAME AND WORK WITH WINDOW
		
		
		

	}

}
