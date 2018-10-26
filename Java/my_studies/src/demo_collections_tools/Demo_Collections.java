package demo_collections_tools;

import java.util.ArrayList;
import java.util.Collections;

public class Demo_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("c");
		al.add("e");
		al.add("d");
		al.add("h");
		//Collections.sort(al);          //排序
		//System.out.println(Collections.binarySearch(al, "e"));     //二分查找法查找该元素位置
		//System.out.println(Collections.binarySearch(al, "d"));     //-（应插入的位置）-1
		//System.out.println(Collections.max(al));              //显示最大元素
		//Collections.reverse(al);                             //倒序输出
		Collections.shuffle(al);                               //随机排序
		System.out.println(al);
		
		
		
		

	}

}
