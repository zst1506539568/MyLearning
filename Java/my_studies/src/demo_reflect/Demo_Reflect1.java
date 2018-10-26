package demo_reflect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo_Reflect1 {              

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Demo1();                     //获取带参构造方法并使用
		//Demo2();                     //获取成员变量并使用
		//Demo3();                     //通过反射获取方法并使用
		//Demo4();                     //通过反射越过泛型
		//Demo5();                     //设置一个通用方法，能够改变某一属性的值，方法在Tool中
		
		BufferedReader br = new BufferedReader(new FileReader("properties"));
		Class clazz = Class.forName(br.readLine());	
		Person p = new Person("zhang", 20);
		Method m = clazz.getMethod("toString");
		System.out.println(m.invoke(p));
		
		
	}

	private static void Demo5() throws Exception {
		Student s = new Student("zhang", 23);
		System.out.println(s);
		Tool t = new Tool();
		t.Property(s, "name", "wang");
		System.out.println(s);
	}

	private static void Demo4()
			throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		ArrayList<Integer> list =new ArrayList<>();
		list.add(111);
		
		Class clazz = Class.forName("java.util.ArrayList");
		Method m = clazz.getMethod("add", Object.class);
		m.invoke(list, "abc");
		System.out.println(list);
	}

	private static void Demo3() throws Exception {
		Class clazz = Class.forName("demo_reflect.Person");
		//Constructor c = clazz.getConstructor(String.class,int.class);
		//Person p = (Person) c.newInstance("zhang",23);
		Person p = new Person("zhang", 23);
		Method m = clazz.getMethod("play", int.class);
		m.invoke(p, 10);
		
		Method m1 = clazz.getMethod("play");
		m1.invoke(p);
	}

	private static void Demo2() throws Exception {
		Class clazz = Class.forName("demo_reflect.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);
		Person p = (Person) c.newInstance("zhang",23);
		Field f = clazz.getDeclaredField("name");
		f.setAccessible(true);
		f.set(p, "li");
		System.out.println(p);
	}

	private static void Demo1() throws Exception {
		Class clazz = Class.forName("demo_reflect.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);
		Person p = (Person) c.newInstance("zhang",23);
		System.out.println(p);
	}

}
