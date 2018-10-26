package demo_thread;

public class Demo_Notify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printers p = new Printers();
		new Thread(){
			public void run(){
				while(true){
					try {
						p.Print1();
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
						p.Print2();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();

	}

}


class Printers{
	private int flag = 1;
	public void Print1() throws InterruptedException{
		synchronized (this) {
			if(flag !=1 ){
				this.wait();
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("\r\n");
			flag = 2;
			this.notify();	
		}
		
	}
	
	
	public void Print2() throws InterruptedException{
	
		synchronized (this) {
			if(flag !=2 ){
				this.wait();
			}
			System.out.print("һ");
			System.out.print("Ŀ");
			System.out.print("��");
			System.out.print("\r\n");
			flag = 1;
			this.notify();
		}
		
		
	}
}
