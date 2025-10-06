package basic;

public class Bitwise_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=10;
		int number2=5;
		// 10 - 1010 1010 &
		//5 - 0101	 0101 	
//			128	64	32	16	8	4	2	1
		System.out.println(number&number2);
		System.out.println(number|number2);
	}

}
