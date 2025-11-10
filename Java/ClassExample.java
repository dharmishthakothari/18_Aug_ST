package basic;

class Vehical
{
	String brand_name;
	int price;
	void setVehical(String bName,int p)
	{
		brand_name=bName;
		price=p;
	}
	void vehical_display()
	{
		System.out.println(brand_name+"\t"+price);
	}
}


public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//created object named 'v'
		Vehical v=new Vehical();
		v.setVehical("Hyundai",3333333);
		v.vehical_display();
		
		Vehical v1=new Vehical();
		v1.setVehical("Honda",321111);		
		v1.vehical_display();
		
		Vehical v2=new Vehical();
		v2.setVehical("Kia",9999);
		v2.vehical_display();
		
	}

}
