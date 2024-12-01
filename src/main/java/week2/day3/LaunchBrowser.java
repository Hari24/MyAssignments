package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABCD");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karanam");
		
		//driver.findElement(By.id("createLeadForm_dataSourceId")).sel
		WebElement SourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown1 = new Select(SourceDropdown);
		dropdown1.selectByIndex(4);
		
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("lead created");
		
		String ExpectedTitle = driver.getTitle();
		System.out.println(ExpectedTitle);
		if (ExpectedTitle.equals("View Lead | opentaps CRM")) {
		    System.out.println("Title matches!");
		} else {
		    System.out.println("Title does not match!");
		}
		
		driver.close();
	}
}
