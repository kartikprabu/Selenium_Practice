package webElements;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/gis00227/eclipse-workspace/Letcodepractice/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		// Accept alert
		driver.findElementById("accept").click();
		Alert alrt = driver.switchTo().alert();
		String str = alrt.getText();
		System.out.println("Sample Text is: "+str);
		alrt.accept();
		
		// Dismiss
		driver.findElementById("confirm").click();
		driver.switchTo().alert().dismiss();

		// Prompt Alert
		driver.findElementById("prompt").click();
		driver.switchTo().alert().sendKeys("Kartik");
		driver.switchTo().alert().accept();
		String outpt = driver.findElementById("myName").getText();
		System.out.println(outpt);
		
		//Modern Alert
		driver.findElementById("modern").click();
		driver.getCurrentUrl();
		driver.findElementByXPath("//button[@class='modal-close is-large']").click();
		driver.quit();
		
	}

}
