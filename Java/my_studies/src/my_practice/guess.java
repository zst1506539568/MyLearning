package my_practice;
import java.util.Scanner;
class guess {
	public static void main(String[] args) {
		int number =(int)(Math.random() * 100);
		Scanner sc = new Scanner(System.in);
		while (true){
			System.out.println("请输入一个0-100之间的整数");
			int guess = sc.nextInt();
			if(guess > number){
				System.out.println("大了！");
			}else if(guess < number){
				System.out.println("小了！");
			}else{
				System.out.println("恭喜您猜对了！");
				break;
			}
		}
	}
}
