package mce.cs;

import java.util.*;

public class VectorRep {
	Vector v;
	VectorRep(Dictionary row){
		Attributes var = new Attributes();
		this.v = new Vector();
		v.addElement(var.variables.get(row.get(0)));
		v.addElement(var.variables.get(row.get(1)));
		v.addElement(var.variables.get(row.get(2)));
		v.addElement(var.variables.get(row.get(3)));
		v.addElement(var.variables.get(row.get(4)));		
		int yr = (int) row.get(5);
		if(yr == 1){
			v.addElement(var.variables.get("A"));
		}
		else if(yr <= 5){
			v.addElement(var.variables.get("B"));
		}
		else if(yr <=20){
			v.addElement(var.variables.get("C"));
		}
		else{
			v.addElement(var.variables.get("D"));			
		}
		v.addElement(var.variables.get(row.get(6)));	
	}

	
}
