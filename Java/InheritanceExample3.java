package basic;
class Animal
{
	void eat()
	{
		System.out.println("Animal can eat");
	}
	
}
class Mammal extends Animal
{
	void walk()
	{
		System.out.println("Mammal can walk");
	}
}
class Dog extends Mammal
{
	void bark()
	{
		System.out.println("Dog can bark");
	}
	
}
public class InheritanceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog objDog=new Dog();
		objDog.bark();
		objDog.eat();
		objDog.walk();
		
	}

}
