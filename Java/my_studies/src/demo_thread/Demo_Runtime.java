package demo_thread;

import java.io.IOException;

public class Demo_Runtime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		//r.exec("shutdown -s -t 3000");     //设置系统关闭时间
		r.exec("shutdown -a");               //取消系统关闭时间
		

	}

}
