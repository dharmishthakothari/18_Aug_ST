package basic;
class Shape
{
	float calculateArea()
	{
		System.out.println("In Shape class ");
		return 0.0f;
	}
}
class Circle extends Shape
{
	int radius;
	Circle(int radius1)
	{
		radius=radius1;
	}
	float calculateArea() {
		// TODO Auto-generated method stub
		//super.calculateArea();
		float area=2*3.14f*radius;
		return area;
	}
}


public class InhertianceExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c=new Circle(12);
		float ans=c.calculateArea();
		System.out.println("Area of Circle "+ans);
	}

}
