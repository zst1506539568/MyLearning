package my_practice;
import java.util.Scanner;
class  Inputs{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int x = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int y = sc.nextInt();
		int z = x + y;
		System.out.println("z = " + z);


	}
}
