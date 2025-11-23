package codepart;

public class Student {
	private String name;
	private int age;
	
	static
	{
		System.out.println("static initial");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		System.out.println("creating");
		this.name = name;
		this.age = age;
	}
	public Student()
	{
		
	}
	public void display()
	{
		System.out.println(name+ " age is  "+age);
	}
	
}
