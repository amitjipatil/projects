package in.hybridsoft.facebook.util;
import java.io.IOException;
import java.sql.*;

public class MakeConnection {
public static Connection getConnection()
{     Connection con=null;
	try{
	Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/facebook", "root", "root");
		return con;
	}
	catch(Exception e)
	{}
	return null;
	
	}

}
