package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Sheet;
import jxl.Workbook;

public class Scenario48DataDrivenJXL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Srujan\\Documents\\Book1.xls");

		Workbook wb= Workbook.getWorkbook(fis);
		
		Sheet s=wb.getSheet(0);
		
		//jxl: sheet, row, column: will stary from 0 onwards
		
		String x=s.getCell(3, 2).getContents();
		//getcell(col,row): it will select the specified cell
		//getContents: will get the content feom the selected cell
		
		System.out.println(x);
		
		
		for(int i=0;i<s.getRows();i++){
			
			String x1=s.getCell(1, i).getContents();
			System.out.println(x1);
		}
		
		
		for(int i=0;i<s.getColumns();i++){
			
			String x2=s.getCell(i, 10).getContents();
			System.out.println(x2);
		}
		
	}

}
