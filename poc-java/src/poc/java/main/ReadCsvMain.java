package poc.java.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import poc.java.pojo.HeaderPojo;
import poc.java.pojo.LinePojo; 

public class ReadCsvMain {
	
	public static void main(String[] args) {
	       ReadCsvMain.read("D://read-file-java-poc1.csv");
	   }
		
	   public static final String delimiter = ";";
	   public static void read(String csvFile) {
	      try {
	         File file = new File(csvFile);
	         FileReader fr = new FileReader(file);
	         BufferedReader br = new BufferedReader(fr);
	         String line = "";
	         
	         while((line = br.readLine()) != null) {
	        	 
	        	if (line.startsWith("HAUDIT")) {
	        		HeaderPojo headerLineItem = new HeaderPojo();
	        		headerLineItem.setRecordType(line.split(";")[0]);
	        		headerLineItem.setTotalLines(Integer.parseInt(line.split(";")[1]));
	        		headerLineItem.setTotalAmt(Double.parseDouble(line.split(";")[2]));
	        		headerLineItem.setMinAmt(Double.parseDouble(line.split(";")[3]));
	        		headerLineItem.setCurrentDate(line.split(";")[4]);
	         		System.out.println(headerLineItem);
					
				}else {
					ArrayList<String> LineItemList = new ArrayList<String>();
					LinePojo lineItem = new LinePojo();
					lineItem.setRecordType(line.split(";")[0]);
					lineItem.setLineNumber(Integer.parseInt(line.split(";")[1]));
					lineItem.setRefDocNum(line.split(";")[2]);
					lineItem.setCity(line.split(";")[3]);
					lineItem.setAmount(Double.parseDouble(line.split(";")[4]));					
				}
	         }
	         
	         br.close();
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }
	   }
	   
	   
}