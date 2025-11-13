package basic;

class Person1
{
	String name;
	int age;
	Person1(String name1,int age1)
	{
		name=name1;
		age=age1;
	}
	void display()
	{
		System.out.println(name+" "+age);
	}	
}
class Employee extends Person1
{
	int salary;
	
	Employee(String name,int age,int salary1)
	{
		super(name,age);
		salary=salary1;		
	}
	void displaysalary()
	{
		super.display();
		System.out.println(salary);
	}
}
public class InheritanceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("eeee", 20, 20000);
		
		//e.display();
		e.displaysalary();
		
		Person1 p=new Person1("test",23);
		p.display();
	}

}
