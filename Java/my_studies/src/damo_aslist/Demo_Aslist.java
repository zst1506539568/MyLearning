package damo_aslist;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Demo_Aslist {
	public static void main(String[] args) {
		//Demo1();    ���ַ�������ת��Ϊ���ϣ�������ִ��add����
		//Demo2();    �����������͵ļ���ת�����Ὣ�������鿴��һ�����壬���Դ�������ʱ�����ô����������ʽ������ȷ��ת��Ϊ����
		
	}

	private static void Demo2() {
		Integer []arr = {1,2,3,4};
		List<Integer> integers = Arrays.asList(arr);
		System.out.println(integers);
	}

	private static void Demo1() {
		String []arr = {"a","b","c"};
		List<String> list = Arrays.asList(arr);
		System.out.println(list);
	}
}
