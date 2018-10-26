package Demo_int_string_exchange;

public class Change {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 100;                            //将int转换成String
		String s1 = i1+ "";
		String s2 = String.valueOf(i1);
		
		
		String s3 = "123";
		int i2 = Integer.parseInt(s3);           //将String转换成int
		
		
		//基本数据类型有8种，其中七中都有parseXxx的方法，可以将这7种的字符串表现形式转换成基本数据类型
		String s = "true";
		boolean b = Boolean.parseBoolean(s);
		System.out.println(b);
		
		
		
		

	}

}
