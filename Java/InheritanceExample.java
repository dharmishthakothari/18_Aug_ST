package basic;
class Person
{
	void display()
	{
		System.out.println("in Person class");
	}
}
class Student extends Person
{
	
}
class HigherStudent extends Person
{
	
}


public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.display();
		Person p=new Person();
		p.display();
		
		HigherStudent h=new HigherStudent();
		h.display();
	}

}
