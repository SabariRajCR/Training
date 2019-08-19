package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SecondMostRepetingChar {

	public static void main(String[] args) {
		
	String name = "PayPal India";
		
		String name2 = name.replace(" ","");
		
		char[] name3 = name2.toCharArray();
		/*
		for(int i=0;i<name3.length;i++) {
			int count = 0;
			for(int j=0;j<name3.length;j++) {
				
				if(name3[i]==name3[j]) {
					
					count++;
				}
					
				}
			if(count==1) {
				
				System.out.print(name3[i]);
			}
			
		}*/
		
		Map<Character,Integer> c = new LinkedHashMap<Character, Integer>();
		for (Character s : name3) {
			if(c.containsKey(s)){
				
				c.put(s, c.get(s)+1);
			}
			else{
				
				c.put(s, 1);
			}
			
		}
		System.out.println(c);
		//System.out.println(c.get('P'));
		System.out.println();
		
		
		//System.out.println(c.values());
		
		
		List<Integer> list = new ArrayList<>(c.values());
		
		//System.out.println(list);
		
		Collections.sort(list);
		int size = list.size();
		
		System.out.println(size);
		
		System.out.println(list);
		
		System.out.println(list.get(size-2));
		
		System.out.println(c);
	
		
		System.out.println(c.entrySet());
		
		for(Entry<Character, Integer> entrySet2 : c.entrySet()){
			
			if(entrySet2.getValue()==list.get(size-2)){
				
				System.out.println(entrySet2.getKey());
			}
			
			
		}
		
	/*	for(int i=0;i<list.size();i++){
			
			if(c.get(name3[i])==list.get(size-2)){
				
				System.out.println(name3[i]);
				
			}
			
		}*/
		

	}

}
