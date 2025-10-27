package basic;

public class LoopRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print 1-10 with while
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		System.out.println("Do loop ");
		i=1;
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);
		
		System.out.println("For loop ");
		for(int j=1;j<=10;j++)
		{
			System.out.println(j);
		}
		
	}

}
