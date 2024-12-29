package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		String parentAddress = driver.getWindowHandle();
		System.out.println("Parent window address is: "+parentAddress);
		Set<String> allHandles = driver.getWindowHandles();
	    System.out.println("All window addressess are : "+allHandles);
		List<String> allWindowAddresses = new ArrayList<String>(allHandles);
		
		
		driver.switchTo().window(allWindowAddresses.get(1));
		String sChildTitle = driver.getTitle();
		
		System.out.println("Child Window title is: "+sChildTitle);
		
		driver.close();
		
		driver.switchTo().window(allWindowAddresses.get(0));
		String sCurrentTitle = driver.getTitle();
		
		System.out.println("Current Window title is: "+sCurrentTitle);
		

	}

}
