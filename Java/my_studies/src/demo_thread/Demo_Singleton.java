package demo_thread;

public class Demo_Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
	    */
		
		
		
		
		
	}
	

}

/*
//����ʽ
class Singleton{
	//1.����˽�й��췽��
	private  Singleton(){};
	//2.����˽�ж���s
	private static Singleton s = new Singleton();
	//3.������̬��������s
	public static Singleton getInstance(){
		return s;
	}
	
}

*/

/*
//����ʽ      �������ӳټ���ģʽ
class Singleton{
	private Singleton(){};
	private static Singleton s;
	public static Singleton getInstance(){
		if(s == null){
			//�߳�1�ȴ����߳�2�ȴ����߳�1���߳�2�п��ܻᴴ��������ͬ�Ķ���
			s = new Singleton();
		}
		return s;
	}
}

*/


//����ʽ
class Singleton{
	private Singleton(){};
	private final static Singleton s = new Singleton();
}










