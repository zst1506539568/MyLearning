package demo_thread;

import java.security.GeneralSecurityException;

public class Demo_Tickets {                     //用Runnable接口实现

	public static void main(String[] args) {
		// TODO Auto-generated method stub     //三个窗口卖票的多线程安全问题实例
		Tickets t = new Tickets();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}	

}


class Tickets implements Runnable{
	private int ticket = 100;
	Object o = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			while(true){
				synchronized (o) {
				if(ticket <= 0){
					break;
				}
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "...这是第" + ticket-- + "张票");
			}	
			
		}
		
	}
}

