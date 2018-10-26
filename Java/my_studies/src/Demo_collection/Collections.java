package Demo_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import Demo_Student.Student;

@SuppressWarnings({ "unchecked", "rawtypes" })     //ȥ������û�ӷ��Ͷ����ֵĻ���
public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1();                                   //������ת����������б���
		demo2();                                     //������ʹ�õ���������
		
		
	}

	private static void demo2() {
		Collection c = new ArrayList();
		c.add(new Student("zhang",20));
		c.add(new Student("li",30));
		c.add(new Student("wang",29));
		Iterator it = c.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}

	private static void demo1() {
		Collection c = new ArrayList();
		c.add(new Student("zhang",20));
		c.add(new Student("li",30));
		c.add(new Student("wang",29));
		Object []arr = c.toArray();
		for (int i = 0; i < arr.length; i++) {
			Student s = (Student)arr[i];          //����ת��
			System.out.println(s.getName() + "-----" + s.getAge());
		}
	}

}
