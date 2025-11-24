package sortpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class test {
	static List<Student> students = new ArrayList<Student>();
	static {
		randomStudents();
	}
	public static void main(String[] args) {
		students.sort((o1, o2) ->o1.getAge() - o2.getAge());
		for (Student student : students)
			System.out.println(student.toString());
			
	}
	static private void randomStudents() {
		Random random = new Random();
		for (int i = 0 ; i <30 ; ++i) {
			char[] str0 = {(char)(random.nextInt(26)+'a'),
					(char)(random.nextInt(26)+'a'),
					(char)(random.nextInt(26)+'a'),
					(char)(random.nextInt(26)+'a')};
			String string = String.valueOf(str0);
			students.add(new Student(string, random.nextInt(100)));
		}
	}
}
