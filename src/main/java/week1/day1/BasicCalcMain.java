package week1.day1;

public class BasicCalcMain {
    
		
	public static void main(String[] args) {
		
		int a = 10;
		int b= 5;
		
		BasicCalcMethod calc = new BasicCalcMethod();
		int add = calc.Add(a, b);
		
		System.out.println("addition  " + add);
		
		int sub = calc.Sub(a, b);
		System.out.println("Subraction  "+ sub );
		int mult = calc.Mult(a, b);
		System.out.println("Multiplication  "+ mult);
		int division = calc.division(a, b);
		System.out.println("Division  "+ division );		
		
	}

}
