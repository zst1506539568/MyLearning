package my_practice;
import java.util.Scanner;
class guess {
	public static void main(String[] args) {
		int number =(int)(Math.random() * 100);
		Scanner sc = new Scanner(System.in);
		while (true){
			System.out.println("������һ��0-100֮�������");
			int guess = sc.nextInt();
			if(guess > number){
				System.out.println("���ˣ�");
			}else if(guess < number){
				System.out.println("С�ˣ�");
			}else{
				System.out.println("��ϲ���¶��ˣ�");
				break;
			}
		}
	}
}
