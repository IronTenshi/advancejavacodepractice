package polymorphism;
public class Student extends Person {
	@Override
	public void display()
	{
		System.out.println("students information is" + super.getName() + ","+ super.getAge());
	}
}
