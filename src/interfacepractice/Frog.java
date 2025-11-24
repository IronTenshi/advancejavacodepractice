package interfacepractice;

public class Frog extends Animal implements Swim{
	static
	{
		System.out.println("initial");
	}
	@Override
	public void action()
	{
		System.out.println("frog is eating");
	}
	@Override
	public void swim()
	{
		System.out.println("frog is swim");
	}
	Frog(String name, int age)
	{
		super(name, age);
	}
	@Override
	public void display()
	{
		System.out.println("frogs name is " + super.getName()+ " frogs age is "+ super.getAge());
	}
}
