package studentiocopy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
	static List<Student> students  = new ArrayList<Student>();
	public static void main(String[] args) throws IOException {
		BufferedWriter bWriter1 = new BufferedWriter(new 
				FileWriter("D:\\Testtxt\\student1.txt"));
		String initailString = "姓名" + "\t" + "年龄" + "\t" + "学院" + "\t" + "数学" + "\t" + "英语"
				+ "\t" + "政治";
		bWriter1.write(initailString);
		bWriter1.newLine();
		bWriter1.write("签上尉" + "\t" + "19" + "\t" + "小猫" + "\t"+ "12" + "\t" + "23" + 
		"\t" + "34");
		bWriter1.newLine();
		bWriter1.write("签上尉2" + "\t" + "193" + "\t" + "小猫" + "\t"+ "123" + "\t" + "22" + 
				"\t" + "37");
		bWriter1.newLine();
		bWriter1.write("签上尉3" + "\t" + "191" + "\t" + "小猫" + "\t"+ "1" + "\t" + "3" + 
				"\t" + "34");
		bWriter1.close();
//		BufferedReader bReader1 = new BufferedReader(new FileReader
//				("D:\\Testtxt\\student1copy.txt"));
//		bReader1.readLine();
//		for (bReader1.)
		Scanner scanner = new Scanner(new File("D:\\Testtxt\\student1.txt"));
		scanner.nextLine();
		while (scanner.hasNext()) {
			students.add(new Student(scanner.next(), Integer.valueOf(scanner.next()), 
					scanner.next() , Integer.valueOf(scanner.next()), 
					Integer.valueOf(scanner.next()), Integer.valueOf(scanner.next())));
		}
		students.sort((o1 , o2)->{return o1.gettotalScore() - o2.gettotalScore();});
		scanner.close();
		BufferedWriter bWriter2 = new BufferedWriter(new 
				FileWriter("D:\\Testtxt\\student1copy.txt"));
		bWriter2.write(initailString);
		bWriter2.newLine();
		for (Student student : students) {
			bWriter2.write(student.toString());
			bWriter2.newLine();
		}
		System.out.println("over");
		bWriter2.close();
	}
}
