package javalearning;

public class ArrayClass {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		String[]s= {"zfsd","fd","fdsa","fqr","qre"};
		char[]c= {'a','e','f','r'};
		for(int i:a) {
			System.out.println(i);
		}
		for(String j:s) {
			System.out.println("string:"+j);
		}
		c[2]='z';
		for(char k:c) {
			System.out.println("char:"+k);
		}
	}

}
