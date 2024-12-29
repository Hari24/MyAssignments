package week4.day3;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnClickandHold {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		Actions clickElement = new Actions(driver);
		
		WebElement element1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement element2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement element3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		
		//clickElement.clickAndHold(element1).clickAndHold(element2).clickAndHold(element3).perform();
		//clickElement.clickAndHold(element2).moveToElement(element3).moveToElement(element4).release().perform();
		
		clickElement.keyDown(Keys.CONTROL).click(element1).click(element2).click(element3).perform();
		
	

		
	}

}
