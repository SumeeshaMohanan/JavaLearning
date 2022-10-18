package ExcelReadPackage;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
ExcelCode obj= new ExcelCode();//Excelcode constructor in ExcelCode class is invoked

String str=obj.Readdata(0, 0);
System.out.println(str);

String str1=obj.Readdata(0, 1);
System.out.println(str1);

String str2=obj.Readdata(1, 0);
System.out.println(str2);

String str3=obj.Readdata(1,1);
System.out.println(str3);
	}

}
