package basic;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10000,num2=1000,ans;
		//want bigger number using ternary operator
		//(condition)?true:false
		ans=(num1>num2)?num1:num2;
		System.out.println(ans);
	
		//print message that shows me which number is greater 
		String msg;
		msg=(num1>num2)?"Number1 is greater ":"Number2 is greater";
		System.out.println(msg);
	}

}
