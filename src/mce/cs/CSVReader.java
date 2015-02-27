package mce.cs;

import java.io.BufferedReader; 

import java.io.FileReader; 

import java.util.StringTokenizer; 

public class CSVReader { 

  public static void main(String[] args) { 
    try { 
      String csvfile = "book.csv"; 
      BufferedReader br = new BufferedReader(new FileReader(csvfile)); 
      String line = ""; 
      StringTokenizer st = null; 
      while ((line = br.readLine())!= null) { 
        st = new StringTokenizer(line, ","); 
        while (st.hasMoreTokens()) { 
          System.out.print(st.nextToken() + "  "); 
        } 
        System.out.println(); 
      } 
    } catch (Exception e) { 
      System.err.println("file cannot be read : " + e); 
    } 
  } 
}