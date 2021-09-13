package webElements;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/gis00227/eclipse-workspace/Letcodepractice/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://inventory-dashboard.imdev.eng.oneviewcloud.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		File firstscr = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img.png");
		FileHandler.copy(firstscr, dest);
		WebElement ele = driver.findElementByXPath("(//input[@name='signInSubmitButton'])[2]");
		File elescr = ele.getScreenshotAs(OutputType.FILE);
		File eledest = new File("./snaps/img1.png");
		FileHandler.copy(elescr, eledest);
		
		WebElement sec = driver.findElementByXPath("(//div[@class='modal-body'])[2]");
		File secscr = sec.getScreenshotAs(OutputType.FILE);
		File secdest = new File("./snaps/img2.png");
		FileHandler.copy(secscr, secdest);
		
		driver.quit();
	}

}
