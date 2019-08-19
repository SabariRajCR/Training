package week1.day2.Assignment;

import java.util.Arrays;

import org.apache.poi.ss.formula.functions.Replace;

public class RemoveDuplicatesInArray {

		public static void main(String[] args) {
			
		int[] a = {1,2,1,22,23,34,44,33,34,22,1,34};
		
				
		int[] sum = new int[] {};
		
		for(int i=0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					a[i] = 0;
					
				}
									
				}		
		
				}	
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]!=0) {
				
				System.out.print(a[i]+" ");
			}
		}
		}
}

