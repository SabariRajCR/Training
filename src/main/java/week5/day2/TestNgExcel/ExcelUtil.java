package week5.day2.TestNgExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtil {
	@Test
	public static Object[][] readExcelData(String Filename) throws IOException {
		XSSFWorkbook wbook = 
				new XSSFWorkbook("./data/"+Filename+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowNum = sheet.getLastRowNum();
		short cellNum = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowNum][cellNum];
		for (int j = 1; j <= rowNum; j++) {
			XSSFRow row = sheet.getRow(j);
			for (int i = 0; i < cellNum; i++) {
				XSSFCell cell = row.getCell(i);
				String value = cell.getStringCellValue();
				data[j-1][i] = value; 
			   System.out.println(value);
			} 
		}
		wbook.close();
		return data;
		
		
	}



}
