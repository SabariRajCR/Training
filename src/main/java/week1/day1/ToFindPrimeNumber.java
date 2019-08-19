package week1.day1;

public class ToFindPrimeNumber {

	public static void main(String[] args) {
		
		int num = 13;
		int count = 0;
		
		for(int i = 1;i<=13;i++) {
			
			if(num%i==0) {
			
			count++;
		}
	}
		if(count==2) {
			
			System.out.println("is prime");
		}
		else {
			
			System.out.println("not prime");
		}

		}
	}


