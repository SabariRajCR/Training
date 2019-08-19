package week5.day2.assignment;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData {
@Test(invocationCount=2)
	//public static void main(String[] args) throws IOException {
		public void excdata()throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//vl return the last index value
		int lastRowNum = sheet.getLastRowNum();
		//vl return last index value + 1
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		
		for (int j = 1; j <=lastRowNum ; j++) {
			XSSFRow row = sheet.getRow(j);
			for (int i = 0; i < lastCellNum; i++) {
				XSSFCell cell = row.getCell(i);
				String value = cell.getStringCellValue();
				System.out.println(value);
			} 
		}
/*		//will return the size including header including '0' index
		System.out.println(sheet.getPhysicalNumberOfRows());*/
      workbook.close();
	
		}

}
