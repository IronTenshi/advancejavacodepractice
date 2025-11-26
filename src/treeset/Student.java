package treeset;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private int mathScore;
	private int chineseScore;
	private int engScore;
	
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
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getChineseScore() {
		return chineseScore;
	}
	public void setChineseScore(int chineseScore) {
		this.chineseScore = chineseScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public Student(String name, int age, int mathScore, int chineseScore, int engScore) {
		super();
		this.name = name;
		this.age = age;
		this.mathScore = mathScore;
		this.chineseScore = chineseScore;
		this.engScore = engScore;
	}
	public Student() {};
	
	public int GetTotalScore()
	{
		return (mathScore + chineseScore + engScore) / 3;
	}
	@Override
	public int compareTo(Student o) {
		return this.GetTotalScore() - o.GetTotalScore();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", mathScore=" + mathScore + ", chineseScore=" + chineseScore
				+ ", engScore=" + engScore + "]";
	}

}
