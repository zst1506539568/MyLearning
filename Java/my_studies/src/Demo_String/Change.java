package Demo_String;

public class Change {

	/**
	 * 将字符数组转换为字符串
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo1();
		Demo2();
		
		
		

	}

	private static void Demo2() {
		String min = "hello";              //从大串中寻找小串
		String max = "helhelloashgehellouuhydtheolollhello";
		int count = 0;
		while(max.contains(min)){
			max = max.substring(max.indexOf(min)+min.length());
			count = count +1;
		}
		System.out.println(count);
	}

	private static void Demo1() {            //将字符数组转换为字符串
		char[] arr = {'a','b','c','d'};
		String change = new String(arr);
		System.out.println(change);
	}

}
