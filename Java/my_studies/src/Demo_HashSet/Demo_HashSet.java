package Demo_HashSet;

import java.util.HashSet;

public class Demo_HashSet {
	/*
	 * HashSat不能添加重复的元素
	 * hashSet特点：无索引，无序，不可以重复
	 * hashset也可以用迭代器及fore循环遍历
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo1();     HashSet存储一般类型
		//Demo2();     HsahSet存储对象，去重时需要重写hashcode 和  equals方法
	}

	private static void Demo2() {
		HashSet<Ceshi1> h = new HashSet<>();
		boolean a = h.add(new Ceshi1("zhang", 23));
		boolean b = h.add(new Ceshi1("zhang", 23));
		h.add(new Ceshi1("li", 29));
		h.add(new Ceshi1("wang", 25));
		h.add(new Ceshi1("liu", 20));
		for (Ceshi1 ceshi1 : h) {
			System.out.println(ceshi1);
		}
	}

	private static void Demo1() {
		HashSet<String> hashSet = new HashSet<>();
		boolean a = hashSet.add("a");
		boolean b = hashSet.add("a");
		hashSet.add("c");
		hashSet.add("d");
		hashSet.add("b");
		System.out.println(hashSet);
		System.out.println(a);
		System.out.println(b);
		for (String string : hashSet) {
			System.out.println(string);
		}
	}

}
