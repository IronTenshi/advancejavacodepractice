package interfaceparctice2;

public interface Swim {
	public abstract void swim();
	public default void jump()
	{
		System.out.println("jump is doing");
	}
	static void eat()
	{
		System.out.println("eat");
	}
}
