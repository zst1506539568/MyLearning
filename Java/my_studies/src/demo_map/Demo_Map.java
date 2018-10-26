package demo_map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DemoPut();
		//DemoOthers();
		//DemoIterator();
		//DemoForeach();
		//DemoIteratorPro();
		//DemoForeachPro();
		//DemoStudent();
		//DemoLinkedHashMap();
		TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {     //������������,���������������Student����д��compareto����

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				int num  = s1.getName().compareTo(s2.getName());
				return num ==0? s1.getAge()-s2.getAge() : num;
			}
		});
		tm.put(new Student("zhang", 23), "zz");
		tm.put(new Student("zhang", 25), "zz");
		tm.put(new Student("liu", 35), "1z");
		tm.put(new Student("zh", 29), "2z");
		System.out.println(tm);
		
	}

	private static void DemoLinkedHashMap() {
		LinkedHashMap<Student, String> lhm = new LinkedHashMap<>();     //�����hashmap�������
		lhm.put(new Student("zhang", 23), "zz");
		lhm.put(new Student("liu", 23), "1z");
		lhm.put(new Student("zh", 23), "2z");
		System.out.println(lhm);
	}

	private static void DemoStudent() {      //��ֵΪ�Զ������
		Map<Student, String> m = new HashMap<>();
		m.put(new Student("zhang", 23), "shanghai");
		m.put(new Student("zhang", 23), "beijing");    //����ȥ���ظ�Ԫ�أ���Ҫ��дstudent�е�hashcode��equals����
		m.put(new Student("liu", 25), "tianjin");
		m.put(new Student("wang", 29), "guangzhou");
		System.out.println(m);
	}

	private static void DemoForeachPro() {
		Map<String, Integer> m = new HashMap<>();
		m.put("liu", 21);
		m.put("wang", 25);
		m.put("zhang", 23);
		//for(Map.Entry<String, Integer> mm:m.entrySet())
		for(Entry<String, Integer> mm:m.entrySet()){
			System.out.println(mm.getKey() + "+" + mm.getValue());
		}
	}

	private static void DemoIteratorPro() {                 //ͨ��������ֵ�Եķ�ʽ������hashmap
		Map<String, Integer> m = new HashMap<>();
		m.put("liu", 21);
		m.put("wang", 25);
		m.put("zhang", 23);
		Set<Map.Entry<String, Integer>> set = m.entrySet();
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		while(it.hasNext()){
			Map.Entry<String, Integer> map = it.next();
			System.out.println(map.getKey() + "=" + map.getValue());
		}
	}

	private static void DemoForeach() {
		Map<String, Integer> m = new HashMap<>();
		m.put("liu", 21);
		m.put("wang", 25);
		m.put("zhang", 23);
		for(String key : m.keySet()){
			System.out.println(m.get(key));
		}
	}

	private static void DemoIterator() {
		Map<String, Integer> m = new HashMap<>();
		m.put("liu", 21);
		m.put("wang", 25);
		m.put("zhang", 23);
		Set<String> s = m.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()){
			String key = it.next();
			Integer value = m.get(key);
			System.out.println(value);
		}
	}

	private static void DemoOthers() {
		Map<String, Integer> m = new HashMap<>();
		m.put("liu", 21);
		m.put("wang", 25);
		m.put("zhang", 23);
		Integer v = m.remove("zhang");    //���ر�ɾ����ֵ
		System.out.println(v);
		System.out.println(m);
		System.out.println(m.containsKey("liu"));    //����Ƿ��иü�
		System.out.println(m.containsValue(20));     //����Ƿ��и�ֵ
		System.out.println(m.isEmpty());             //����map�Ƿ�Ϊ��
		Collection<Integer> c = m.values();
		System.out.println(c);       //ȡ�����е�ֵ
		System.out.println(m.size());   //map�Ĵ�С
	}

	private static void DemoPut() {
		Map<String, Integer> m = new HashMap<>();
		Integer i1 = m.put("zhang", 20);
		Integer i2 = m.put("liu", 21);
		Integer i3 = m.put("wang", 25);
		Integer i4 = m.put("zhang", 23);    //��ͬ���ļ�ֵ����������ʱ������Ļ��ǰ���ֵ���ǣ�Ȼ�󷵻ر����ǵ�ֵ
		System.out.println(m);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
	}

}
