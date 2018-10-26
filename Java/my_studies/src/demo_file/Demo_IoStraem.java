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
		//�ֽ���
		//Demo1();              //������ȡ�ļ��е�����
		//Demo2();              //���ļ���д������
		//Demo3();              //����һ��ͼƬ,���Ƽ��˷�������ΪЧ��̫��
		//Demo4();              //���Ƽ�����Ȼ��Demo3Ч�ʸߣ����п��ܻᵼ���ڴ����
		//Demo5();              //�Ƽ���д�뷽����Ҳ�����Ժ���Ŀ��ʹ�õķ���
		//Demo6();              //���û�������ɶ�д
		//Demo7();              //ʹ���ֽ���д����    �ֽ�����ȡ����ʱ���������
		//Demo8();              //ʹ��ͬһ������ ^(���) ���θ�ֵ���������    ��ͼ����м���
		//Demo9();              //�����ļ�·���������ļ���������Ŀ·����
		//Demo10();             //��������д���ļ�������quit�˳�
		
		//�ַ���
		
		//Demos1();             //�ַ�����ȡ
		//Demos2();             //�ַ���д��
		//Demos3();             //���ı��ļ��Ŀ���
		//Demos4();             //�ַ����鿽��
		//Demos5();             //����������
		//Demos6();             //readLine()��nextLine()�÷�
		//Demos7();             //���ı����ݵ���
		
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
		fw.write("���֪����ˮ");
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
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file)); //C:\Users\˿��\Desktop\����\��Ϸ\�ֹ�װ.txt
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
				System.out.println("�����ڸ��ļ���");
			}else if(fis.isDirectory()){
				System.out.println("�������·����һ���ļ��У�");
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
		fos.write("��˿��".getBytes());
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
		
		byte[] arr = new byte[1024 * 8];    //����1024��������
		int len;
		while((len = fis.read(arr)) != -1){     //ע��˴���arr����Ҫд����Ȼ��ȡ�ľͲ��ǳ��ȶ����ļ������ݵ����ֵ��  ����a=97
			fos.write(arr, 0, len);    //��write(arr)����д��ʱ�������ʣһ���ֽ�Ϊ���룬��С���鳤��Ϊ2����������һ�ζ�ȡ�ĵڶ����ֽ�û�б����ǣ����д�����
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
		//FileOutputStream fos = new FileOutputStream("bbb.txt");      //���캯��ֻ����һ������ʱ��ÿִ��һ�θ���䶼�����ԭ�����ļ�����
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
