package polymorphism;

public class test {
	public static void main(String[] args) {
		Person s1 = new Student();
		
		s1.setAge(10);
		s1.setName("sn");
		
		
		register(s1);
		
		if(s1 instanceof Student)
		{
			Student s = (Student)s1;
			s.display();
		}
		else
		{
			s1.display();
		}
	}
	public static void register(Person s)
	{
		s.display();
		System.out.println("register finsh");
	}
}
