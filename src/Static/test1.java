package Static;

public class test1 {
	public static void main(String[] args) {
		Student s1 = new Student("sb", 12, '男');
		Student s2 = new Student("shachou", 23, '女');
		
		s1.setTechername("sdsd");
		s1.display();
		s2.display();
		s2.displayTecher();//static is special memory;
	}
}
