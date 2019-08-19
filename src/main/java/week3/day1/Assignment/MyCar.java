package week3.day1.Assignment;

public class MyCar {

	public static void main(String[] args) {
		
		Vehicle veh = new Vehicle();
		Car Ca = new Car();
		Auto au = new Auto();
		BMW bmw = new BMW();
		Audi aud = new Audi();
		Bajaj baj = new Bajaj();
		
		veh.Brake();
		veh.Tyre();
		
		Ca.fourwheel();
		au.Brake();
		bmw.bmwlogo();
		aud.audilogo();
		baj.handstart();
		

	}

}
