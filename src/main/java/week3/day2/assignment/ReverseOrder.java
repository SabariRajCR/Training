package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseOrder {
	
	public static void main(String[] args) {
		
		String[] s = {"HCL","TCS","CTS","Aspire System"};
		
		List<String> company = new ArrayList<String>();
		
		for (String company2 : s) {
			
			company.add(company2);
			
		}
		
		// or we can use ----> company.addAll(Arrays.asList(s));
		
		System.out.println(company);
		
		Collections.reverse(company);
		
		System.out.println(company);
		
			
		
	}

}
