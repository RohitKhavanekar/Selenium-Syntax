
package AddToCartSolutions;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartArrayListIMPLICITWAIT {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Rohit_Folder\\MAXIMUS\\Selenium Driver NEVER DELETE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//*********************IMPLICIT WAIT********************************
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(4000L);
		String[] proList = {"Cucumber","Brocolli","Beetroot","Cauliflower"};//Add elements to find in this array
		addItems(driver, proList);
		//base b = new base();   //IF STATIC THAN DONT NEED TO SPECIFY THESE LINES
		//b.addItems(driver, proList);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void addItems(WebDriver driver,String[] proList) 
		{
		int j=0;//initlize J
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));//lockate the elements by their name "TEXT"
		
		for (int i = 0; i < products.size(); i++) 
		{
			String[] name = products.get(i).getText().split("-");//Product name is retived in "Cucumber - 1 Kg" this format as displayed | split() function is used to split the text from "-".
			String formattedName = name[0].trim();// Split them and convert it into this format "Cucumber". | trim() function is used to trime out "Cucumber "blank spaces. 
			
			List productList = Arrays.asList(proList); // Convert the ARRAY "proList" into LIST named "productList".
			
			
			if (productList.contains(formattedName)) 
			{
				j++;//increment "j" to execute "break" statement
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();//If there is a match than click on ADD TO CART Button.
				
				if (j== proList.length) //Dynamicaly check the size of List to execute break statement. 
				{
					break;
				}

			}

		}
	
	
		}
	

}


/*Use ElEMENT"S" everywhere */