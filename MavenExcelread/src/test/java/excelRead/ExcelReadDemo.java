package excelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadDemo {
	public static XSSFSheet sh;
	public static FileInputStream file;
	public static XSSFWorkbook wbook;

	public static String readStringData(int i, int j) throws IOException {
		file = new FileInputStream("C:\\Users\\AROMAL\\eclipse-workspace\\My_mavenExcelread\\src\\test\\resources\\Book1.xlsx");
		wbook = new XSSFWorkbook(file);
		sh = wbook.getSheet("Sheet1");
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		return c.getStringCellValue();
	}

	public static String readIntegerData(int i, int j) throws IOException {
		file = new FileInputStream("C:\\Users\\AROMAL\\eclipse-workspace\\My_mavenExcelread\\src\\test\\resources\\Book1.xlsx");
		wbook = new XSSFWorkbook(file);
		sh = wbook.getSheet("Sheet1");
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		int a = (int) c.getNumericCellValue();
		return String.valueOf(a);
	}
}
