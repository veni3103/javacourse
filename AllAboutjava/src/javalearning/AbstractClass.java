package javalearning;
abstract class A{
	String getname() {
		return "veni";
	}
	abstract void display();
	abstract int area(int val);
	void print() {
		System.out.println("superc class");
	}
}
class B extends A{
	void print() {
		System.out.println("hi");
	}
	void display() {
		System.out.println("from B class");
	}
	void printing() {
		super.print();
	}
	int area(int a) {
		int area=a*2;
		return area;
	}
	String name() {
		printing();
		return getname();
	}

}

public class AbstractClass {
	public static void main(String[] args) {
		B b=new B();
		b.print();
		//b.printing();
		System.out.println(b.area(5));
		System.out.println(b.name());
	}

}
