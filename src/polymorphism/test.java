package polymorphism;

public class test {
	public static void main(String[] args) {
		Person s1 = new Student();
		
		s1.setAge(10);
		s1.setName("sn");
		
		
		register(s1);
	}
	public static void register(Person s)
	{
		s.display();
		System.out.println("register finsh");
	}
}
