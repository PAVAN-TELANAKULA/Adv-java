package javamysql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {
	public static void main(String[] args) throws Exception
	{
		String url ="jdbc:mysql://localhost:3306/Brilworks";
		String uname ="root";
		String pass = "Pavan@0008";
		String query = "Select * from Employee";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		String userData = "";
		while(rs.next())
		{
			userData = rs.getInt(1)+":"+rs.getString(2)+"--"+rs.getString(3)+"--"+rs.getString(4);
			System.out.println(userData);
		}

		st.close();
		con.close();
	}
}
