package demo_file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;


/*
 * * �жϹ���
	* public boolean isDirectory():�ж��Ƿ���Ŀ¼
	* public boolean isFile():�ж��Ƿ����ļ�
	* public boolean exists():�ж��Ƿ����
	* public boolean canRead():�ж��Ƿ�ɶ�         windowsĬ�Ͽɶ�    ���ܸ���
	* public boolean canWrite():�ж��Ƿ��д       windows���Ըı�ɲ���д
	* public boolean isHidden():�ж��Ƿ�����
	* 
	* 
 * * ��ȡ����
	* public String getAbsolutePath()����ȡ����·��
	* public String getPath():��ȡ·��
	* public String getName():��ȡ����
	* public long length():��ȡ���ȡ��ֽ���
	* public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
	* public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
	* public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File���� 
 * */
 

public class Demo_File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Demo1();
		//Demo2();
		//Demo3();     //file���3�����ù��췽��
		//Demo4();
		//Demo5();     //renameto����    ����ͬһ·���¾͸��������ڲ�ͬ·���¾ͼ��в�����
		//Demo6();     //delete����        ��ֱ��ɾ���ļ��Լ��յ��ļ��У����ļ����������ļ������޷�ɾ��
		//Demo7();     //�������޸�ʱ�䣬����ʱ���ʽ�����
		//Demo8();     //String []arr   ��ӡ�����ļ����µ��ļ���          ��File[] ��ӡ����������·��
		//Demo9();     //��ӡ�ļ��������к�׺Ϊ.txt���ļ���
		//Demo10();    //�ļ����ƹ�����
	}

	private static void Demo10() {
		File file = new File("C:\\Users\\˿��\\Desktop\\����\\��Ϸ");
		File[] f = file.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File file, String name) {
				// TODO Auto-generated method stub
				File files = new File(file,name);
				return files.isFile() && files.getName().endsWith(".txt");
			}
		});
		for(File files : f){
			System.out.println(files);
		}
	}

	private static void Demo9() {
		File file = new File("C:\\Users\\˿��\\Desktop\\����\\��Ϸ");
		File[] f = file.listFiles();
		for (File file2 : f) {
			if(file2.getName().endsWith(".txt")){
			System.out.println(file2);
			}
		}
	}

	private static void Demo8() {
		File file2 = new File("D:\\ѧϰ�̳�\\java�̳�\\java����\\day19\\day19\\video");
		String []arr = file2.list();
		for (String string : arr) {
			System.out.println(string);
		}
		
		
		File []listFiles = file2.listFiles();
		for (File file3 : listFiles) {
			System.out.println(file3);
		}
	}

	private static void Demo7() {
		File file = new File("D:\\ѧϰ�̳�\\java�̳�\\java����\\day19\\day19\\�ʼ�+��ҵ");
		Date d = new Date(file.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		System.out.println(sdf.format(d));
	}

	private static void Demo6() {
		File file = new File("aaa.txt");
		file.delete();
		File file2 = new File("bbb");
		file2.delete();
	}

	private static void Demo5() throws IOException {
		File file = new File("aaa.txt");
		File file2 = new File("bb.txt");
		file.createNewFile(); 
		file.renameTo(file2);
	}

	private static void Demo4() throws IOException {
		File file1 = new File("aaa.txt");
		File file2 = new File("bbb//ccc");
		file1.createNewFile();
		file2.mkdirs();
	}

	private static void Demo3() {
		File parent = new File("D:\\ѧϰ�̳�\\java�̳�\\Java��ϰ");
		String child = "compare.java";
		File file = new File(parent, child);
		System.out.println(file.exists());
	}

	private static void Demo2() {
		String parent = "D:\\ѧϰ�̳�\\java�̳�\\Java��ϰ";
		String child = "compare.java";
		File file = new File(parent, child);
		System.out.println(file.exists());
	}

	private static void Demo1() {
		File file = new File("D:\\ѧϰ�̳�\\java�̳�\\Java��ϰ\\compare.java");
		System.out.println(file.exists());
	}

}
