import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class SelectTestStudent {

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
			ResultSet rs = statement.executeQuery("SELECT * FROM STUDENT");
			System.out.println("Statement Executed, got the result.......");
			
			while(rs.next()) {
				int rollno = rs.getInt(1);
				String stuname= rs.getNString(2);
				Date bdate = rs.getDate(3);
				int phy = rs.getInt(4);
				int chem = rs.getInt(5);
				int math = rs.getInt(6);
				int total = rs.getInt(7);
				String grade =rs.getNString(8);
				
				System.out.println("ROLL NUMBER      "+rollno);
				System.out.println("STUDENT NAME     "+stuname);
				System.out.println("GRADE            "+bdate);
				System.out.println("PHYSICS          "+phy);
				System.out.println("STUDENT NAME     "+chem);
				System.out.println("GRADE            "+math);
				System.out.println("ROLL NUMBER      "+total);
				System.out.println("STUDENT NAME     "+grade);
				
				}
			rs.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("show the data base");
	}

}
