import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Datebases {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn;     //����Connection����
		String driver = "com.mysql.jdbc.Driver";    //����������
		String url = "jdbc:mysql://localhost:3306/atm";  //URLָ��Ҫ���ʵ����ݿ���
		String user = "root";   //MySql�û���
		String password = "zst15122172253";
		
		
		Class.forName(driver);  //������������
		
		
		 //1.getConnection()����������MySQL���ݿ�
		conn = (Connection) DriverManager.getConnection(url, user, password);
		if(!conn.isClosed()){
			System.out.println("���ӳɹ�");
		}
		
		 //2.����statement���������ִ��SQL���
		Statement statemaent = (Statement) conn.createStatement();
		
		
		//Ҫִ�е�SQL���
		
		String sql = "select * from shopping";
		
		//3.ResultSet�࣬������Ż�ȡ�Ľ����
		ResultSet rs = statemaent.executeQuery(sql);
	    System.out.println("-----------------");
	    System.out.println("ִ�н��������ʾ:");  
	    System.out.println("-----------------");  
	    System.out.println("����" + "\t" + "�۸�");  
	    System.out.println("-----------------");
	    
	    String name = null;
		int price = 0;
		while(rs.next()){
			name = rs.getString("goods");
			price = rs.getShort("price");
			System.out.println(name + "\t" + price);
		}
		
		rs.close();
		conn.close();
	}

}
