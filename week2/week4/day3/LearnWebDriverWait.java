package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriverWait {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		
		//Instanstiate webdriver wait class
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement firstClickButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click']")));
		firstClickButton.click();
		 WebElement IamHereText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		 
		//WebElement IamHereText = driver.findElement(By.xpath("//span[text()='I am here']"));
		boolean textDisplayed = IamHereText.isDisplayed();
		System.out.println("Text after Clicking button is Visible: "+textDisplayed);
		
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		Boolean InvisibleElement = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		System.out.println("Status of Invisible element: "+InvisibleElement);
		
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		WebElement ThirdClickButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Click Second']")));
		//System.out.println(ThirdClickButton);
		driver.findElement(By.xpath("//span[text()='Click Second']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		Boolean textChanged = wait.until(ExpectedConditions.textToBe(By.xpath("//span[text()='Did you notice?']"), "Did you notice?"));
		System.out.println("Is text Changed: "+textChanged);
		
		
		
		
		

	}

}
