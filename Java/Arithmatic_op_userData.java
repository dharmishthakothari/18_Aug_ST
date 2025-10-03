package basic;

import java.util.Scanner;

public class Arithmatic_op_userData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("please enter number1 ");
		num1=obj.nextInt();
		System.out.println("please enter number2 ");
		num2=obj.nextInt();
		
		
		
		
		int add=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		//converting to float
		float div=(float)num1/num2;
		int mod=num1%num2;
		//int inc=num1++;  
		int inc=++num1;
		System.out.println("Increment "+inc+" num1 "+num1);
		System.out.println("Addition = "+add);
		System.out.println("Substraction = "+sub);
		System.out.println("Multilication = "+mul);
		System.out.println("Division = "+div);
		System.out.println("Modulus = "+mod);
	}

}
