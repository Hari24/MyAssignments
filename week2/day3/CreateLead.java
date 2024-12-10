package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABCD Pvt Ltd.");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ABCD");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ltd");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("ABCD Pvt Ltd.");
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(5000);
		String sActualTitle = driver.findElement(By.xpath("//span[@id='viewLead_generalProfTitle_sp']")).getText();
		System.out.println(sActualTitle);
		String sExpectedTitle = "ABCD Pvt Ltd.";
		if (sActualTitle.equals(sExpectedTitle)) {
			System.out.println("Lead created and verified");
		}
		driver.close();
		}
		
	}


