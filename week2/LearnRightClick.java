package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Actions rightClickElement = new Actions(driver);
	WebElement Element1 = driver.findElement(By.xpath("//span[text()='right click me']"));
	rightClickElement.contextClick(Element1).perform();
	
	 WebElement contextMenuOption = driver.findElement(By.xpath("//span[text()='Copy']"));
     contextMenuOption.click();
	
	
	

	}

}
