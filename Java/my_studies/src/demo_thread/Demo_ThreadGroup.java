package demo_thread;

public class Demo_ThreadGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnables mr = new MyRunnables();
		ThreadGroup tg = new ThreadGroup("≤‚ ‘œﬂ≥Ã◊È");
		Thread t1 = new Thread(tg, mr, "zhang");
		Thread t2 = new Thread(tg, mr, "liu");
		System.out.println(t1.getThreadGroup().getName());
	}

}





class MyRunnables implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}