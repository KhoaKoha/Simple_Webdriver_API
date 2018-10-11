package scripts;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Scenario51DataTextFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//C:\\Users\\Srujan\\Documents\\
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Srujan\\Documents\\nandu.txt");
		
		BufferedReader br =new BufferedReader(new InputStreamReader(fis));
		//as of now the entire file info got stored in br.
		
		/*String val=br.readLine();

		System.out.println(val);
	
	*/
		String x;
		while((x=br.readLine())!= null){
			
			//rotate this loop till the last value in the br which is a file text
			
			System.out.println(x);
			
			String a[]=x.split(",");
			
			//[]: represents an array which is of string type: means when we r spliting a string it comes multiple substring hence we are stroing all the string in an array
			
			
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
			
			
		}
	
	}

}
