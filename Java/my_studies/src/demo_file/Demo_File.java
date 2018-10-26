package demo_file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;


/*
 * * 判断功能
	* public boolean isDirectory():判断是否是目录
	* public boolean isFile():判断是否是文件
	* public boolean exists():判断是否存在
	* public boolean canRead():判断是否可读         windows默认可读    不能更改
	* public boolean canWrite():判断是否可写       windows可以改变可不可写
	* public boolean isHidden():判断是否隐藏
	* 
	* 
 * * 获取功能
	* public String getAbsolutePath()：获取绝对路径
	* public String getPath():获取路径
	* public String getName():获取名称
	* public long length():获取长度。字节数
	* public long lastModified():获取最后一次的修改时间，毫秒值
	* public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
	* public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组 
 * */
 

public class Demo_File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Demo1();
		//Demo2();
		//Demo3();     //file类的3个常用构造方法
		//Demo4();
		//Demo5();     //renameto方法    若在同一路径下就改名，若在不同路径下就剪切并改名
		//Demo6();     //delete方法        可直接删除文件以及空的文件夹，若文件夹下有子文件夹则无法删除
		//Demo7();     //输出最后修改时间，并将时间格式化输出
		//Demo8();     //String []arr   打印的是文件夹下的文件名          而File[] 打印的是完整的路径
		//Demo9();     //打印文件夹下所有后缀为.txt的文件名
		//Demo10();    //文件名称过滤器
	}

	private static void Demo10() {
		File file = new File("C:\\Users\\丝婷\\Desktop\\其他\\游戏");
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
		File file = new File("C:\\Users\\丝婷\\Desktop\\其他\\游戏");
		File[] f = file.listFiles();
		for (File file2 : f) {
			if(file2.getName().endsWith(".txt")){
			System.out.println(file2);
			}
		}
	}

	private static void Demo8() {
		File file2 = new File("D:\\学习教程\\java教程\\java基础\\day19\\day19\\video");
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
		File file = new File("D:\\学习教程\\java教程\\java基础\\day19\\day19\\笔记+作业");
		Date d = new Date(file.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
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
		File parent = new File("D:\\学习教程\\java教程\\Java练习");
		String child = "compare.java";
		File file = new File(parent, child);
		System.out.println(file.exists());
	}

	private static void Demo2() {
		String parent = "D:\\学习教程\\java教程\\Java练习";
		String child = "compare.java";
		File file = new File(parent, child);
		System.out.println(file.exists());
	}

	private static void Demo1() {
		File file = new File("D:\\学习教程\\java教程\\Java练习\\compare.java");
		System.out.println(file.exists());
	}

}
