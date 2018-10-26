package demo_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_FileExceptionMoudle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Demo1();     //JDK1.6����ǰ
		try(
				FileInputStream fis = new FileInputStream("1920x1080.jpg");
				FileOutputStream fos = new FileOutputStream("copy.jpg"); //JDK1.7���Ժ���쳣���������п�д��Ӵiiu�Զ��رչ��ܵķ������������Լ�ȥдclose
		){
			int b;
			while((b = fis.read()) != -1){
				fos.write(b);
			}
		}

	}

	private static void Demo1() throws FileNotFoundException, IOException {
		FileInputStream fis =null;
		FileOutputStream fos =null;       //�ֲ���������Ҫ����ֵ���ܲ������������new�������⣬������޷���fis����close������
		try {
			fis = new FileInputStream("bbb.txt");
			fos = new FileOutputStream("bb.txt");
			
			int b;
			while((b = fis.read()) != -1){
				fos.write(b);
			}
		}finally{
			try{
				if(fis!=null)
					fis.close();
			}finally{
				if(fos!=null)
					fos.close();    //�ܹ�һ����һ��
			}	
		}
	}

}
