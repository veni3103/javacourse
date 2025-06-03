package javalearning;

public class ConditionalStatement {
	public static void main(String[] args) {
		int[]a= {1,3,5,77,132};
		for(int i=0;i<a.length;i++) {
			if(a[i]<=9) {
				System.out.println("single digit");
			}
			else if(a[i]<=99) {
				System.out.println("double digit");
			}
			else {
				System.out.println("greater then double digit");
			}
		}
			int val=1;
			switch(val){
			case 1:
				System.out.println("monday");
				break;
			case 2:
				System.out.println("tuesday");
			case 3:
				System.out.println("wednesday");
			default:
				System.out.println("other day");
			}
			
		
	}

}
