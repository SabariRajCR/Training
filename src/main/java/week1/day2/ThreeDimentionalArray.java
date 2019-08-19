package week1.day2;

import java.util.Scanner;

public class ThreeDimentionalArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[][][] a = new int[3][3][3];
		
//		a[0] = new int[][5];
//		a[1] = new int[5][5];
//		a[3] = new int[5][5];
//		
		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<a[i].length;j++){
				
				for(int x=0;x<a[i][j].length;x++){
					
					System.out.print("Enter the value");
					
					a[i][j][x] = s.nextInt();
				}
				System.out.println();
			}
		}
		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<a[i].length;j++){
				
				for(int x=0;x<a[i][j].length;x++){
					
					//System.out.print("Enter the value");
					
					System.out.print(a[i][j][x]) ;
				}
				System.out.println();
						}
			System.out.println();
		}	
		
	}

}
