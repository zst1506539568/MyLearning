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
		//Collections.sort(al);          //����
		//System.out.println(Collections.binarySearch(al, "e"));     //���ֲ��ҷ����Ҹ�Ԫ��λ��
		//System.out.println(Collections.binarySearch(al, "d"));     //-��Ӧ�����λ�ã�-1
		//System.out.println(Collections.max(al));              //��ʾ���Ԫ��
		//Collections.reverse(al);                             //�������
		Collections.shuffle(al);                               //�������
		System.out.println(al);
		
		
		
		

	}

}
