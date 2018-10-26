package demo_thread;

public class Demo_Ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub         //��Thread����ʵ��
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
		

	}

}



class Ticket extends Thread{
	private static int ticket = 100;
	public void run(){
		while(true){
			synchronized (Ticket.class) {
			if(ticket <= 0){
				break;
			}
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName() + "...���ǵ�" + ticket-- + "��Ʊ");
			}
		}
	}
}
	