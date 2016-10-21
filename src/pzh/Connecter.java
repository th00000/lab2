package pzh;
import java.sql.*;

public class Connecter {
	Connection connect=null; 
	Statement statement=null;
	public Connecter(){
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
		      //Class.forName("org.gjt.mm.mysql.Driver");
		      System.out.println("Success loading Mysql Driver!");
		    }
	    catch (Exception e) {
		      System.out.print("Error loading Mysql Driver!");
		      e.printStackTrace();
	    }
	    try {
	    	//本地选这个
	        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb","root","abc123");
	    	//上传选这个
//	    	connect = DriverManager.getConnection("jdbc:mysql://onjyfvzbclye.rds.sae.sina.com.cn:10387/bookdb","root","abc123");
//	           连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码
	          statement = connect.createStatement();
	          System.out.println("Success connect Mysql server!");  
	    }
	    catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
	    }
	}
	public void close() throws SQLException{
		if (connect!=null){
			connect.close();
		}
		System.out.println("SQL Closed Successfully !");		
	}
	
	public boolean execute(String sql) throws SQLException {
		return this.statement.execute(sql);
	}
	
	public ResultSet executeQuery(String sql) throws SQLException {
		System.out.println(sql);
		return this.statement.executeQuery(sql);
	}
	
	public int excuteUpdate(String sql) throws SQLException{
		return this.statement.executeUpdate(sql);
	}

	public void executeUpdate(String sql) throws SQLException {
		this.statement.executeUpdate(sql);
	}

	 
}
