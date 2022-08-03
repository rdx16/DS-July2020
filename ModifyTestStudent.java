import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ModifyTestStudent {
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
			PreparedStatement pst = conn.prepareStatement("UPDATE EMPLOYEE SET STUNAME=?, BDATE=?, PHYSICS=?, CHEMISTRY=?, MATH=?, TOTAL=?, WHERE ROLLNO=?");
			System.out.println("Prepared Statement created : "+pst);
			
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter student number : ");
			int rno = scan1.nextInt();
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from student where rollno="+rno);
			
			if(rs.next()) {
			
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Enter student name   : ");
				String stuname = scan2.next();
				
				Scanner scan3 = new Scanner(System.in);
				System.out.println("Enter student bday : ");
				java.sql.Date date = scan3.findAll(Date);
				
				Scanner scan4 = new Scanner(System.in);
				System.out.println("Enter PHYSICS marks : ");
				int phy = scan4.nextInt();
				
				Scanner scan5 = new Scanner(System.in);
				System.out.println("Enter CHEMISTRY marks   : ");
				int chem = scan5.nextInt();
				
				Scanner scan6 = new Scanner(System.in);
				System.out.println("Enter MATH marks : ");
				int math = scan6.nextInt();
				
				Scanner scan7 = new Scanner(System.in);
				System.out.println("Enter TOTAL : ");
				int total = scan1.nextInt();
				
				Scanner scan8 = new Scanner(System.in);
				System.out.println("Enter GRADE   : ");
				String grade = scan8.next();
				
				pst.setString(2, stuname);
				pst.setDate(3, date);
				pst.setInt(4, phy);
				pst.setInt(5, chem);
				pst.setInt(6, math);
				pst.setInt(7, total);
				pst.setString(8, grade);

				System.out.println("Trying to execute the prepared statement....");
				int rows = pst.executeUpdate();
				
				System.out.println("Prepred Statement executed, updated the records :..."+rows);
				
			}
			else {
				EmployeeNotFoundException1 ex = new EmployeeNotFoundException1("This employee number does not exists : "+rno);
				throw ex;
			}
			
			
				
			
			pst.close();	conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    
	}
}