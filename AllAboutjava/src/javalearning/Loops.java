package javalearning;

public class Loops {
	public static void main(String[] args) {
		int n=5;
		System.out.println("for loop");
		for(int i=1;i<=5;i++) {
			if (i==2) {
				break;
			}
			else {
				System.out.println(n*i);
			}
		}
		System.out.println("while loop");
		while(n>0) {

			if(n==3) {
				n--;
				continue;
			}

			System.out.println(n);
			n--;
		}
		System.out.println("dowhile");
		do {
			System.out.println("Value of i: " + n);
			n++;
		} while (n <= 5);
	}

}
