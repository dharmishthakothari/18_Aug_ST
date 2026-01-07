package Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public static void main(String[] args) throws Exception {
		ExcelUtil obj=new ExcelUtil();
		Object[][] data=new Object[10][10];
		data=obj.getData("C:\\Users\\Admin\\Downloads\\Login.xlsx","Sheet1");
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print("\t"+data[i][j]);
			}
			System.out.println();
		}
		
		
	}

	public Object[][] getData(String path,String sheetname) throws Exception {
		// TODO Auto-generated method stub

	
		XSSFWorkbook book=new XSSFWorkbook(path);
		Sheet sheet=book.getSheet(sheetname);
					
//		Row r=sheet.getRow(2);
//		Cell cell=r.getCell(0);
//		Cell cell1=r.getCell(1);
//		System.out.println(cell.getStringCellValue());
//		System.out.println(cell1.getStringCellValue());
		
		
		int no_of_row=sheet.getPhysicalNumberOfRows();
		String[][] data=new String[no_of_row][2];
		for(int i=0;i<no_of_row;i++)
		{
			Row r=sheet.getRow(i);
			Cell celUsername=r.getCell(0);
			Cell celPass=r.getCell(1);
			data[i][0]=celUsername.getStringCellValue();
			data[i][1]=celPass.getStringCellValue();
			//System.out.println(celUsername.getStringCellValue()+"   "+celPass.getStringCellValue());
		}
		return data;
		
	}

}
