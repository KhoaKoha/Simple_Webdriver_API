package scripts;

public class Scenario49DataPOI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Xls_Reader read= new Xls_Reader("C:\\Users\\Srujan\\Documents\\Book2.xlsx");
		
		String x1=read.getCellData("Sheet1", "username", 5);
	
		//rows, n columns from 1 onwards, where as in jxl we started counting from 0 inwards
		
		System.out.println(x1);
		
		//we need to get values from pswd column my column is constant n row is changning
		
		for(int i=0;i<read.getRowCount("Sheet1");i++){
			
			String x2=read.getCellData("Sheet1", "password", i);
			
			System.out.println(x2);
		}
		
		//read the blaeus from the row also
		
	}

}
