package demo_arraylist.arrayliast;

import java.util.ArrayList;

import Demo_Student.Student;
/*
 * arraylistµÄÇ¶Ì×Ñ­»·Á·Ï°
 */

public class Arraylist_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Student>> arrayList = new ArrayList<>();
		ArrayList<Student> first = new ArrayList<>();
		first.add(new Student("zhang", 20));
		first.add(new Student("liu", 23));
		ArrayList<Student> second = new ArrayList<>();
		second.add(new Student("wang",30));
		second.add(new Student("li",32));
		arrayList.add(first);
		arrayList.add(second);
		
		for (ArrayList<Student> a : arrayList) {
			for(Student s : a){
				System.out.println(s);
			}
			
		}


	}

}
