package basic;

import java.util.ArrayList;
import java.util.Iterator;

class Book
{
	String title,auther;
	int price;
	Book(String title,String auther,int price)
	{
		this.title=title;
		this.auther=auther;
		this.price=price;
	}
	void display()
	{
		System.out.println(title+"\t"+auther+"\t"+price);
	}
	
}
public class ListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Book> lstBook=new ArrayList<Book>();
	lstBook.add(new Book("Focus","Robin Sharma",200));
	lstBook.add(new Book("Matters","Stephne",150));
	lstBook.add(new Book("Success","Fiasan",500));
	lstBook.add(new Book("Leaning","Robin Sharma",250));
	
	
	
		Iterator<Book> i =lstBook.iterator();
		while(i.hasNext())
		{
			Book b=i.next();
			b.display();
		}
		
		
	
	}
	
	

}
