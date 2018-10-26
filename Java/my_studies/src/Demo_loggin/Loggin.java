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
			System.out.println("请输入您的密码:");
			Scanner scanner = new Scanner(System.in);
			String my_password = scanner.nextLine();
			if(password.equals(my_password)){
				System.out.println("密码正确！");
				flag=1;
				break;
			}else{
				count+=1;
				System.out.println("您的密码错误，您还有" + (3-count) + "次机会");
			}
		}
		if(flag == 0){
			System.out.println("您已经输入密码错误三次，账户已被锁定！");
		}
		
	}

}
