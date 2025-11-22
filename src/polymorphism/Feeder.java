package polymorphism;

public class Feeder {
	private String name;
	private int age;
	public Feeder() {
		// TODO Auto-generated constructor stub
	}
	public void feedDog(Animal dog, String something)
	{
		System.out.println(name + "is feeding dog");
		dog.eating(something);
	}
	
	public void feedCat(Animal cat, String something)
	{
		System.out.println(name + "is feeding cat");
		cat.eating(something);
	}
	public Feeder(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
}
