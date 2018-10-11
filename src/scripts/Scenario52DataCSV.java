package scripts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;

public class Scenario52DataCSV {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String CSV_PATH="C:\\Users\\Srujan\\Downloads\\library\\Product Ids.csv";
		
		 CSVReader reader = new CSVReader(new FileReader(CSV_PATH));
		 
		 List<String[]> val=reader.readAll();
		 
		 //readAll();: this will read the entier info from the file n it is going to store in a list of strings
 
		 for(int i=0;i<val.size();i++){
			 
			 String p1=val.get(i)[3];
			 System.out.println(p1);
			 
			 
		 }
		 
		 
	}

}
