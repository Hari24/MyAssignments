package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnScrolltoElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Actions scrollElement = new Actions(driver);
	
	// Scroll till the end -
	/*WebElement Element1 = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
	Thread.sleep(3000);
	scrollElement.scrollToElement(Element1).perform();
	Element1.click();*/
	
	//Scroll a little bit
	scrollElement.scrollByAmount(10, 10);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[text()='Shop fashion']")).click();
	
	
	
	}

}
