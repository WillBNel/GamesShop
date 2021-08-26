package natwestAWSWBN;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JDBCConnection {

	static final String DB_URL = "jdbc:mysql://database-1.c9xnjsjjhczx.eu-west-2.rds.amazonaws.com/gamesShop";
	private String user;
	private String pass;

	static Connection conn = null;
	static Statement stmt = null;

	public JDBCConnection(String user, String pass) {
		this.user = user;
		this.pass = pass;
		try {
			conn = DriverManager.getConnection(DB_URL, user, pass);
			stmt = conn.createStatement();
			} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void exUpdate(String query) {
		try {
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultSet exQuery(String query) {
		ResultSet response = null;
		try {
			response = stmt.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return response;
	}

	static void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
}
