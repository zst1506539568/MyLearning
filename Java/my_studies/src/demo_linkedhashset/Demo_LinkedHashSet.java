package demo_linkedhashset;

import java.util.LinkedHashSet;

public class Demo_LinkedHashSet {
	/*
	 * 底层是由链表实现的，所以可以做到按照顺序存储
	 * 由于的HashSet的子类，所以可以保证数据的唯一性
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> hashSet = new LinkedHashSet<>();
		hashSet.add("a");
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add("d");
		System.out.println(hashSet);

	}

}
