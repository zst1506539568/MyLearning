package Demo_generic;

import java.util.ArrayList;
import java.util.Iterator;

import Demo_Student.Student;

public class Demo_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student("zhang",23));
		arrayList.add(new Student("wang",24));
		arrayList.add(new Student("li",68));
		//arrayList.add("sss");                     报错，只能传入泛型所定义的类型的变量
		
		Iterator<Student> iterator = arrayList.iterator();
		while(iterator.hasNext()){
			Student s = iterator.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		
		

	}

}
