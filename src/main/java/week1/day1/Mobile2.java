package week1.day1;

public class Mobile2 {
	
	public int d = 10;
	int b = 20;
	
	static int c = 10;
	
	
	
	public static void main(String[] args) {
		
		
		Mobile2 a = new Mobile2();
		
		System.out.println(a.d);

		System.out.println(c);
		//System.out.println(a.additionOfTwoNum());
		//a.additionOfTwoNum();
		
		int v = 5 + a.additionOfTwoNum();
		System.out.println(v);
		System.out.println(a.r(5, 5));
		
	}
	
public int additionOfTwoNum(){
		int a = 10;
		int b= 5;
		int c = a+b;
		return c;
	
	
	}

public void b(){
	System.out.println("Mobile2");
	
	
	}

public int r(int a,int b){
	
	
	int c = a+b;
	return c;
}

}



