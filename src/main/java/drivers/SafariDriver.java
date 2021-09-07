package drivers;

import org.openqa.selenium.WebDriver;

public class SafariDriver {

	public static void main(String[] args) {
		
		//SafariDriver driver = new SafariDriver();
		WebDriver driver = (WebDriver) new SafariDriver(); 
		// Launch Website 
		driver.navigate().to("http://www.google.com/");
	}
}
