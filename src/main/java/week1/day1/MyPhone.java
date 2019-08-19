package week1.day1;

public class MyPhone {

	public static void main(String[] args) {
		
		Mobile a = new Mobile();
		
		String sendSms = a.sendSms();
		System.out.println(sendSms);
		
		int dialNumber = a.dialNumber();
		System.out.println(dialNumber);
		
		String brand = a.brand;
		System.out.println(brand);
		
		String model = a.model;
		System.out.println(model);

	}

}
