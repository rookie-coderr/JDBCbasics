package JdbcBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCbasics {
	
	public static void main(String[] args) {
		System.out.println("JDBC test");
		
//		Connection connection = null ;
//		Statement statement = null;
//		ResultSet rs = null;
//		
		try (
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/my_database","root","root");
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery("select * from account");
				){
			
			
			//insert (C)
//			int result = statement.executeUpdate("insert into account values(1,'Wilson','john',5000)");
//			System.out.println("Number of rows inserted :" + result);
			
//			int result = statement.executeUpdate("insert into account values(2,'Luke','Dunphy',2000)");
//			System.out.println("Number of rows inserted :" + result);
			
//			int result = statement.executeUpdate("insert into account values(3,'Jay','Prichett',3000)");
//			System.out.println("Number of rows inserted :" + result);
//			
//			int result = statement.executeUpdate("insert into account values(4,'Harvey','spector',5000)");
//			System.out.println("Number of rows inserted :" + result);
			
			//insert (C)
//			int result = statement.executeUpdate("insert into account values(2,'William','Doe',4000)");
//			System.out.println("Number of rows inserted :" + result);
//			
			//update (U)
//			int result = statement.executeUpdate("update account set balance = 13000 where accno=2");
//			System.out.println("no. of rows updated" + result);
			
//			delete (D)
//			int result = statement.executeUpdate("delete from account where accno=2");
//			System.out.println("no. of rows updated" + result);
		
			//read (R)
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " - " + rs.getString(2)  + " " + rs.getString(3) + " Balance:" + rs.getInt(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
//		finally {
//			try {
//				if(rs!=null){
//					rs.close();
//				if(statement!=null)
//					statement.close();
//				if(connection!=null)
//					connection.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}	
//		}
		
	}
}
 
