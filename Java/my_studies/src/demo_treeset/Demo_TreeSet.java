package demo_treeset;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import Demo_Student.Student;


/*
 * TreeSet��ȥ�أ��һ��Զ�����
 * TreeSet�洢�Զ������ʱ����Ҫ�ڸ���ʵ�ֽӿ�Comparable�ӿڡ�����дcomparato����
 * comparato����return����    �ͻᰴ�ռ��ϵ�˳�����    return����     �ͻᰴ�ռ��ϵĵ������      return0     ��ֻ�᷵��һ������
 * ���Demo_Student.Student����д�ĸ���compareto����
 */

public  class Demo_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo1();
		//Demo2();
		//Demo3();    �����ַ������������Ҳ�ɾ���ظ����ַ���
		//Demo4();    ����һ�����ʣ�ת�����ַ����飬�����򣬲�ȥ��
		//Demo5();    ���뼸�����֣�������quitʱֹͣ���룬Ȼ����������ұ����ظ�
		
		
	}




	private static void Demo5() {
		TreeSet<Integer> ts = new TreeSet<>(new ComparedByNumber());
		Scanner sc = new Scanner(System.in);
		while(true){
			String s = sc.nextLine();
			if("quit".equals(s)){
				break;
			}
			Integer i = Integer.parseInt(s);
			ts.add(i);
		}
		System.out.println(ts);
	}




	private static void Demo4() {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		char []arr = s.toCharArray();
		TreeSet<Character> st = new TreeSet<>(new ComparedBySize());
		for (int i = 0; i < arr.length; i++) {
			st.add(arr[i]);
		}
		for (Character c : st) {
			System.out.print(c);
		}
	}




	/*private static void Demo3() {
		TreeSet<String> ts = new TreeSet<>(new ComparedBySize());
		ts.add("aaaa");
		ts.add("aaaa");
		ts.add("ddd");
		ts.add("cc");
		ts.add("bbbb");
		ts.add("bbbb");
		ts.add("ddddddd");
		System.out.println(ts);;
	}*/
	
	
	

	private static void Demo2() {
		TreeSet<Student> set = new TreeSet<>();
		set.add(new Student("zhang",23));
		set.add(new Student("li",34));
		set.add(new Student("wang",25));
		set.add(new Student("zhao",62));
		set.add(new Student("liu",34));
		set.add(new Student("shang",23));
		set.add(new Student("zhang",90));
		System.out.println(set);
	}

	private static void Demo1() {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(3);
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(2);
		System.out.println(set);
	}








}





class ComparedBySize implements Comparator<Character>
{

	@Override
	public int compare(Character arg0, Character arg1) {
		int num = arg0.compareTo(arg1);
		return num ==0? 1:num;
	}          //Demo3
	
}



class ComparedByNumber implements Comparator<Integer>{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		int num = arg0 - arg1;
		return num ==0? 1:(-num);
	}
	
}
