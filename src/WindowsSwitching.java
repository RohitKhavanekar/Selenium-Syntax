import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsSwitching {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\Selenium Driver NEVER DELETE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Dgoogle%26rlz%3D1C1CHBF_enIN836IN836%26oq%3Dgoogle%26aqs%3Dchrome..69i57j69i60j69i65l3j69i60l3.836j0j7%26sourceid%3Dchrome%26ie%3DUTF-8&flowName=GlifWebSignIn&flowEntry=AddSession");
		System.out.println("Before Switching");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Privacy']")).click();
		Thread.sleep(4000L);
		Set<String> ids=driver.getWindowHandles();//****************OBJECT CREATION FOR WINDOW HANDLING*****************************
		Iterator<String> it =ids.iterator();//**********************CREATE ITERATOR OBJECT TO ITERATE THROUGH WINDOWS***************
		String parentid = it.next();//******************************USE next() function TO ITERATE TO PARENT ID*********************
		String childid = it.next();//*******************************USE next() function TO ITERATE TO CHILD ID**********************
		driver.switchTo().window(childid);//************************PERFORM SWITCHING USING CHILD ID********************************
		System.out.println("After Switching");
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		
		
		
		

	}

}