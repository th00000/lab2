package pzh;
import java.sql.*;

public class Connecter {
	Connection connect=null; 
	Statement statement=null;
	public Connecter(){
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������   
		      //Class.forName("org.gjt.mm.mysql.Driver");
		      System.out.println("Success loading Mysql Driver!");
		    }
	    catch (Exception e) {
		      System.out.print("Error loading Mysql Driver!");
		      e.printStackTrace();
	    }
	    try {
	    	//����ѡ���
	        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb","root","abc123");
	    	//�ϴ�ѡ���
//	    	connect = DriverManager.getConnection("jdbc:mysql://onjyfvzbclye.rds.sae.sina.com.cn:10387/bookdb","root","abc123");
//	           ����URLΪ   jdbc:mysql//��������ַ/���ݿ���  �������2�������ֱ��ǵ�½�û���������
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
