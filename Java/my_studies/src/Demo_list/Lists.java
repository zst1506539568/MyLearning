package Demo_list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import Demo_Student.Student;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();                //使用list特有的get方法遍历
		//demo2();                //使用listiterator可在遍历的过程中添加元素
	}

	@SuppressWarnings("unused")
	private static void demo2() {
		List l = new ArrayList();
		l.add("wang");
		l.add("li");
		l.add("liu");
		ListIterator iterator = l.listIterator();
		while(iterator.hasNext()){
			String str = (String)iterator.next();
			if(str.equals("li")){
				iterator.add("zhang");
			}
		}
			System.out.println(l);
	}

	private static void demo1() {
		List l = new ArrayList();
		l.add(new Student("zhang",20));
		l.add(new Student("li",25));
		l.add(new Student("wang",47));
		for (int i = 0; i < l.size(); i++) {
			Student s = (Student)l.get(i);
			System.out.println(s.getName() + "--- " + s.getAge());
		}
	}

}
