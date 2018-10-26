package my_practice;
class Demo_Teacher {
	public static void main(String[] args) {
		Teachers t = new PrimaryTeacher("zhang",21);
		System.out.println(t.getName() + "------------" + t.getAge());
		t.teach();
		Teachers s = new HighTeacher("liu",30);
		System.out.println(s.getName() + "------------" + s.getAge());
		s.teach();
	}
}

abstract class Teachers{
	private String name;
	private int age;

    public Teachers(){};
	public Teachers(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	abstract void teach();
}


class PrimaryTeacher extends Teachers{
	public PrimaryTeacher(){};
	public PrimaryTeacher(String name,int age){
		super(name,age);
	}
	public void teach(){
		System.out.println("基础班课程");
	}
}

class HighTeacher extends Teachers{
	public HighTeacher(){};
	public HighTeacher(String name,int age){
		super(name,age);
	}
	public void teach(){
		System.out.println("高级班课程");
	}
}
