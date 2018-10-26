package demo_thread;

public class Demo_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyThread mt = new MyThread();
		//mt.start();
		//MyRunnable mr = new MyRunnable();
		//Thread t = new Thread(mr);
		//t.start();
		/*new Thread(){                        //�����ڲ���Thread����
			public void run(){
				for(int i = 0; i<1000; i++){
					this.setName("xx--");
					System.out.println(this.getName() + "1111111111111");
				}
			}
		}.start();
		
		new Thread(new Runnable(){           //�����ڲ���Runnable����
			public void run(){
				for(int i = 0; i<1000; i++){
					System.out.println(Thread.currentThread().getName() + "3333333");   //Runnable��������ֱ�ӵ���getname����
				}
			}
		}).start();
		for(int j=0; j<1000 ;j++){
			System.out.println("---------------------");
		}*/
		
		
		
		//Demo1();             �߳�˯��
		
		
		//Demo2();             �ػ��߳�
		
		
		//Demo3();             �̲߳��
		
		
		//Demo4();             Ϊ�߳��������ȼ������Ϊ10�����Ϊ1
		
		
		//Demo5();             //����
		
		
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
		
		
		Thread t2 = new Thread(){                        //�����ڲ���Thread����
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
		
		
		Thread t2 = new Thread(){                        //�����ڲ���Thread����
			public void run(){
				for(int i = 0; i<20; i++){
					if(i == 2){
						try {
							t1.join(1);       //�̲߳��1����
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
		
		
		Thread t2 = new Thread(){                        //�����ڲ���Thread����
			public void run(){
				for(int i = 0; i<1000; i++){
					this.setName("xx--");
					System.out.println(this.getName() + "1111111111111");
				}
			}
		};
		t2.setDaemon(true);      //�����ػ��̣߳���t1ִ����֮��t2Ҳ�����������һ�����ӳ�
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





class MyThread extends Thread{                  //�������̵߳�һ�ַ���
	public void run(){
		for(int i = 0; i<1000; i++){
			System.out.println("1111111111111");
		}
	}
}

class MyRunnable implements Runnable {          //�������̵߳ڶ��ַ���
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
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("\r\n");
		}
	}
	public void print2(){
		synchronized (o) {
			System.out.print("һ");
			System.out.print("Ŀ");
			System.out.print("��");
			System.out.print("\r\n");
		}
		
	}
	
	public synchronized void print3(){
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.print("\r\n");
	}
	
	public void print4(){
		synchronized (this) {
			System.out.print("һ");
			System.out.print("Ŀ");
			System.out.print("��");
			System.out.print("\r\n");
		}
	}
	
	public static synchronized void print5(){
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.print("\r\n");
	}
	
	
	public void print6(){
		synchronized (Printer.class) {
			System.out.print("һ");
			System.out.print("Ŀ");
			System.out.print("��");
			System.out.print("\r\n");
		}
	}
	
}