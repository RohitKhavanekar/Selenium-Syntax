package Section12RealTimeExercise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandeling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());//NORMALLY HOW ITS DONE
		
		WebElement footer = driver.findElement(By.cssSelector("div#gf-BIG"));//*******LIMITING WEBDRIVER SCOPE     STEP-1
		System.out.println(footer.findElements(By.tagName("a")).size());//************STEP-2
		
		WebElement columdriver = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));//ENCAPUSLATE FOOOTER IN COLUMDRIVER
		System.out.println(columdriver.findElements(By.tagName("a")).size());
		
		for (int i = 1; i < columdriver.findElements(By.tagName("a")).size(); i++) //INTERATE WITHIN THE COLUM 
		{
			String ClickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);//STICK KEY FOR OPENING "CTRL+ENTER" FOR OPENING LINK IN NEW TAB
			columdriver.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLinkTab);    //Opens All The TAB's
			Thread.sleep(4000L);
		}
		
		Set<String> abc = driver.getWindowHandles();//GET WINDOW HANDEL
		Iterator<String> it = abc.iterator();       //INTERATE THROUGH WINDOWS   
		
		while(it.hasNext())//USE WHILE LOOP TO ITERATE WITHIN WONDOWS
		{
			driver.switchTo().window(it.next());//GO TO NEXT WINDOW
			System.out.println(driver.getTitle()); //GET TITLE AFTER EVERY ITERATION
		}
		
		
		
		

	}

}
