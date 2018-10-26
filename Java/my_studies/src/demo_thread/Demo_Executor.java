package demo_thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo_Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService pool = Executors.newFixedThreadPool(3);
		pool.submit(new MyRunnables1());
		pool.submit(new MyRunnables1());
		pool.submit(new MyRunnables1());
		
		pool.shutdown();

	}

}




class MyRunnables1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i<100 ; i++){
			System.out.println(Thread.currentThread().getName() + "..." + i );
		}
		
	}
	
}
