package Demo_generic;

import java.util.ArrayList;

import Demo_Student.Student;
import demo_persion.Persion;

public class Demo_Generic_TongPeiFu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("zhang",23));
		list.add(new Student("li",24));
		ArrayList<Persion> list1 = new ArrayList<>();
		list1.add(new Persion("wang",25));
		list1.add(new Persion("liu",26));
		
		
		list1.addAll(list);                         //�� entends E   ͨ������Ϳ��Խ���������ת��Ϊ����
		System.out.println(list);


	}

}
