package Demo_bianli_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Bianli_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> c = new ArrayList<String>();
		c.add("a");
		c.add("a");
		c.add("a");
		c.add("b");
		c.add("b");
		c.add("c");
		c.add("c");
		
		System.out.println(bianli(c));
	}
	
	/*
	 * ����һ���¼���
	 * ����c�е�����Ԫ�أ��ж��¼������Ƿ������Ԫ��
	 * ������������ӽ��¼���
	 * ���ظ��¼���
	 * 
	 * */
	
	public static ArrayList bianli(ArrayList list){
		ArrayList<Object> newList = new ArrayList<Object>();
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			Object s = it.next();
			if(!newList.contains(s)){
				newList.add(s);
				}
			}
		return newList;
	}

}
