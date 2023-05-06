import java.sql.*;
public class Callable
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		CallableStatement stmt = con.prepareCall("{call INSERT(?,?)}");
		stmt.setString(1,"keerthana");
		stmt.setString(2,"HYD");
		stmt.executeUpdate();
		
	}
}