package Demo_loggin;

import java.util.Scanner;

public class Loggin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loggin l = new Loggin();
		l.checkout();
	}
	private String username = "admin";
	private String password = "admin";
	private int count = 0;
	
	public Loggin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Loggin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public void checkout(){
		int flag = 0;
		for(;count<3;){
			System.out.println("��������������:");
			Scanner scanner = new Scanner(System.in);
			String my_password = scanner.nextLine();
			if(password.equals(my_password)){
				System.out.println("������ȷ��");
				flag=1;
				break;
			}else{
				count+=1;
				System.out.println("�����������������" + (3-count) + "�λ���");
			}
		}
		if(flag == 0){
			System.out.println("���Ѿ���������������Σ��˻��ѱ�������");
		}
		
	}

}
