package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Hari200");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		/* WebElement SourceDropdown = driver.findElement(By.name("industryEnumId"));
		Select dropdown1 = new Select(SourceDropdown);
		dropdown1.selectByIndex(3); */
		new Select(driver.findElement(By.name("industryEnumId"))).selectByIndex(3);
		new Select(driver.findElement(By.name("ownershipEnumId"))).selectByVisibleText("S-Corporation"); 
		//new Select(driver.findElement(By.id("dataSourceId"))).selectByValue("LEAD_EMPLOYEE");
		new Select(driver.findElement(By.id("dataSourceId"))).selectByIndex(4);
		new Select(driver.findElement(By.id("marketingCampaignId"))).selectByIndex(6);
		new Select(driver.findElement(By.id("generalStateProvinceGeoId"))).selectByIndex(50);
		driver.findElement(By.className("smallSubmit")).click();
		
		String text = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		Thread.sleep(5000);
		System.out.println(text);
		//WebElement element = driver.findElement(By.className("tabletext"));
		
	/*	String strElement= element.getText();
		System.out.println(strElement);*/
		
		String sExpectedStr = "Hari200";
		if (text.contains(sExpectedStr) == true ){
			System.out.println("Account is created");
		}
		
		driver.close();

		
		
		
		
		

		

		


	}

}
