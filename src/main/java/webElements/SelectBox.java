package webElements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/gis00227/eclipse-workspace/Letcodepractice/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Drop-Down")).click();
		
		WebElement sel = driver.findElement(By.id("fruits"));
		Select selct = new Select(sel);
		selct.selectByVisibleText("Apple");
		
		WebElement suphero = driver.findElement(By.id("superheros"));
		Select s1 = new Select(suphero);
		Boolean b = s1.isMultiple();
		s1.selectByIndex(22);
		
		WebElement lang = driver.findElement(By.id("lang"));
		Select l = new Select(lang);
		l.selectByIndex(4);
		List print = l.getOptions();
		for (WebElement i: print)
		{
			System.out.println(i.getText());
		}
			
		
		
		System.out.println("The values are: "+print);
		
		
		
		driver.close();
	}

}
