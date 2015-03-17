package mce.cs;

import java.util.*;

public class Compute {
	
	public static List probability(VectorRep values){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Enumeration vEnum = values.v.elements();
		for(int i=0; i<values.v.size();i++){
  			int key= (int) vEnum.nextElement();
			if(!map.containsKey(key)){
				map.put(key, 0);
			}
			map.put(key, map.get(key)+1);
		}
		List frequency = new ArrayList();
		 
		for(Integer seq: map.keySet()){
			frequency.add((double) map.get(seq) / values.v.size());
		}
		return frequency;
	}
	
	public static Map bayes_freq(VectorRep var,VectorRep clasLabel){
		
		Map map = new HashMap();
		Enumeration enum1 = var.v.elements();
		Set set = new HashSet((Collection) enum1);
		while(set.iterator().hasNext()){
			map.put(set.iterator().next(), new VectorRep());
		}
		Enumeration enum2 = clasLabel.v.elements();
		for(int i=0; i<clasLabel.v.size();i++){
			VectorRep vec = (VectorRep) map.get(enum1.nextElement());
			int key= (int) enum2.nextElement();
			vec.v.add(key);
			map.put(enum1, vec);
		}
		return map;

	}

	public static double entropy(VectorRep values){
		
		double result = 0;
		List frequency = probability(values);
		for(int i=0; i<frequency.size();i++){
			double item = (double) frequency.get(i);
			result -=  item * (Math.log(item) / Math.log(2));
		}
		return result;
		
	}
	
	
	public static double gain(List <VectorRep> values){
		double result = 0;
		double label_entropy = entropy(values.get(values.size()-1));
		
		double gain=0;
		for(int i=0; i<values.size()-1;i++){
			Map map = bayes_freq(values.get(i),values.get(values.size()-1));
			double g = 0;
			List freq = probability(values.get(i));
			for(Object seq: map.keySet()){
				double item = (double) freq.iterator().next();
				g	-= label_entropy -(double) entropy((VectorRep)map.get(seq));
			}
			System.out.print((i+1)+" : "+g+"\n");
			if (g>gain){
				gain =g;
			}
		}
		return gain;
		
	}
}
