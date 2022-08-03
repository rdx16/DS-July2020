import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ModifyTest {
	public static void main(String[] args) throws EmployeeAlreadyExistsException
	{
		
		//1. WE KNOW THE DRIVER - org.hsqldb.jdbc.JDBCDriver.class
		//2. REGISTER THIS DRIVER
		try {
			System.out.println("Registering driver...");    
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			
			System.out.println("Connected to the DB : "+conn);
			
			System.out.println("trying to make a Prepared statment");
			PreparedStatement pst = conn.prepareStatement("UPDATE EMPLOYEE SET EMPNAME=?, EMSAL=? WHERE EMPNO=?");
			System.out.println("Prepared Statement created : "+pst);
			
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter employee number : ");
			int eno = scan1.nextInt();
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from employee where empno="+eno);
			
			if(rs.next()) {
			
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Enter employee name   : ");
				String ename = scan2.next();
				
				Scanner scan3 = new Scanner(System.in);
				System.out.println("Enter employee salary : ");
				int esal = scan3.nextInt();
				
				pst.setInt(3, eno);//fill up the question mark with its value
				pst.setString(1, ename);
				pst.setInt(2, esal);

				System.out.println("Trying to execute the prepared statement....");
				int rows = pst.executeUpdate();
				
				System.out.println("Prepred Statement executed, updated the records :..."+rows);
				
			}
			else {
				EmployeeNotFoundException1 ex = new EmployeeNotFoundException1("This employee number does not exists : "+eno);
				throw ex;
			}
			
			
				
			
			pst.close();	conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    
	}
}