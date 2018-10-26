package Demo_ZiDingYiQuChong;

import java.util.ArrayList;
import java.util.Iterator;

import Demo_Student.Student;

public class quchong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList c = new ArrayList();
		c.add(new Student("zhang",20));
		c.add(new Student("zhang",20));
		c.add(new Student("zhang",20));
		c.add(new Student("zhang",20));
		c.add(new Student("li",23));
		c.add(new Student("li",23));
		c.add(new Student("li",23));
		System.out.println(bianli(c));
		
		
	}

	public static ArrayList bianli(ArrayList list){
		ArrayList<Object> newList = new ArrayList<Object>();
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			Object s = it.next();;
			if(!newList.contains(s)){
				newList.add(s);
				}
			}
		return newList;
	}

	

	
	
	

}
