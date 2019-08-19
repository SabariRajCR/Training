package week1.day2;

public class StringInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "testleaf" ;
		
		char[] charc = name.toCharArray();
		
		for (int i=charc.length-1;i>=0;i--) {
			
			System.out.print(charc[i]);
			
		}
		System.out.println(" ");
		
		System.out.println("Reverse order using CharAt");
		
		
		for (int i = name.length()-1;i>=0;i--) {
			
			System.out.print(name.charAt(i));
		}
	
	}

}
