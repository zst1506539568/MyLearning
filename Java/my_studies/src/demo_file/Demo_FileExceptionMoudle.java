package demo_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_FileExceptionMoudle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Demo1();     //JDK1.6及以前
		try(
				FileInputStream fis = new FileInputStream("1920x1080.jpg");
				FileOutputStream fos = new FileOutputStream("copy.jpg"); //JDK1.7及以后的异常处理，（）中可写据哟iiu自动关闭功能的方法，不必再自己去写close
		){
			int b;
			while((b = fis.read()) != -1){
				fos.write(b);
			}
		}

	}

	private static void Demo1() throws FileNotFoundException, IOException {
		FileInputStream fis =null;
		FileOutputStream fos =null;       //局部变量必须要赋初值才能操作，否则如果new出了问题，后面就无法对fis进行close操作了
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
					fos.close();    //能关一个是一个
			}	
		}
	}

}
