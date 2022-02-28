package javamysql;
import java.sql.*;
import java.util.Scanner;

public class CrudOperation1 {

	public static void main(String[] args) throws SQLException {

		Scanner sc=new Scanner(System.in);
		System.out.print("press 1 for insert\npress 2 for update\npress 3 for delete\npress 4 for fetch\n" +
				"\nEnter choice : ");
		int choice = sc.nextInt();

		switch (choice){
			case 1:
				CrudOperation2.insert();
				break;

			case 2:
				CrudOperation2.update();
				break;

			case 3:
				CrudOperation2.delete();
				break;

			case 4:
				CrudOperation2.fetch();
				break;
		}
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Connection con;

		Class.forName("com.mysql.cj.jdbc.Driver");

		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Brilworks?useSSL=false","root","Pavan@0008");

		return con;

	}
}

