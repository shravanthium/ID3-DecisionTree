package mce.cs;

import java.io.BufferedReader; 
import java.io.FileReader; 
import java.util.*; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader { 
/*Labels :GENDER,FAMILY,SMOKER,PASSIVE_SMOKER,CHEMICALS,YEARS,CLASS */

	public static void main(String[] args) { 
	    String csvFile = "book.csv"; 
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		ArrayList records = new ArrayList();
		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				String[] st = line.split(cvsSplitBy); 
				Dictionary dict = new Hashtable();
	  		  	dict.put(0, st[0]);
	  		  	dict.put(1, st[1]);
	  		  	dict.put(2, st[2]);
	  		  	dict.put(3, st[3]);
	  		  	dict.put(4, st[4]);
	  		  	dict.put(5, Integer.parseInt(st[5]));
	  		  	dict.put(6, st[6]);
	  		  	Record r = new Record(dict); 
	  		  System.out.println(st); 
			}
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Done");
	 } 
}