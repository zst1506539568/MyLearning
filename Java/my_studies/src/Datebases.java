import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Datebases {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn;     //声明Connection对象
		String driver = "com.mysql.jdbc.Driver";    //驱动程序名
		String url = "jdbc:mysql://localhost:3306/atm";  //URL指向要访问的数据库名
		String user = "root";   //MySql用户名
		String password = "zst15122172253";
		
		
		Class.forName(driver);  //加载驱动程序
		
		
		 //1.getConnection()方法，连接MySQL数据库
		conn = (Connection) DriverManager.getConnection(url, user, password);
		if(!conn.isClosed()){
			System.out.println("连接成功");
		}
		
		 //2.创建statement类对象，用来执行SQL语句
		Statement statemaent = (Statement) conn.createStatement();
		
		
		//要执行的SQL语句
		
		String sql = "select * from shopping";
		
		//3.ResultSet类，用来存放获取的结果集
		ResultSet rs = statemaent.executeQuery(sql);
	    System.out.println("-----------------");
	    System.out.println("执行结果如下所示:");  
	    System.out.println("-----------------");  
	    System.out.println("名称" + "\t" + "价格");  
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
