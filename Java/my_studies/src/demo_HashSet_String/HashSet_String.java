package demo_HashSet_String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSet_String {

	public static void main(String[] args) {
		//Demo1();         从键盘录入一个字符串，去掉其中重复的元素
		ArrayList<String> arrayList = new ArrayList<>();
		HashSet<Object> set = new HashSet<>();
		arrayList.add("a");
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		/*Iterator it = arrayList.iterator();
		while(it.hasNext()){
			set.add(it.next());
		}*/
		
		set.addAll(arrayList);
		
		System.out.println(set);

	}

	private static void Demo1() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashSet<Character> set = new HashSet<>();     //character是字符的包装类
		String line = scanner.nextLine();
		char []arr = line.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
	}

}
