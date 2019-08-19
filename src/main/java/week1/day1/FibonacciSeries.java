package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int t1 = 0;
		int t2 = 1;
		int sum;
		for (int i=0;i<=20;i++) {
			
			System.out.println(t1);
			sum = t1+t2;
			t1=t2;
			t2=sum;
			
			
		}

	}

}
