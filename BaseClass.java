package ExcelIntegration;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	
	public ChromeDriver driver;
	public String fileName;
	public String sheetName;
	
	
	@Parameters({"URL","USERNAME","PASSWORD"})
	@BeforeMethod
	
	//This is for CreateLead method
	public void preCondition(String url, String user,String pass) throws InterruptedException  {
	//public void preConditions(@Optional("http://leaftaps.com/opentaps/") String url, @Optional("Demosalesmanager") String username, @Optional("crmsfa") String password) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);		
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    Thread.sleep(2000);
		
	}
	
	

	@AfterMethod
	public void postCondition() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	
	@DataProvider
	public String[][] sendData() throws IOException {
		return ReadExcel.readData(fileName,sheetName);
		
	}
	

}
