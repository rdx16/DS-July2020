import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectWhereTest {

	public static void main(String[] args) {
	
		
		
		
		try {
			System.out.println("Registring database");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver is registered.....");
		
			System.out.println("Tryng to connect ot the DB");
			Connection Conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
			System.out.println("Connected to the Database"+Conn);
		    Statement statement= Conn.createStatement();
			System.out.println("Trying to execute the statement........");
			System.out.println("Enter the Number");
			Scanner scan = new Scanner(System.in);
			int eno = scan.nextInt();
			ResultSet rs = statement.executeQuery("SELECT * FROM EMPLOYEE where EMPNO="+eno);
			System.out.println("Statement Executed, got the result.......");

			if(rs.next()) {
				int empno = rs.getInt(1);
				String ename= rs.getNString(2);
				int sal = rs.getInt(3);
				
				System.out.println("EMP NO      "+empno);
				System.out.println("EMP NAME      "+ename);
				System.out.println("EMP SALA      "+sal);
				
				}
			else
			{
				EmployeeNotFoundException1 empNotEx = new EmployeeNotFoundException1("Employee not found");
				throw empNotEx;
			}
			rs.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("show the data base");
	}

}
