import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='fromCity']")).clear();;
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']")).sendKeys("MUM");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		//driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open")).sendKeys("MUM");
		//Thread.sleep(2000);
		//driver.findElement(By.id("fromCity")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.id("fromCity")).sendKeys(Keys.ENTER);
		
		
		//driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget activeWidget']")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget activeWidget']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("MUM");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.className("fsw_inputBox searchCity inactiveWidget activeWidget")).click();
		//driver.findElement(By.id("fromCity")).click();
		
		//driver.findElement(By.id("search")).click();
		//Thread.sleep(1000L);
		//driver.findElement(By.id("search")).sendKeys("Realme x2 pro");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Realme x2 pro");
		Thread.sleep(2000L);
		for(int i=0;i<=6;i++)
		{
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.ENTER);
		
		

	}

}
