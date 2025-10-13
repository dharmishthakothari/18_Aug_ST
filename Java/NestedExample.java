package basic;

public class NestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=40;
		boolean havingLicenced=false;
		if(age>=18)
		{
			if(havingLicenced)
			{
				System.out.println("You can drive !!!!! ");
			}else
			{
				System.out.println("Not having licence So can't drive ");
			}
		}else
		{
			System.out.println("You are minor can't drive  ");
		}

	}

}
