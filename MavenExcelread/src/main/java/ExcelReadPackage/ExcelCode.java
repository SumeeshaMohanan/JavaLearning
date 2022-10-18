package ExcelReadPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	XSSFSheet sh;// sh is a variable of type XSSFSheet(same as int a)
	
	ExcelCode() throws IOException
	{
	FileInputStream f= new FileInputStream("C:\\Users\\AROMAL\\git\\ExcelRead\\src\\main\\resources\\Book1.xlsx");
	
	//we are going into the file location,f is an object of class FileInputStream
	XSSFWorkbook w=new XSSFWorkbook(f);// we are opening the book, w is an object of class XSSF of Workbook
	sh=w.getSheet("Sheet1");// we are getting into the sheet
	}
	public String Readdata(int row,int column) // here we use instance methods, we have also use the static methods here
	{
		Row r=sh.getRow(row);//we are getting the row 
		Cell c=r.getCell(column);//we are getting to the cell using row,column 
		int celltype=c.getCellType();// here we are creating switch case variable to identify whether the value is numeric/string/null
		
		switch(celltype)
		{
			case Cell.CELL_TYPE_NUMERIC:// If the value is numeric, we convert it to double and then to string because the read data 
				//function can return null value
			{
				double val=c.getNumericCellValue();//if the value is string, we are returning it directly
				return String.valueOf(val);
			}
			case Cell.CELL_TYPE_STRING:
			{
				return c.getStringCellValue();//If the value is string, we are returning it directly
				
			}
		}
		
		return null;// if there is no data in cell 
}
}