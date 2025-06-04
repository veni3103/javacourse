package inheritance;
class  Student{
	void display(){
		System.out.println("welcome student");
	}
	void collegaName() {
		System.out.println("Sardar raja cls of engineering");
	}
}
class Parent extends Student{
	void display(){
		System.out.println("welcome parent");
	}
}
class Teacher extends Student{
	void display(){
		System.out.println("welcome teacher");
	}
}
public class HierarchicalLevel {
	public static void main(String[] args) {
		Student stu=new Student();
		Parent parent=new Parent();
		Teacher teacher=new Teacher();
		stu.display();
		parent.display();
		teacher.display();
		teacher.collegaName();
		
	}

}
