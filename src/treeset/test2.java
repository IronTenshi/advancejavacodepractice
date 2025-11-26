package treeset;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class test2 {
	static List<Student> students = new ArrayList<Student>();
	static {
		students.add(new Student("yu1",12,999,3,54));
		students.add(new Student("yu2",12,0,0,54));
		students.add(new Student("yu3",12,349,3,54));
	}
	public static void main(String[] args) {
//		TreeSet<Student> tSet =new TreeSet<Student>(students);
//		for (Student student: tSet)
//		{
//			System.out.println(student.toString());
//		}
		System.out.println(students);
//		students.sort(new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.GetTotalScore() - o2.GetTotalScore();
//			}
//		});
		students.sort((o1,o2)->{return o1.compareTo(o2);});
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
}
