package week1.day2;


public class StringPalindrome {

	public static void main(String[] args) {
		
		String name = "level";
		
		int l = name.length();
		
		if(name.charAt(0) == name.charAt(l-1)&&name.charAt(1) == name.charAt(l-2)&&name.charAt(3) == name.charAt(l-2)){
			
			System.out.println("Level is a palindrome");
		}
				
		char[] charc = name.toCharArray();
		
		String output = "";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			//System.out.print(charc[i]);
			//char reverseName = charc[i];
			output = output+charc[i];
			
		}
		
		System.out.println(output);
		
		if(name.equals(output)){
			
			System.out.println("is palindrome");
		}

	}
}


