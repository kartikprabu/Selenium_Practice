package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/gis00227/eclipse-workspace/Letcodepractice/drivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://letcode.in/frame");
		driver.get("https://w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//WebElement result = driver.findElement(By.xpath("//iframe[@name=iframeResult]"));
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("html>body>button")).click();
		driver.switchTo().alert();
		
		
	/*	driver.switchTo().frame(1);
		driver.findElement(By.xpath("(//div[@class='control']//input)[1]")).sendKeys("Kartik");
		driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[2]/div/input")).sendKeys("Prabu");
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("Kartik@gmail.com");*/
		driver.quit();
	}
	
	

}
