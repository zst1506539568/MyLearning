package damo_aslist;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Demo_Aslist {
	public static void main(String[] args) {
		//Demo1();    将字符串数组转换为集合，但不可执行add操作
		//Demo2();    基本数据类型的集合转换。会将整个数组看作一个整体，所以创建书序时必须用创建对象的形式猜能正确的转换为数组
		
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
