import java.sql.*;
 
public class JavaConnection {
    public static void main(String arg[])
    {
        Connection connection = null;
        try {
            // below two lines are used for connectivity.
           // Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql:///mysql",
                "root", "motherindia87");
 
            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database
 
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                "select * from dept");
            int deptno;
            String dname;
            while (resultSet.next()) {
            	deptno = resultSet.getInt("deptno");
            	dname = resultSet.getString("dname").trim();
                System.out.println("Code : " + deptno
                                   + " dname : " + dname);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    } // function ends
} // class ends