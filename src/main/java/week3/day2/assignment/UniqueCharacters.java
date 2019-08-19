package week3.day2.assignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UniqueCharacters {

	public static void main(String[] args) {
		
		String n = "Amazon India Private Limited";
		
		String n1 = n.replace(" ", "");
		char[] ch = n1.toCharArray();		

		Map<Character,Integer> cmap = new LinkedHashMap<Character,Integer>();
		
		for (char c : ch) {
			
			if(cmap.containsKey(c)){
				
				cmap.put(c,cmap.get(c)+1);
				
			}else{
				
				cmap.put(c,1);
			}
			
		}
		System.out.println(cmap);
		
		
		
		for (Entry<Character,Integer> entrySet:cmap.entrySet()) {
			
			if (entrySet.getValue()==1) {
				
				System.out.print(entrySet.getKey());
				
			}
			
			
		}
		
		
		
	}

}
