package my_practice;
class Demo_class {
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "��";
		student.setAge(21);
		System.out.println(student.name + "----" + student.getAge());
		//Student.school = "tjut";
		Student.study();
		student.play();
	}
}
class Student
{
	private int age;
	String name;
	static String school;
	public void setAge(int age){
		if(age>0 && age<100){
			this.age = age;
		}else{
			System.out.println("���䲻���Ϲ淶��");
		}
	}

	public int getAge(){
		return age;
	}

	public static void study(){
		System.out.println("ѧϰ" + school);
	}

	public void play(){
		System.out.println("����ʦ");
	}
}
