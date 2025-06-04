package javalearning;
interface  Animal{
	void sound();
}
class Dog implements Animal{
	public void sound(){
		System.out.println("dog spark");
	}
	
}
class at implements Animal{
	public void sound() {
		System.out.println("cat make sound");
	}
}

public class Interface {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.sound();
	}

}
