package demo_reflect;

import java.lang.reflect.Field;

public class Tool {
	public void Property(Object obj ,String name, Object value) throws Exception {
		Class clazz = obj.getClass();
		Field f = clazz.getDeclaredField(name);
		f.setAccessible(true);
		f.set(obj, value);
	}

}



class Student{
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
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
