package javalearning;

public class Methods {
	public static void main(String[] args) {
		int val=5;
		Methods.step();
		Methods.step(val);
		int a=Methods.add(val);
		Methods method=new Methods();
	    method.add();
		method.adding(val);
	}
	public static void step() {
		System.out.println("static void ");
	}
	public static void step(int  c) {
		System.out.println("static void with parameter:"+c);
	}
	public static int add(int a) {
		int s=a+5;
		System.out.println("static return:"+s);
		return s;
	}
	public  void add() {
		System.out.println("no static void");
	}
	public  int adding(int c) {
		int a=c;
		System.out.println("non static int");
		return a;
	}

}
