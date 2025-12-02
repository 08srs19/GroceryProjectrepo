package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constant.Constant;

public class ExcelUtilities {
		static FileInputStream f;
		static XSSFWorkbook w;
		static XSSFSheet s;
	public static int getIntegerData(int a,int b, String sheet) throws IOException 
	{
		String filepath=Constant.TESTDATAFILE;
		f=new FileInputStream(filepath);
		w=new XSSFWorkbook(f);
		s=w.getSheet(sheet);
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		int y= (int) c.getNumericCellValue();//type casting
		return y;
		
	}
	public static String getStringData(int a,int b, String sheet) throws IOException 
	{
		String filepath=Constant.TESTDATAFILE;
		f=new FileInputStream(filepath);
		w=new XSSFWorkbook(f);
		s=w.getSheet(sheet);
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue();
	}
}
