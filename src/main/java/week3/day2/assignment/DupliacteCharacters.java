package week3.day2.assignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DupliacteCharacters {

	public static void main(String[] args) {
		
		String company = "Infosys Limited";
		
		String comp = company.replace(" ","");
		
		char[] ch = comp.toCharArray();
		
		
		Map<Character,Integer> com = new LinkedHashMap<Character,Integer>();
		
		for (char c : ch) 
		{
			if(com.containsKey(c)){
				
				com.put(c,com.get(c)+1);
				System.out.println(c);
			}else{
				
				com.put(c,1);
			}
			
			
			
		}
		
		/*System.out.println(com);
				
		for (Entry<Character, Integer> entrySet:com.entrySet() ) {
			
			if(entrySet.getValue()>1){
				
				System.out.print(entrySet.getKey());
			}
			
			
		}*/
		
				

	}

}
