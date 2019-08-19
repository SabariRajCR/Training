package week1.day2.Assignment;

public class ReverseWords {

	public static void main(String[] args) {
		
		String line = "Just to do some codes for reverse string";
		String[] split = line.split(" ");
		
		String output = "";		
		
		for(int i=0;i<split.length;i++){
			
			String list = split[i];
			
			if(i%2!=0){
			
			for(int j=list.length()-1;j>=0;j--){
												
				char charAt = list.charAt(j);
				
				output = output + charAt;
				}
			}
				
				else{
					output = output + list;
				}
										
			output = output + " ";
			
				}
		
		System.out.println(output);

  }
}



