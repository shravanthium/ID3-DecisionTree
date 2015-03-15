package mce.cs;

import java.io.FileNotFoundException;
import java.util.*;

public class VectorRep {
	Vector v;
	
	VectorRep(){
		this.v = new Vector();
	}
	public void add(String elem){
		Attributes var = new Attributes();
		try{
			if(Integer.parseInt(elem) == 1){
				v.addElement(var.variables.get("A"));
			}
			else if(Integer.parseInt(elem) <= 5){
				v.addElement(var.variables.get("B"));
			}
			else if(Integer.parseInt(elem) <=20){
				v.addElement(var.variables.get("C"));
			}
			else if (Integer.parseInt(elem) >20){
				v.addElement(var.variables.get("D"));			
			}
			}
		catch (NumberFormatException e){
			
			v.addElement(var.variables.get(elem));		
		}
	}

	
}
