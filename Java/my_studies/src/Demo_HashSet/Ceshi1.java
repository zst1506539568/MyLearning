package Demo_HashSet;

import Demo_Stack.ceshi;

public class Ceshi1 {
	private String name;
	private int age;
	public Ceshi1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Ceshi1() {
		super();
		// TODO Auto-generated constructor stub
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
		return "Ceshi1 [name=" + name + ", age=" + age + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Ceshi1 a = (Ceshi1)obj;
		return this.name.equals(a.name) && this.age == a.age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 10;
	}
	
	
	
	
	
	
	
	

}
