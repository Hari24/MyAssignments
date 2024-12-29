package ExcelIntegration;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void setValues() {
		fileName="CreateLeads";
	}
    
	@Test(dataProvider="sendData")
	public  void RunCreatelead(String cName,String fName,String lName,String gTitle) throws InterruptedException {
		
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(gTitle);
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(5000);
		String sActualTitle = driver.findElement(By.xpath("//span[@id='viewLead_generalProfTitle_sp']")).getText();
		System.out.println(sActualTitle);
		//String sExpectedTitle = "test3 Pvt Ltd.";
		if (sActualTitle.equals(gTitle)) {
			System.out.println("Lead created and verified");
		}
		
		}
		
	}


