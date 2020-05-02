import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\Selenium Driver NEVER DELETE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.xpath("//a[text()=\"Click Here\"]")).click();
		
		Set<String> ids=driver.getWindowHandles();//****************OBJECT CREATION FOR WINDOW HANDLING*****************************
		Iterator<String> it =ids.iterator();//**********************CREATE ITERATOR OBJECT TO ITERATE THROUGH WINDOWS***************
		String parentid = it.next();//******************************USE next() function TO ITERATE TO PARENT ID*********************
		String childid = it.next();//*******************************USE next() function TO ITERATE TO CHILD ID**********************
		driver.switchTo().window(childid);//************************PERFORM SWITCHING USING CHILD ID********************************
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());


	}

}
