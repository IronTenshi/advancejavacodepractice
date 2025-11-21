package Static;


public class Student {
	private String name;
	private int age;
	private char gender;
	private static String teacherName;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Student(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void display()
	{
		System.out.println("name : "+ name + "age  : "+ age + "gender : " +gender);
	}
	public void setTechername(String teacherName)
	{
		this.teacherName = teacherName;
	}
	public void displayTecher()
	{
		System.out.println(teacherName);
	}
}
