package sabari;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String[] a = {"asa","asasa","dgsgdjh"};
		
		String b[] = new String[3];
		
		b[0] ="hjkhjk";
		b[1] = "hkjh,";
		b[2] ="uiyiu";
		
		System.out.println(b[0]);
		
		for (int i = 0; i < b.length; i++) {
			
			System.out.println(b[i]);
		}
		
		for ( String c : a) {
			
			System.out.println(c);
			
		}
		
		
		
		

	}

}
