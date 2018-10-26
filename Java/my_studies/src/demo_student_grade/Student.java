package demo_student_grade;

public class Student {
	private String name;
	private int mathGrade;
	private int chineseGrade;
	private int englishGrade;
	private int sum;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int mathGrade, int chineseGrade, int englishGrade) {
		super();
		this.name = name;
		this.mathGrade = mathGrade;
		this.chineseGrade = chineseGrade;
		this.englishGrade = englishGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSum() {
		return chineseGrade + englishGrade + mathGrade;
	}

	public int getMathGrade() {
		return mathGrade;
	}

	public void setMathGrade(int mathGrade) {
		this.mathGrade = mathGrade;
	}

	public int getChineseGrade() {
		return chineseGrade;
	}

	public void setChineseGrade(int chineseGrade) {
		this.chineseGrade = chineseGrade;
	}

	public int getEnglishGrade() {
		return englishGrade;
	}

	public void setEnglishGrade(int englishGrade) {
		this.englishGrade = englishGrade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mathGrade=" + mathGrade + ", chineseGrade=" + chineseGrade
				+ ", englishGrade=" + englishGrade + ", sum=" + getSum() + "]";
	}

	
	
	
	
	
}
