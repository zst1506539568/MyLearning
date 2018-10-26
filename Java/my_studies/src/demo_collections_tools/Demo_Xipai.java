package demo_collections_tools;

import java.util.ArrayList;
import java.util.Collections;
/*
 * Demo1ʹ��shuffle��ģ��ϴ�ƺͷ���
 * Demo2��1�Ļ����ϸ�������
 */
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo_Xipai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo1();
		String []arr1 = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String []arr2 = {"����","����","÷��","��Ƭ"};
		HashMap<Integer, String> h = new HashMap<>();
		for(int i=0;i<arr1.length;i++){	
			for(int j=0;j<arr2.length;j++){
				h.put(i*4+j, arr2[j]+arr1[i]);
			}
		}
		h.put(52, "����");
		h.put(53, "С��");
		//System.out.println(h);
		ArrayList<Integer> a = new ArrayList<>();
		a.addAll(h.keySet());
		//System.out.println(a);
		Collections.shuffle(a);
		TreeSet<Integer> player1 = new TreeSet<>();
		TreeSet<Integer> player2 = new TreeSet<>();
		TreeSet<Integer> player3 = new TreeSet<>();
		for(int i=0;i<a.size();i++){
			if(i%3==0){
				player1.add(a.get(i));
			}else if(i%3==2){
				player2.add(a.get(i));
			}else{
				player3.add(a.get(i));
			}
		}
		Look("���1", player1, h);
		Look("���2", player2, h);
		Look("���3", player3, h);
		
		
	}

	private static void Demo1() {
		String []arr1 = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String []arr2 = {"����","����","÷��","��Ƭ"};
		ArrayList<String> a = new ArrayList<>();
		for(String s1:arr1){
			for(String s2:arr2){
				a.add(s2+s1);
			}
		}
		a.add("����");
		a.add("С��");
		//System.out.println(a);
		Collections.shuffle(a);
		//System.out.println(a);
		ArrayList<String> player1 = new ArrayList<>();
		ArrayList<String> player2 = new ArrayList<>();
		ArrayList<String> player3 = new ArrayList<>();
		for(int i=0;i<a.size();i++){
			if(i%3==0){
				player1.add(a.get(i));
			}else if(i%3==1){
				player2.add(a.get(i));
			}else{
				player3.add(a.get(i));
			}
			
		}
		System.out.println("���1:" + player1 );
		System.out.println("���2:" + player2 );
		System.out.println("���3:" + player3 );
	}
	private static void Look(String player,TreeSet<Integer> t,HashMap<Integer, String> h){
		System.out.print(player + ":");
		for(Integer i :t){
			System.out.print(h.get(i) + ",");
		}
		System.out.println();
		
	}

}

