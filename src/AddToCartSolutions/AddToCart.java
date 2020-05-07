package AddToCartSolutions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Rohit_Folder\\MAXIMUS\\Selenium Driver NEVER DELETE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		// get the List of WebElements and store it in product which belongs to
		// "java.util.List" this library.
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) 
		{
			String name = products.get(i).getText();
			if (name.contains("Cucumber")) 
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				

			}

		}

	}

}


/*Use ElEMENT"S" everywhere */