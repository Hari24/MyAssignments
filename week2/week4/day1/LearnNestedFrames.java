package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrames {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		
		WebElement outerframe = driver.findElement(By.xpath("//h5[contains(text(),'Inside Nested frame')]/following-sibling::iframe"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame(outerframe);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame("frame2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//driver.findElement(By.xpath("(//button[text()='Click Me'])[2]")).click();
		driver.findElement(By.id("Click")).click();
		
		//switching back to main web page
		driver.switchTo().defaultContent();
		
		//switching driver focus to immediate parent frame
		driver.switchTo().parentFrame();
		

	}

}
