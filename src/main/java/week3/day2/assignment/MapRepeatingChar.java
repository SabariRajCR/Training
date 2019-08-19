package week3.day2.assignment;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapRepeatingChar {

	public static void main(String[] args) {
		
		String name = "capgemini";
		
		char[] charArray = name.toCharArray();
		
		Map<Character,Integer> company = new LinkedHashMap<Character,Integer>();
		
		for (char c : charArray) {
			
			if(company.containsKey(c)) {
				
				Integer a = company.get(c)+1;
				company.put(c,a);
			}
			else {
				company.put(c, 1);
							
		}
		
			
		}
		System.out.println(company);
		
		//To iterate the hash keys and values separately
		
		for (Entry<Character, Integer> entrySet : company.entrySet()) {
			
			//System.out.println(entrySet);
			System.out.println(entrySet.getKey()+"----->"+entrySet.getValue());
			
		}
	}

}

