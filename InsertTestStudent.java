import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class InsertTestStudent {
	public static void main(String[] args) {

		try {
			System.out.println("Registering driver...");    
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			
			System.out.println("Connected to the DB : "+conn);
			
			System.out.println("trying to make a Prepared statment");
			PreparedStatement pst = conn.prepareStatement("INSERT INTO STUDENT VALUES (?,?,?,?,?,?,?,?);");
			System.out.println("Prepared Statement created : "+pst);
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter student roll number : ");
			int rno = scan1.nextInt();
			
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Enter stuent name   : ");
			String stuname = scan2.next();
			
			
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

			Scanner scan3 = new Scanner(System.in);
			System.out.println("Enter student birthday : ");
			Date bod=Date.valueOf(scan3.next());
			
			
			pst.setInt(1, rno);//fill up the question mark with its value
			pst.setString(2, stuname);
			pst.setDate(3, bod);
			pst.setInt(4, phy);
			pst.setInt(5, chem);
			pst.setInt(6, math);
			pst.setInt(7, total);
			pst.setString(8, grade);
			
			System.out.println("Trying to execute the prepared statement....");
			int rows = pst.executeUpdate();
			
			System.out.println("Prepred Statement executed, inserted the records :..."+rows);
				
			
			pst.close();	conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    
	}
}

