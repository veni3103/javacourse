package inheritance;
class A{
	void display() {
		System.out.println("welcome");
	}
	void level() {
		System.out.println("from A class");
	}
}
class B extends A{
	void level() {
		System.out.println("from B class");
	}
	int charecter() {
		return 1;
	}
}
class C extends A{
	void level() {
		System.out.println("from c class");
	}
}
public class MultiLevel {
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		C c=new C();
		a.display();
		b.display();
		c.display();
		System.out.println(b.charecter());

	}
}
