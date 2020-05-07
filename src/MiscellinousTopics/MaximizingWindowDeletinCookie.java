package MiscellinousTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizingWindowDeletinCookie {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\Selenium Driver NEVER DELETE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// 														******************STEP 1**************
		
		driver.manage().window().maximize();//MAXIMIZE THE BROWSER WINDOW                               ******************STEP 2**************
		driver.manage().deleteAllCookies();//USED TO DELETE ALL COOKIE
		driver.manage().deleteCookieNamed("NAME OF THE COOKIE");//DELETE A SPECIFIC COOKIE 
		
		
		

	}

}
