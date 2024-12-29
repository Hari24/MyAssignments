package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.switchTo().frame(3);
		WebElement outerframe = driver.findElement(By.xpath("//h5[contains(text(),'Inside Nested frame')]/following-sibling::iframe"));
		driver.switchTo().frame(outerframe);
		Thread.sleep(2000);
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("(//button[text()='Click Me'])[2]")).click();
	}

}
