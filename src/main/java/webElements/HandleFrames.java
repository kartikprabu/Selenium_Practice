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
		
		// W3schools - Frame and Alert task
		driver.get("https://w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		WebElement result = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(result);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().sendKeys("Kartik Prabu");
		driver.switchTo().alert().accept();
		
		String rp= driver.findElement(By.id("demo")).getText();
		System.out.println("Name is: " +rp);
		
		
	/*	driver.switchTo().frame(1);
		driver.findElement(By.xpath("(//div[@class='control']//input)[1]")).sendKeys("Kartik");
		driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[2]/div/input")).sendKeys("Prabu");
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("Kartik@gmail.com");*/
		//driver.quit();
	}
	
	

}
