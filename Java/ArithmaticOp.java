package basic;

public class ArithmaticOp {
	public static void main(String[] args) {
		int num1=200,num2=21;
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
