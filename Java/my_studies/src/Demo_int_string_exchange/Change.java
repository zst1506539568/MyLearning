package Demo_int_string_exchange;

public class Change {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 100;                            //��intת����String
		String s1 = i1+ "";
		String s2 = String.valueOf(i1);
		
		
		String s3 = "123";
		int i2 = Integer.parseInt(s3);           //��Stringת����int
		
		
		//��������������8�֣��������ж���parseXxx�ķ��������Խ���7�ֵ��ַ���������ʽת���ɻ�����������
		String s = "true";
		boolean b = Boolean.parseBoolean(s);
		System.out.println(b);
		
		
		
		

	}

}
