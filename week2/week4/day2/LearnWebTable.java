package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/table.xhtml");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));
		 List<WebElement> rows = table.findElements(By.tagName("tr"));
		 int rowSize = rows.size();
		 System.out.println("Number of rows = "+rowSize);
		 
		 List<WebElement> columns = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//th")); // use ' // ' before th so as to select all th
		 int columnSize = columns.size();
		 System.out.println("Number of columns =  "+columnSize);;
		 
		 // to retrieve 2nd row
		 
		 List<WebElement> row2Data = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[2]/td"));
		 System.out.println(row2Data);
		 
		 for (int i=0; i<row2Data.size();i++) {
			 String text = row2Data.get(i).getText();
			 System.out.println("2nd Row Data is : "+text);
		 }
		 
	for (int i=1;i<rowSize;i++) {	 
			 WebElement rowValue = table.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td"));
	for (int j=1;j<columnSize;j++) {
		   WebElement allData = rowValue.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td["+j+"]"));
		   String allTableValues = allData.getText();
		   System.out.println("All data is: "+allTableValues);
	}

	}
	

	}

}
