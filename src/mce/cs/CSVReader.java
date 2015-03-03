package mce.cs;

import java.io.BufferedReader; 
import java.io.FileReader; 
import java.util.*; 

public class CSVReader { 

  public static void main(String[] args) { 
    try { 
      String csvfile = "book.csv"; 
      BufferedReader br = new BufferedReader(new FileReader(csvfile)); 
      String line = ""; 
      ArrayList records = new ArrayList();
      StringTokenizer st = null; 
      
      while ((line = br.readLine())!= null) { 
    	  Dictionary dict = new Hashtable();
    	  st = new StringTokenizer(line, ",");
    	  System.out.println(st.toString());
    	  for (int i = 0; i <= st.countTokens(); i++) {
    		  System.out.println(i);
    		  dict.put(i, st.nextToken());
    	  }
    	  System.out.println(dict);
    	  Record r = new Record(dict); 
    	  //records.add(r);
    	  System.out.println(dict);
      }
      
      
    } catch (Exception e) { 
      System.err.println("file cannot be read : " + e); 
    } 
  } 
}