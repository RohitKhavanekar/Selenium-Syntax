package MiscellinousTopics;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandelingHTTPSCertifications {

	public static void main(String[] args) 
	{
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
		
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		

	}

}
