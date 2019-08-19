package week1.day2.Assignment;

public class SumAllDigitsInNumber {

	public static void main(String[] args) {
		
		int num = 1546;
		
		int sum = 0;
		int s;
		
		while(num>0){
			
			s= num%10;
			sum = sum+s;
			num = num/10;
			
					}
		
		
System.out.println(sum);

	}

}
