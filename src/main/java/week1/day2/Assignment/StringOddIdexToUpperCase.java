package week1.day2.Assignment;

public class StringOddIdexToUpperCase {

	public static void main(String[] args) {
		
		String a = new String("sabariraj");
		
		String z = "";
		
		for(int i=0;i<a.length();i++){
			
			if(i%2!=0){
				
				char charAt = a.toUpperCase().charAt(i);
				
				z= z+charAt;
			}
			
			else{
				
				char charAt = a.charAt(i);
				
				z = z+charAt;
				
			}
			
		}
		System.out.println(z);
	}
}
