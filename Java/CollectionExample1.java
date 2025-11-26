package basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lst=new ArrayList();
		lst.add(12);
		lst.add(123);
		lst.add(12345);
		lst.add(12);
		lst.add(123);
		lst.add(12345);
		System.out.println(lst);
		for(int i=0;i<lst.size();i++)
			System.out.println(lst.get(i));
		
		
		
		Set set=new HashSet();
//		set.add(11);
//		set.add(11);
//		set.add(14);
//		set.add(17);
		set.add(16);
		//set.add(lst);
		set.addAll(lst);
		System.out.println(set);
		
		List lst2=new ArrayList(set);
		for(int i=0;i<lst2.size();i++)
			System.out.println(lst2.get(i));
		
		
		//create list of numbers/integers and sum of those numbers  
	}

}
