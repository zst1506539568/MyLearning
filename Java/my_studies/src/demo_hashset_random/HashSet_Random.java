package demo_hashset_random;

import java.util.HashSet;
import java.util.Random;
/*
 * ʹ��random��ȡ1-20�������
 * �洢��hashset�б�֤�������Ψһ��
 */

public class HashSet_Random {
	public static void main(String[] args) {
		Random r = new Random();
		HashSet<Integer> h = new HashSet<>();
		while(h.size()<10){
			h.add(r.nextInt(20) +1);
		}
		System.out.println(h);
	
	}
	

}
