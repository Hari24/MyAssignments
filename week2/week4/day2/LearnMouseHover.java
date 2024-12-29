package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
	        ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//driver.findElement(By.xpath("//button[text()='Yes, I’m In']")).click();
		/*		WebElement activeElement = driver.switchTo().activeElement();
	    activeElement.sendKeys(Keys.ESCAPE); */
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions mousehover = new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath("//div[text()='Brands']"));
		mousehover.moveToElement(element1).perform();
		
		
	}

}
