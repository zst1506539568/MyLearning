package demo_map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
/*
 * �ж�һ���ַ����и��ַ��ĸ���
 */

public class Demo_tongji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo1();
		HashMap<Character, Integer> hm = new HashMap<>();    //Demo1�ľ����
	    String s = "aaabbccccdd";
		char []arr = s.toCharArray();
		for (char c : arr) {
			hm.put(c, hm.containsKey(c)? hm.get(c)+1 : 1);
		}
		for(Character key : hm.keySet()){
			System.out.println(key + "�ַ���" + hm.get(key) + "��");
		}
		

	}

	private static void Demo1() {
		HashMap<Character, Integer> hm = new HashMap<>();
	    String s = "aaabbccccdd";
		char []arr = s.toCharArray();
		for (char c : arr) {
			if(!hm.containsKey(c)){
				hm.put(c, 1);
			}else{
				hm.put(c,hm.get(c)+1);
			}
		}
		for(Entry<Character, Integer> h:hm.entrySet()){
			System.out.println(h.getKey() + "�ַ���" + h.getValue() + "��");
		}
	}

}
