package ExcelIntegration;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName,String sheetName) throws IOException {
		//To open the workbook
		//XSSFWorkbook wb = new XSSFWorkbook("./Data/Leads.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+fileName+".xlsx");
		
		//Enter the corresponding worksheet
		//XSSFSheet ws = wb.getSheet("Details");
		XSSFSheet ws = wb.getSheet(""+sheetName+"");
	
		//Count rows excluding headers
		int rowCount = ws.getLastRowNum();
		System.out.println("Row count excluding headers: "+rowCount);
		
		//Count rows including headers
		int rowCount1 = ws.getPhysicalNumberOfRows();
		System.out.println("Row count including headers: "+rowCount1);
		
		//Get Column Count
		int columnCount = ws.getRow(0).getLastCellNum();
		System.out.println("Column count: "+columnCount);
		
		//to retrieve particular cell ,for example value "Hari"
		String cellValue = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Value at row1 , column1: "+cellValue);
		
		
		// Declare String
		String[][] data = new String[rowCount][columnCount];
		
		//Retrieve entire data
		for (int i=1;i<rowCount1;i++) {
			XSSFRow row = ws.getRow(i);
			for (int j=0;j<columnCount;j++) {
				String allData = row.getCell(j).getStringCellValue();
				System.out.println("Data in Excel book: "+allData);
				data[i-1][j]=allData;
			}
			
		}
		wb.close();
		return data;

	}

}
