package basic;

class Person3
{
	int age,c_no;
	String name;
	
	Person3(String name)
	{
		this.name=name;
	}
	Person3(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	Person3(String name,int age,int c_no)
	{
//		this.name=name;
//		this.age=age;
		this(name,age);
		this.c_no=c_no;
	}
	void display()
	{
		System.out.println(name+"\t"+age+"\t"+c_no);
	}
	void display(String info)
	{
		System.out.println(info+"\t"+name+"\t"+c_no+"\t"+age);
	}
}


public class Poly_MethodOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3 obj=new Person3("Aayesha");
		obj.display();
		
		Person3 obj2=new Person3("Shruti",20, 2323);
		obj2.display();
		obj2.display("Autoamtion is Running ");
		
	}

}
