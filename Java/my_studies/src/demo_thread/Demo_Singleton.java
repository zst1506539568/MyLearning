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
//饿汉式
class Singleton{
	//1.创建私有构造方法
	private  Singleton(){};
	//2.创建私有对象s
	private static Singleton s = new Singleton();
	//3.创建静态方法返回s
	public static Singleton getInstance(){
		return s;
	}
	
}

*/

/*
//懒汉式      单例的延迟加载模式
class Singleton{
	private Singleton(){};
	private static Singleton s;
	public static Singleton getInstance(){
		if(s == null){
			//线程1等待，线程2等待，线程1和线程2有可能会创建两个不同的对象
			s = new Singleton();
		}
		return s;
	}
}

*/


//无名式
class Singleton{
	private Singleton(){};
	private final static Singleton s = new Singleton();
}










