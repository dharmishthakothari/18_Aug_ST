package basic;

import java.util.Scanner;

public class WhileExample5 {

	public static void main(String[] args) {
		
//		int i=3;
//		while(i<=30)
//		{
//			System.out.println(i);
//			i+=3;
//		}

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number ");
		int num=scan.nextInt();
		int i=1,mul;
		while(i<=10)
		{
			mul=i*num;
			//3*1 =3 
			
			// 3*2 = 6
			System.out.println(num+" * "+i+ " = "+mul);
			//System.out.println(mul);
			i++;
		}
		
	}

}
