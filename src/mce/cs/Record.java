package mce.cs;

import java.util.*;

public class Record {
	public Dictionary gender = new Hashtable();
	public Dictionary family = new Hashtable();
	public Dictionary smoker = new Hashtable();
	public Dictionary passive_smoker = new Hashtable();
	public Dictionary chemicals = new Hashtable();
	public Dictionary years = new Hashtable();
	public Dictionary label = new Hashtable();
	
	Record(Dictionary row){
		Attributes var = new Attributes();
		System.out.println(row);
		this.gender.put(row.get(0), var.variables.get(row.get(0)));
		this.family.put(row.get(1), var.variables.get(row.get(1)));
		this.smoker.put(row.get(2), var.variables.get(row.get(3)));
		this.passive_smoker.put(row.get(3), var.variables.get(row.get(4)));
		this.chemicals.put(row.get(4), var.variables.get(row.get(4)));
		
		int yr = (int) row.get(5);
		if(yr <= 5){
			this.years.put("A", var.variables.get("A"));
		}
		else if(yr <=20){
			this.years.put("B", var.variables.get("B"));
		}
		else{
			this.years.put("C", var.variables.get("C"));			
		}
		this.label.put(row.get(6), var.variables.get(row.get(6)));
	}

	
}
