package week1.day2;

public class PatterProgram {
    public int row =5;
	public static void main(String[] args) {
		
		PatterProgram LeftTri = new PatterProgram();
		
		LeftTri.starRightTriangle();
		LeftTri.starLeftTriangle(); 	
	}

public void starRightTriangle(){
	
	//int row = 7;
	
	for(int i=0;i<=row;i++){
		
		for(int j=0;j<=i;j++){
			
			System.out.print("* ");
		}
		System.out.println( );
		
	}
}
	

public void starLeftTriangle(){
	
	//int row = 5;
	
	for(int i=row;i>0;i--){
		
		for(int j=i;j>0;j--){
			
			System.out.print("* ");
		}
		System.out.println();
	}
 }
	
public void rightTriangle(){
	
	int row=5;
	
	
	
	
}
	
}
