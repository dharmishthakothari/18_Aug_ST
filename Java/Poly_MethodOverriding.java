package basic;
class Person2
{
	int age,c_no;
	String name;
	
	
	Person2(String name,int age,int c_no)
	{
		this.name=name;
		this.age=age;
		this.c_no=c_no;
	}
	void display()
	{
		System.out.println(name+"\t"+age+"\t"+c_no);
	}
}
class Employee2 extends Person2
{
	
}


public class Poly_MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
