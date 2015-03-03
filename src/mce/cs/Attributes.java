package mce.cs;
import java.util.*;

public class Attributes {
	public Dictionary variables = new Hashtable();
	Attributes(){
		this.variables.put("M",0 );
		this.variables.put("F",1 );
		this.variables.put("YES",0 );
		this.variables.put("NO",1 );
		this.variables.put("A",0 );
		this.variables.put("B",1 );
		this.variables.put("C",2 );
		this.variables.put("LOW",0 );
		this.variables.put("AAVG",1 );
		this.variables.put("BAVG",2 );
		this.variables.put("HIGH",3 );
		System.out.println(this.variables);
	}
	
}
