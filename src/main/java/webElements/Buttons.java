package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/gis00227/eclipse-workspace/Letcodepractice/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[@class='card-footer-item'])[2]")).click();
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		Point po = driver.findElement(By.id("position")).getLocation();
		System.out.println(po);
		String colr = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(colr);
		Dimension siz = driver.findElement(By.id("property")).getSize();
		System.out.println(siz);
		Boolean enable = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(enable);
		driver.quit();
	}

}
