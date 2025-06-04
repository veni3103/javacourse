package inheritance;
class Car{
	public  void tireCount() {
		System.out.println("4 whells");
	}
	public void clutch() {
		System.out.println("3 clutches");
	}
}
class Bike extends Car{
	public void tireCount() {
		System.out.println("2 wheeler");
	}
}

public class SingleLevel {
	public static void main(String[] args) {
		Car car=new Car();
		Car bike=new Bike();
		car.tireCount();
		bike.tireCount();
		bike.clutch();
	}

}
