package demo_student_grade;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
/*
 * 通过键盘输入5各学生的姓名以及三科成绩，按照总分由高到低排序
 */

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				int sum = s1.getSum() -s2.getSum();
				return sum ==0?1:-sum;
			}
		});
		System.out.println("111111");
		Scanner sc = new Scanner(System.in);		
		while (ts.size()<5) {
			String line = sc.nextLine();
			String []arr = line.split(",");
			String name = arr[0];
			int mathGrade = Integer.parseInt(arr[1]);
			int chineseGrade = Integer.parseInt(arr[2]);
			int englishGrade = Integer.parseInt(arr[3]);
			ts.add(new Student(name, mathGrade, chineseGrade, englishGrade));
		}
		Iterator<Student> it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
