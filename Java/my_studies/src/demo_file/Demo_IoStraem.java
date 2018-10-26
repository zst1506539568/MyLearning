package demo_file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo_IoStraem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//字节流
		//Demo1();              //遍历读取文件中的内容
		//Demo2();              //向文件中写入内容
		//Demo3();              //拷贝一个图片,不推荐此方法，因为效率太低
		//Demo4();              //不推荐，虽然比Demo3效率高，但有可能会导致内存溢出
		//Demo5();              //推荐的写入方法，也就是以后项目中使用的方法
		//Demo6();              //利用缓冲区完成读写
		//Demo7();              //使用字节流写中文    字节流读取中文时会出现问题
		//Demo8();              //使用同一个对象 ^(亦或) 两次该值不变的特性    对图像进行加密
		//Demo9();              //输入文件路径，将该文件拷贝到项目路径下
		//Demo10();             //输入内容写入文件，输入quit退出
		
		//字符流
		
		//Demos1();             //字符流读取
		//Demos2();             //字符流写入
		//Demos3();             //纯文本文件的拷贝
		//Demos4();             //字符数组拷贝
		//Demos5();             //缓冲区拷贝
		//Demos6();             //readLine()和nextLine()用法
		//Demos7();             //将文本内容倒置
		
	}



	private static void Demos7() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("aaa.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("copyss.txt"));
		String s;
		ArrayList<String> a = new ArrayList<>();
		while((s = br.readLine()) != null){
			a.add(s);
		}
		for(int i = a.size()-1;i>=0;i--){
			bw.write(a.get(i));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}



	private static void Demos6() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("aaa.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("copys.txt"));
		String s;;
		while((s = br.readLine()) != null){
			bw.write(s);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}



	private static void Demos5() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("aaa.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("copy3.txt"));
		int b;
		while((b = br.read()) != -1){
			bw.write(b);
		}
		
		br.close();
		bw.close();
	}



	private static void Demos4() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("aaa.txt");
		FileWriter fw = new FileWriter("copy2.txt");
		char [] bt = new char[1024];
		int len;
		while((len = fr.read(bt)) != -1){
			fw.write(bt,0,len);
		}
		fr.close();
		fw.close();
	}



	private static void Demos3() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("aaa.txt");
		FileWriter fw = new FileWriter("copy.txt");
		int b;
		while((b = fr.read()) != -1){
			fw.write(b);
		}
		
		fr.close();
		fw.close();
	}



	private static void Demos2() throws IOException {
		FileWriter fw = new FileWriter("aaa.txt");
		fw.write("醉后不知天在水");
		fw.close();
	}



	private static void Demos1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("bb.txt");
		int ch;
		while((ch = fr.read()) != -1){
			char c = (char)ch;
			System.out.print(c);
		}
		
		fr.close();
	}



	private static void Demo10() throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test.txt"));
		while(true){
			String s = sc.nextLine();
			if(s.equals("quit"))
				break;
			bos.write(s.getBytes());
			bos.write("\r\n".getBytes());
		}
		bos.close();
	}



	private static void Demo9() throws FileNotFoundException, IOException {
		File file = getFile();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file)); //C:\Users\丝婷\Desktop\其他\游戏\手工装.txt
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		int b;
		while((b = bis.read()) != -1){
			bos.write(b);
		}
		
		bis.close();
		bos.close();
	}
	
	
	
	private static  File getFile() throws FileNotFoundException{
		Scanner sc = new Scanner(System.in);
		while(true){
			String s = sc.nextLine();
			File fis = new File(s);
			if(!fis.exists()){
				System.out.println("不存在该文件！");
			}else if(fis.isDirectory()){
				System.out.println("您输入的路径是一个文件夹！");
			}else{
				return fis;
			}	
		}
	}

	private static void Demo8() throws FileNotFoundException, IOException {
		//BufferedInputStream bis = new BufferedInputStream(new FileInputStream("1920x1080.jpg"));
		//BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.jpg"));
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("copy.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy2.jpg"));
		int b;
		while((b = bis.read()) != -1){
			bos.write(b ^ 12);     
		}
		bis.close();
		bos.close();
	}

	private static void Demo7() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("bbb.txt");
		fos.write("张丝婷".getBytes());
		fos.close();
	}

	private static void Demo6() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("1920x1080.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		 int b;
		 while((b = bis.read()) != -1){
			 bos.write(b);
		 }
		
		 bis.close();
		 bos.close();
	}

	private static void Demo5() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("1920x1080.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		
		byte[] arr = new byte[1024 * 8];    //常用1024的整数倍
		int len;
		while((len = fis.read(arr)) != -1){     //注意此处的arr必须要写，不然读取的就不是长度而是文件中内容的码表值了  例如a=97
			fos.write(arr, 0, len);    //用write(arr)方法写入时，若最后还剩一个字节为读入，而小数组长度为2，则会造成上一次读取的第二个字节没有被覆盖，造成写入错误
		}
		
		fis.close();
		fos.close();
	}

	private static void Demo4() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("1920x1080.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		
		byte[] arr = new byte[fis.available()];
		fis.read(arr);
		fos.write(arr);
		
		fis.close();
		fos.close();
	}

	private static void Demo3() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("1920x1080.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		int b;
		while((b = fis.read()) != -1){
			fos.write(b);
		}
			
		fis.close();
		fos.close();
	}

	private static void Demo2() throws FileNotFoundException, IOException {
		//FileOutputStream fos = new FileOutputStream("bbb.txt");      //构造函数只传入一个参数时，每执行一次该语句都会清空原来的文件内容
		FileOutputStream fos = new FileOutputStream("bbb.txt",true);
		fos.write(100);
		fos.write(110);
		fos.close();
	}

	private static void Demo1() throws FileNotFoundException, IOException {
		FileInputStream file = new FileInputStream("bbb.txt");
		int b;
		while(( b = file.read()) != -1){
			System.out.println(b);
		}
	}

}
