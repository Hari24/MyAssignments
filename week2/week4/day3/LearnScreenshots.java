package week4.day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshots {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		// Take the screenshot - source
		
		File source = driver.getScreenshotAs(OutputType.FILE);
				
		// setup the path to store the image - destination
		File destination = new File("./screenshots/homepage.png");
		
		//Combine source and destination
		FileUtils.copyFile(source, destination);
		
		
		//To find particular element
		WebElement textElement = driver.findElement(By.id("username"));
		
		File source1 = textElement.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("./screenshots/UserNameField.png");
		FileUtils.copyFile(source1, destination1);
		
		
		WebElement loginArea = driver.findElement(By.xpath("//h2[text()='Leaftaps Login']/following-sibling::form"));
		
		File source2 = loginArea.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("./screenshots/loginAreaFields.jpg");

		FileUtils.copyFile(source2,destination2);
		
	}

}
