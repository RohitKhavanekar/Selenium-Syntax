import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class GridHandeling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Rohit_Folder\\\\MAXIMUS\\\\Selenium Driver NEVER DELETE\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		
		WebElement table = driver.findElement(By.cssSelector("div.cb-col.cb-col-100.cb-ltst-wgt-hdr"));
		//WebElement row = table.findElement(By.cssSelector("div.cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope div.cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray"));
		int count = table.findElements(By.cssSelector("div.cb-col.cb-col-67.cb-scrd-lft-col.html-refresh.ng-isolate-scope div.cb-col.cb-col-8.text-right.text-bold")).size();
		
		for (int i = 0; i <= count-2; i++) 
		{
			System.out.println(table.findElements(By.cssSelector("div.cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).get(i).getText());
					
		}
		
		

	}

}
