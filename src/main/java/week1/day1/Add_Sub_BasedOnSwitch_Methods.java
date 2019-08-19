package week1.day1;

public class Add_Sub_BasedOnSwitch_Methods {

	public int a = 1;
	public int b = 3;
	
	public static void main(String[] args) {
		
		// calling class
		Add_Sub_BasedOnSwitch_Methods calc = new Add_Sub_BasedOnSwitch_Methods();
		
		int operation = 5;
		
		switch(operation) {
		
		case 1:
			//calling Method
			int x = calc.Add();
			System.out.println(x);
			break;
		case 2:
			
			int y = calc.Sub();
			System.out.println(y);
			break;
			
		case 3:
			
			int z = calc.Mult();
			System.out.println(z);
			break;
			
		case 4:
			
			int w = calc.division();
			System.out.println(w);
			break;
			
		default:
			System.out.println("No operation to perform");
			break;			
			
		
		}

	}

	public int Add() {
		
		int c = a + b;
		return c;
		
	}
	public int Sub() {
		
		int c = a - b;
		return c;
	}
	
	public int Mult() {
			
			int c = a * b;
			return c;
			
		}

	public int division() {
			
			int c = a / b;
			return c;
			
		}
	}
	
	
