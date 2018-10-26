package demo_thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo_RenntrantLock {        //用lock和unlock实现多线程机制

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer1 p = new Printer1();
		new Thread(){
			public void run(){
				while(true){
					try {
						p.print1();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread(){
			public void run(){
				while(true){
					try {
						p.print2();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread(){
			public void run(){
				while(true){
					try {
						p.print3();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();

	}

}


class Printer1{
	private ReentrantLock r = new ReentrantLock();
	private Condition c1 = r.newCondition();
	private Condition c2 = r.newCondition();
	private Condition c3 = r.newCondition();
	private int flag = 1;
	
	
	public void print1() throws InterruptedException{
		r.lock();
		while(flag != 1){
			c1.await();
		}
		System.out.print("1");
		System.out.print("2");
		System.out.println("3");
		flag = 2;
		c2.signal();
		r.unlock();
	}
	
	
	public void print2() throws InterruptedException{
		r.lock();
		while(flag != 2){
			c2.await();
		}
		System.out.print("a");
		System.out.print("b");
		System.out.println("c");
		flag = 3;
		c3.signal();
		r.unlock();
	}
	
	
	public void print3() throws InterruptedException{
		r.lock();
		while(flag != 3){
			c3.await();
		}
		System.out.print("-");
		System.out.print("=");
		System.out.println(".");
		flag = 1;
		c1.signal();
		r.unlock();
	}
	
}
