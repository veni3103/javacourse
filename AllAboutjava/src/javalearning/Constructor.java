package javalearning;
class Student{
	int id;
	String name;
	/*Student(){
		System.out.println("constructer call");
	}*/
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	public  void detail() {
		System.out.println(id+":"+name);
	}
	
}

public class Constructor {
	public static void main(String[] args) {
		Student student=new Student(1,"veni");
		Student s1=new Student(2,"sriram");
		Student s2=new Student(3,"priya");
		student.detail();
		s1.detail();
		s2.detail();
	}

}
