package Demo_HashSet;

import java.util.HashSet;

public class Demo_HashSet {
	/*
	 * HashSat��������ظ���Ԫ��
	 * hashSet�ص㣺�����������򣬲������ظ�
	 * hashsetҲ�����õ�������foreѭ������
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo1();     HashSet�洢һ������
		//Demo2();     HsahSet�洢����ȥ��ʱ��Ҫ��дhashcode ��  equals����
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
