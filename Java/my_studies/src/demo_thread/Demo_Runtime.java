package demo_thread;

import java.io.IOException;

public class Demo_Runtime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		//r.exec("shutdown -s -t 3000");     //����ϵͳ�ر�ʱ��
		r.exec("shutdown -a");               //ȡ��ϵͳ�ر�ʱ��
		

	}

}
