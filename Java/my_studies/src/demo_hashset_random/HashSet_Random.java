package demo_hashset_random;

import java.util.HashSet;
import java.util.Random;
/*
 * 使用random获取1-20的随机数
 * 存储在hashset中保证随机数的唯一性
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
