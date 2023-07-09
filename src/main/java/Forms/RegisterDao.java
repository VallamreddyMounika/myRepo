package Forms;

import java.sql.*;

public class RegisterDao {
	private String dburl="jdbc:mysql://localhost:3306/userdb";
	private String dbUname="root";
	private String dbPassword="Zendaya#4A3";
	private String dbDriver="com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con=null;
		try {
			con=DriverManager.getConnection(dburl,dbUname,dbPassword);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public String insert(Member m) throws SQLException {
		loadDriver(dbDriver);
		Connection con=getConnection();
		String result="Data entered Successfully";
		String query="insert into member values (?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setString(1, m.getuName());
		ps.setString(2, m.getuPass());
		ps.setString(3,m.getuMail());
		ps.setString(4, m.getuPhone());
		ps.executeUpdate();
		
		
		return result;
	}

}
