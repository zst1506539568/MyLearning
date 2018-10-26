package Demo_Student;


import demo_persion.Persion;

public class Student extends Persion implements Comparable<Student> {
	private String name;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age) {
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
	@Override
	public boolean equals(Object c) {
		// TODO Auto-generated method stub
		Student student = (Student)c;
		return this.name.equals(student.name) && this.age == student.age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	

	//@Override
	/*public int compareTo(Student s) {      //按照年龄排序
		// TODO Auto-generated method stub
		int num = this.age - s.age;
		return num ==0? this.name.compareTo(s.name) : num;
	}*/
	
	
	/*public int compareTo(Student s){
		return this.name.compareTo(s.name);    //按照姓名排序
		
	}*/
	
/*
 * 根据姓名长度，姓名和年龄三个方面判断
 * 如果长度相等，判断姓名是否相等    若相等   返回年龄相减判断年龄是否相等
 *                            若不相等  返回姓名.compareto
 * 
 */
	

	public int compareTo(Student s){
		int length = this.name.length()-s.name.length();
		int num = this.age-s.age;
		return length ==0? (this.name ==s.name? num : this.name.compareTo(s.name)):length;
	}



	
	
}
