package javalearning;

public class Recurtion {
	public static void main(String[] args) {
		int val=5;
		System.out.println(print(val));

	}
	public static int print(int a) {
		//System.out.println(a);
		int val=a;
		if(val==0) {
			return 1;
		}
		else {
			//System.out.println(val);
			
			//System.out.println(val);
			return val*print(val-1);
		}
	}

}
