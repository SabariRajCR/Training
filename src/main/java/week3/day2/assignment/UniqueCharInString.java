package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.collections4.Get;
import org.apache.commons.collections4.Put;
import org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter;

public class UniqueCharInString {

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
		
					
		for (Entry<Character,Integer> entrySet : c.entrySet()) {
			
			if(entrySet.getValue()==1){
			
				System.out.print(entrySet.getKey());
	
			}
		
					
		}
		System.out.println();
		for (int i=0;i<name3.length;i++) {
			
			if(c.get(name3[i])==1){
				
				System.out.print(name3[i]);
			}
			
		}
		
		}

	}


