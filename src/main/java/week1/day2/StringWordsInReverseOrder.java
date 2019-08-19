package week1.day2;

public class StringWordsInReverseOrder {

	public static void main(String[] args) {

		String name = "Welcome to testleaf chennai";
		
		String[] words = name.split(" ");
		
		for(int i=words.length-1;i>=0;i--) {
			
			System.out.print(words[i]+" ");
			
		}

	}

}
