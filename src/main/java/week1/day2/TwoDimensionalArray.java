package week1.day2;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a[][] = new int[2][3];
		
		for(int i=0;i<a.length;i++){
			for(int j = 0;j< a[i].length;j++){
				a[i][j] = s.nextInt();
			}
					
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				
				System.out.print(a[i ][j ]);
			}
			System.out.println();
		}
		
		

	}

}
