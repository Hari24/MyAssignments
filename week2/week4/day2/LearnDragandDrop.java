package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnDragandDrop {

	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
	        ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions dragNdrop = new Actions(driver);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement Element1 = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement Element2 = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		dragNdrop.dragAndDrop(Element1, Element2).perform();
		

	}

}
