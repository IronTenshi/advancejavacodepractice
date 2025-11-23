package codepart;

import java.util.ArrayList;

public class test3 {
	static ArrayList<Student> list = new ArrayList<Student>();
	static 
	{
		list.add(new Student("sdaqwe",23048705));
		list.add(new Student("sdsdsd",123));
	}
	public static void main(String[] args) {
		Student s1 = new Student("asdofugoi",3746);
		Student s2 = new Student("asd",12);

		s1.display();
		s2.display();
		for (Student student : list)
		{
			student.display();
		}
	}
}
