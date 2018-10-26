package demo_thread;

public class Demo_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyThread mt = new MyThread();
		//mt.start();
		//MyRunnable mr = new MyRunnable();
		//Thread t = new Thread(mr);
		//t.start();
		/*new Thread(){                        //匿名内部类Thread方法
			public void run(){
				for(int i = 0; i<1000; i++){
					this.setName("xx--");
					System.out.println(this.getName() + "1111111111111");
				}
			}
		}.start();
		
		new Thread(new Runnable(){           //匿名内部类Runnable方法
			public void run(){
				for(int i = 0; i<1000; i++){
					System.out.println(Thread.currentThread().getName() + "3333333");   //Runnable方法不能直接调用getname方法
				}
			}
		}).start();
		for(int j=0; j<1000 ;j++){
			System.out.println("---------------------");
		}*/
		
		
		
		//Demo1();             线程睡眠
		
		
		//Demo2();             守护线程
		
		
		//Demo3();             线程插队
		
		
		//Demo4();             为线程设置优先级，最高为10，最低为1
		
		
		//Demo5();             //加锁
		
		
	}




	private static void Demo5() {
		Printer p = new Printer();
		new Thread(){
			public void run(){
				while(true){
					p.print5();
				}
			}
		}.start();
		
		
		new Thread(){
			public void run(){
				while(true){
					p.print6();
				}
			}
		}.start();
	}




	private static void Demo4() {
		Thread t1 = new Thread(){                        
			public void run(){
				for(int i = 0; i<20; i++){
					this.setName("0000--");
					System.out.println(this.getName() + "--------------------");
				}
			}
		};
		
		
		Thread t2 = new Thread(){                        //匿名内部类Thread方法
			public void run(){
				for(int i = 0; i<20; i++){
					this.setName("xx--");
					System.out.println(this.getName() + "1111111111111");
				}
			}
		};
		
		t1.setPriority(1);
		t2.setPriority(10);       
		t1.start();
		t2.start();
	}




	private static void Demo3() {
		Thread t1 = new Thread(){                        
			public void run(){
				for(int i = 0; i<20; i++){
					this.setName("0000--");
					System.out.println(this.getName() + "--------------------");
				}
			}
		};
		
		
		Thread t2 = new Thread(){                        //匿名内部类Thread方法
			public void run(){
				for(int i = 0; i<20; i++){
					if(i == 2){
						try {
							t1.join(1);       //线程插队1毫秒
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					this.setName("xx--");
					System.out.println(this.getName() + "1111111111111");
				}
			}
		};
		
		t1.start();
		t2.start();
	}




	private static void Demo2() {
		Thread t1 = new Thread(){                        
			public void run(){
				for(int i = 0; i<5; i++){
					this.setName("0000--");
					System.out.println(this.getName() + "--------------------");
				}
			}
		};
		
		
		Thread t2 = new Thread(){                        //匿名内部类Thread方法
			public void run(){
				for(int i = 0; i<1000; i++){
					this.setName("xx--");
					System.out.println(this.getName() + "1111111111111");
				}
			}
		};
		t2.setDaemon(true);      //创建守护线程，在t1执行完之后t2也会结束，但有一定的延迟
		t1.start();
		t2.start();
	}

	
	
	
	private static void Demo1() {
		new Thread(){
			public void run(){
				for(int i = 0; i < 100; i++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(getName() + "...." + i);
				}
			}
		}.start();
		
		new Thread(){
			public void run(){
				for(int i = 0; i < 100; i++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(getName() + "------------------" + i);
				}
			}
		}.start();
	}

}





class MyThread extends Thread{                  //创建子线程第一种方法
	public void run(){
		for(int i = 0; i<1000; i++){
			System.out.println("1111111111111");
		}
	}
}

class MyRunnable implements Runnable {          //创建子线程第二种方法
	public void run() {
		for(int i = 0; i<1000; i++){
			System.out.println("1111111111111");
		}
	}
}

class Printer{
	Object o = new Object();
	
	public void print1(){
		synchronized(o){
			System.out.print("大");
			System.out.print("天");
			System.out.print("狗");
			System.out.print("\r\n");
		}
	}
	public void print2(){
		synchronized (o) {
			System.out.print("一");
			System.out.print("目");
			System.out.print("连");
			System.out.print("\r\n");
		}
		
	}
	
	public synchronized void print3(){
		System.out.print("大");
		System.out.print("天");
		System.out.print("狗");
		System.out.print("\r\n");
	}
	
	public void print4(){
		synchronized (this) {
			System.out.print("一");
			System.out.print("目");
			System.out.print("连");
			System.out.print("\r\n");
		}
	}
	
	public static synchronized void print5(){
		System.out.print("大");
		System.out.print("天");
		System.out.print("狗");
		System.out.print("\r\n");
	}
	
	
	public void print6(){
		synchronized (Printer.class) {
			System.out.print("一");
			System.out.print("目");
			System.out.print("连");
			System.out.print("\r\n");
		}
	}
	
}