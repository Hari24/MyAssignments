package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaitingForMultipleWindows {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		
		//Instanstiate webdriver wait class
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		System.out.println("3 windows opened - Task done");
		
		

	}

}
