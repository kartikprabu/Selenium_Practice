package drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirefoxDriver {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Users/gis00227/eclipse-workspace/Letcodepractice/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElementByName("q").sendKeys("Mahatma");
		driver.findElementByXPath("//span[text()='Mahatma Gandhi']").click();
		
		driver.close();
	}

}
