package excelRead;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		String a=ExcelReadDemo.readStringData(1,1);
		System.out.println("value of a is:"+a);
		String b=ExcelReadDemo.readIntegerData(0,0);
		System.out.println("value of b is:"+b);


	}

}
