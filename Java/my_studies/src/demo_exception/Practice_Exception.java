package demo_exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Practice_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*while(true){
			System.out.println("������һ������:");
			Scanner sc = new Scanner(System.in);
			try {
				Integer i = sc.nextInt();
				try {
					new BigInteger(i.toString());
					System.out.println("������������������������룡");
				} catch (Exception e) {
					// TODO: handle exception
					try {
						new BigDecimal(i);
						System.out.println("��������ΪС��������������һ��������");
					} catch (Exception e2) {
						// TODO: handle exception
						System.out.println(Integer.toBinaryString(i));
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("���������ǷǷ��ַ������������룡");
			}
		
		}*/                       //�߼�����
		
		
		while(true){
			System.out.println("������һ������:");
			Scanner sc =new Scanner(System.in);
			String s = sc.nextLine();
			if(s.equals("quit")){
				break;
			}
			try {
				int i = Integer.parseInt(s);
				System.out.println(Integer.toBinaryString(i));
				
			} catch (Exception e) {
				// TODO: handle exception
				try {
					new BigInteger(s);
					System.out.println("������������������������룡");
				} catch (Exception e2) {
					// TODO: handle exception
					try {
						new BigDecimal(s);
						System.out.println("��������ΪС��������������һ��������");
					} catch (Exception e3) {
						// TODO: handle exception
						System.out.println("���������ǷǷ��ַ������������룡");
					}
					
				}
			}
			
		}
		
		
		
		
		

	}

}
