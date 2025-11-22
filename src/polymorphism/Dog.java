package polymorphism;

public class Dog extends Animal {
	@Override
	public void eating(String something)
	{
		System.out.println("dog is eating " + something);
	}
	
	public void lookHome()
	{
		System.out.println("dog is looking home");
	}
}
