package week1.day1;

public class ListOfPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		for(int a=1; a<100; a++) {
			int count=0;
			for(int b=1; b<100; b++ ) {
				
				if(a%b==0) {
					count++;
									}
			}
			if(count==2) {
				System.out.println(a);
			}
			
			
		}
		
	}

}
