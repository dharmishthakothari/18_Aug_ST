package basic;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> lst=new ArrayList<Integer>();
			lst.add(12);
			lst.add(134);
			lst.add(678);
			lst.add(8989);
			lst.add(12);
			lst.add(134);
			Iterator<Integer> i = lst.iterator();
			
			boolean ans1=i.hasNext();
			System.out.println(ans1+"\t"+i.next());
			
			ans1=i.hasNext();
			System.out.println(ans1+"\t"+i.next());
			
			ans1=i.hasNext();
			System.out.println(ans1+"\t"+i.next());
			
			ans1=i.hasNext();
			System.out.println(ans1+"\t"+i.next());
		
			ans1=i.hasNext();
			System.out.println(ans1);
			
			ans1=i.hasNext();
			System.out.println(ans1);
			
		
	}

}
