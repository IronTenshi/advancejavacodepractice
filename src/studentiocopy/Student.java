package studentiocopy;

public class Student {
	private String nameString;
	private int age;
	private String classsString;
	private int mathScore;
	private int engScore;
	private int poScore;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClasssString() {
		return classsString;
	}
	public void setClasssString(String classsString) {
		this.classsString = classsString;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getPoScore() {
		return poScore;
	}
	public void setPoScore(int poScore) {
		this.poScore = poScore;
	}
	public Student(String nameString, int age, String classsString, int mathScore, int engScore, int poScore) {
		super();
		this.nameString = nameString;
		this.age = age;
		this.classsString = classsString;
		this.mathScore = mathScore;
		this.engScore = engScore;
		this.poScore = poScore;
	}
	@Override
	public String toString() {
		return nameString + "\t" + age + "\t" + classsString + "\t" + mathScore + "\t"
				+ engScore + "\t" + poScore;
	}
	public int gettotalScore() {
		return engScore + mathScore + poScore;
	}
}
