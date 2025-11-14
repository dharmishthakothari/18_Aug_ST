package basic;
class Math
{
	int addition(int number1,int number2)
	{
		return number1+number2;
	}
	int addition(int n1,int n2,int n3)
	{
		return n1+n2+n3;
	}
	float addition(int n1,float n2)
	{
		return n1+n2;
	}
}
public class Poly_MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math obj=new Math();
		System.out.println(obj.addition(12, 12));
		System.out.println(obj.addition(23,23.45f));
	}

}
