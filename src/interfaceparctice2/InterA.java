package interfaceparctice2;

public interface InterA {
	public default void show1()
	{
		System.out.println("show1");
		show3();
	}
	public default void show2()
	{
		System.out.println("show2");
		show3();
	}
	private void show3()
	{
		System.out.println("show3");
	}
}
