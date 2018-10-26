package demo_exception;

public class Student {

	public static void main(String[] args) throws AgeOutOfBoundsException {
		 Student s = new Student();
		 s.setAge(200);

	}
	
	
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
	public void setAge(int age) throws AgeOutOfBoundsException {
		if(age<100){
			this.age = age;
		}else{
			throw new AgeOutOfBoundsException("ÄêÁä·Ç·¨£¡");
		}
	}
	 
	

}
