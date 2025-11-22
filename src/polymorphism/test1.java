package polymorphism;

public class test1 {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.setAge(12);
		dog.setName("sd");
		
		Animal cat = new Cat();
		cat.setAge(11);
		cat.setName("asdfdfd");
		
		Feeder feeder = new Feeder("sdsds",123);
		feeder.feedCat(cat, "shit");
		feeder.feedDog(dog, "fish");
		
		if(dog instanceof Dog d)
		{
			d.lookHome();
		}
		
	}
}
