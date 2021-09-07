package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputText {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/gis00227/eclipse-workspace/Letcodepractice/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[@class='card-footer-item'])[1]")).click();
		driver.findElement(By.id("fullName")).sendKeys("Kartik Prabu");
		driver.findElement(By.id("join")).sendKeys(" team player", Keys.TAB);
		String get = driver.findElement(By.id("getMe")).getAttribute("value");	
		System.out.println(get);
		driver.findElement(By.id("clearMe")).clear();
		Boolean enable = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(enable);
		String readly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(readly);
		//driver.quit();	

	}
}
	
