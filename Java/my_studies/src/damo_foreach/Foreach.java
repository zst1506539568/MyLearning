package damo_foreach;

import java.util.ArrayList;

import Demo_Student.Student;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo1();                增强for循环之数组的演示
		//Demo2();                //增强for循环之ArrayList存储一般对象的演示
		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student("zhang",23));
		arrayList.add(new Student("wang",25));
		arrayList.add(new Student("liu",27));
		 
		for (Student student : arrayList) {
			System.out.println(student);
		}
		
 
	}

	private static void Demo2() {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("zhang");
		arrayList.add("li");
		arrayList.add("wang");
		for (String string : arrayList) {
			System.out.println(string);
		}
	}

	private static void Demo1() {
		int []arr = {1,2,3,4,5};
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
