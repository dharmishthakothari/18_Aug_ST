package basic;

public class Greatest3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100,b=200,c=101;
					//True			False
		int max=a>b?(a>c?a:b>c?b:c):(b>c?b:c);
		System.out.println(max);
		
		
	}

}
