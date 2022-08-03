import java.util.Scanner;

public class GeterSeterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Department d = new Department();
         
         d.setId(10);
         System.out.println("Id of the Department      "+d.getId());
         d.setName("accounts");
         System.out.println("Name of the Department    "+d.getName());
         d.setLocation("Hinjewadi Pune");
         System.out.println("Location is               "+d.getLocation());
         d.setNoOfEmployee(9);
         System.out.println("Number of Employee        "+d.getNoOfEmployee());
         
         Scanner in = new Scanner(System.in);
         System.out.println("Please Enter Your Name");
         String name1 = in.nextLine();
         
         Scanner in1 = new Scanner (System.in);
         System.out.println("Please Enter Your Id");
         int id1 = in.nextInt();
         
         System.out.println("Get the info "+d.);
	}
}

class Department{
	int id;
	String name;
	String location;
	int noOfEmployee;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfEmployee() {
		return noOfEmployee;
	}
	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}
	
}