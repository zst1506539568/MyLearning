package demo_map;

import java.util.HashMap;

public class Demo_HashMap_HashMap {     //hashmapÇ¶Ì×hashmap

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student,String> h = new HashMap<>();
		h.put(new Student("zhang", 23), "tianjin");
		h.put(new Student("liu", 26), "beijin");
		h.put(new Student("wang", 32), "nanjin");
		HashMap<Student,String> m = new HashMap<>();
		m.put(new Student("li", 23), "tianjin");
		m.put(new Student("zhao", 26), "beijin");
		m.put(new Student("gao", 32), "nanjin");
		HashMap<HashMap<Student,String>, String> hm = new HashMap<>();
		hm.put(h, "No1");
		hm.put(m, "No2");
		for(HashMap<Student,String> key :hm.keySet()){
			System.out.println("-----" + hm.get(key) + "-----");
			for(Student keys :key.keySet()){
				System.out.println(keys + "---" +key.get(keys) );
			}
		}


	}

}
