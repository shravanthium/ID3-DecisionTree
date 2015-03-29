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
		ArrayList<VectorRep> col = new ArrayList<VectorRep>();
		
		for(int i=0; i<7;i++){
			VectorRep v = new VectorRep();
			col.add(v);
		}
		try {
			br = new BufferedReader(new FileReader(csvFile));
  		  	Compute ent = new Compute();
			while ((line = br.readLine()) != null) {
				String[] st = line.split(cvsSplitBy); 
	  		  	col.get(0).add(st[0]);
	  		  	col.get(1).add(st[1]);
	  		  	col.get(2).add(st[2]);
	  		  	col.get(3).add(st[3]);
	  		  	col.get(4).add(st[4]);
	  		  	col.get(5).add(st[5]);
	  		  	col.get(6).add(st[6]);
			}
			System.out.print("Column Size:" +col.get(0).v.size()+"\n");
  		  System.out.print("Gain :"+ent.gain(col));

	 
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
	 } 
}