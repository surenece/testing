package Excel_lib;

import java.util.ArrayList;

import Test_data.Xls_Reader;

//import com.gargoylesoftware.htmlunit.javascript.host.Console;

//import demo.Xls_Reader;

public class testutility_xl {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getdata(){
		
		
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		
		reader= new Xls_Reader("C:\\Users\\suthanthira_devi\\workspace\\com.qa.canGen\\src\\main\\java\\Excel_lib\\cansheet(1).xlsx");
		
		for(int i = 2; i <= reader.getRowCount("Sheet1");i++ ){
			
			//for(int j=2;j<=reader.getRowCount(i).getLastCellNum();j++)
		//int i=2;
			
			
			
			String adhar= reader.getCellData("Sheet1", "adhar", i);

			String appel= reader.getCellData("Sheet1", "appel", i);
			
			String sex= reader.getCellData("Sheet1", "sex", i);
			
			String name= reader.getCellData("Sheet1", "name", i);
			
			String maritalsts= reader.getCellData("Sheet1", "maritalsts", i);
			
			String DOB= reader.getCellData("Sheet1", "DOB", i);
			
			String Relationship= reader.getCellData("Sheet1", "Relationship", i);
			
			String F_name= reader.getCellData("Sheet1", "F_name", i);
			
			String M_name= reader.getCellData("Sheet1", "M_name", i);
			
			String relgn= reader.getCellData("Sheet1", "relgn", i);
			
			String cmunty= reader.getCellData("Sheet1", "cmunty", i);
			
			String wrk= reader.getCellData("Sheet1", "wrk", i);
			
			String Dis= reader.getCellData("Sheet1", "Dis", i);
			
			String Tal= reader.getCellData("Sheet1", "Tal", i);
			
			String village= reader.getCellData("Sheet1", "village", i);
			
			String St_name= reader.getCellData("Sheet1", "St_name", i);
			
			String Stname_tn= reader.getCellData("Sheet1", "Stname_tn", i);
			
			String door_no= reader.getCellData("Sheet1", "door_no", i);
			
			String pin= reader.getCellData("Sheet1", "pin", i);
			
			String ph= reader.getCellData("Sheet1", "ph", i);
			
			
			
			Object obj[] = {adhar,appel,sex,name,maritalsts,DOB,Relationship,F_name,M_name,relgn,cmunty,wrk,Dis,Tal,
					village,St_name,Stname_tn,door_no,pin,ph};
			
			data.add(obj);
			//System.out.println("obj1");
			//System.out.println(Rating);
			//System.out.println("Rating");
		
		//return data;
			
			
		
		
	}
		return data;
		
			
		
			}
	
	
}
