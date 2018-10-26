package demo_reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.omg.Messaging.SyncScopeHelper;

public class Demo_Reflect {       //ͨ�������ļ���ȡ��

	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("config.properties"));
		Class clazz = Class.forName(br.readLine());
		Fruit f = (Fruit) clazz.newInstance();
		Juicer j = new Juicer();
		j.run(f);
	}

}




interface Fruit{
	public void zhazhi();
}



class Apple implements Fruit{
	public void zhazhi(){
		System.out.println("һ��ƻ��֭");
	}
}

class Orange implements Fruit{
	public void zhazhi(){
		System.out.println("һ������֭");
	}
}



class Juicer{
	public void run(Fruit f){
		f.zhazhi();
	}
}

