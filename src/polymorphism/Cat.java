package polymorphism;

public class Cat extends Animal {
	@Override
	public void eating(String someting)
	{
		System.out.println("cat is eating " + someting);
	}
	
	public void catchMouse()
	{
		System.out.println("cat is catching mouth");
	}
}
