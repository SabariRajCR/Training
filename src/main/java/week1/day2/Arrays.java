package week1.day2;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] carModel = {"BMW","Benz","Ferrari","Lamborgini"};
		
		for(int i=0;i<carModel.length;i++) {
			
			System.out.println(carModel[i]);
		}
		
		for (String a : carModel) {
			
			System.out.println(a);
			
		}
	}

}
