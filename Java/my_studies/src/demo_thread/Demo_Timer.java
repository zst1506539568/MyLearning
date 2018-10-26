package demo_thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


//设置一个计时器，打印每秒的时间并在规定的秒数执行相应的操作      
public abstract class Demo_Timer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Timer t = new Timer();
		MyTimer mt = new MyTimer();
		t.schedule(mt, new Date(118, 6, 17, 14, 59, 15),3000);
		while(true){
			Thread.sleep(1000);
			System.out.println(new Date());
		}
		

	}

}


  class MyTimer extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("起床");
		
	}
	  
  }