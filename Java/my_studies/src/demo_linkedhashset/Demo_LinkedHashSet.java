package demo_linkedhashset;

import java.util.LinkedHashSet;

public class Demo_LinkedHashSet {
	/*
	 * �ײ���������ʵ�ֵģ����Կ�����������˳��洢
	 * ���ڵ�HashSet�����࣬���Կ��Ա�֤���ݵ�Ψһ��
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
