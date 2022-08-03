import java.time.LocalDate;

public class ExtendedInheritenceProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AadharCard aadharCard1 = new AadharCard();
		AadharCard aadharCard2 = new AadharCard();
		AadharCard aadharCard3 = new AadharCard();
		
		aadharCard1.setAdhaarCard("1234 1234 1234", "Janet Robert Dsouza","Govt Of India", "Mumbai", LocalDate.of(2002, 12, 25), "8876345678");
		aadharCard2.setAdhaarCard("5234 6234 9234", "Robert Peter Dmello","Govt Of India", "Pune", LocalDate.of(2003, 11, 20), "7776342618");
		aadharCard3.setAdhaarCard("6234 7234 3254", "Julie Smith Pareira","Govt Of India", "Nasik", LocalDate.of(2004, 10, 21), "66876345178");
		
		Person2 thePersonObj = new Person2('F',"Janet", 25, aadharCard1);
//		System.out.println("the person : "+thePersonObj);

		thePersonObj.printPerson2();
		System.out.println("-----------");
		
		
		Student1 theStudentObj = new Student1('M', "Robert", 24, aadharCard2, "Bits Pilani", "MBA", 'A');
		
		theStudentObj.printStudent1();
//		System.out.println("the student "+theStudentObj);
		
		System.out.println("-----------");
		
		Employee1 empObj = new Employee1('F', "Julie", 22, aadharCard3, "IIT", "Mtech", 'A', "Google", "Analyst", 25000);
		empObj.printEmployee1();
		
		//		System.out.println("emp obj "+empObj);
	}

}
class AadharCard
{
	String aadharNumber;
	String nameOnAdhaar;
	String issuedBy;
	String address;
	LocalDate birthdate;
	String phoneNumber;
	
	public void setAdhaarCard(String aadharNumber, String name, String issuedBy, String address, LocalDate birthdate, String phoneNumber) {
		
		this.aadharNumber = aadharNumber;
		this.nameOnAdhaar = name;
		this.issuedBy = issuedBy;
		this.address = address;
		this.birthdate = birthdate;
		this.phoneNumber = phoneNumber;
	}
	
	void printAdhaarCard() 
	{
		System.out.println("Aadhar Card : "+aadharNumber);
		System.out.println("Aadhar Name : "+nameOnAdhaar);
		System.out.println("Issued By   : "+issuedBy);
		System.out.println("Address     : "+address);
		System.out.println("Birthdate   : "+birthdate);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("-------");
	}
	
}

class Person2
{
	char gender; //hasA 1
	String name; //hasA 2
	int age;     //hasA 3
	AadharCard aadharCard; //hasA 4 ( 5 )
   //PanCard
//VotingCard
	//DL
	
	public Person2(char gender, String name, int age) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	

	public Person2(char gender, String name, int age, AadharCard aadharCard) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
		this.aadharCard = aadharCard;
	}


	void printPerson2() {
		System.out.println("GENDER : "+gender);
		System.out.println("AGE    : "+age);
		System.out.println("NAME   : "+name);
		if(aadharCard!=null) {
			aadharCard.printAdhaarCard();
		}
		else {
			System.out.println("No Aadhar Card Info");
		}
	}
	/*@Override
	public String toString() {
		return "Person [gender=" + gender + ", name=" + name + ", age=" + age + "]";
	}*/
	
}

class Student1 extends Person2 //isA
{
//	3 fields from the Person  + 
	String college; //hasA
	String qualification; //hasA
	char grade; //hasA
	
	public Student1(char gender, String name, int age, String college, String qualification, char grade) {
		super(gender, name, age);
		this.college = college;
		this.qualification = qualification;
		this.grade = grade;
	}
	
	

	public Student1(char gender, String name, int age, AadharCard aadharCard, String college, String qualification,
			char grade) {
		super(gender, name, age, aadharCard);
		this.college = college;
		this.qualification = qualification;
		this.grade = grade;
	}



	void printStudent1() {
		super.printPerson2();
		System.out.println("COLLEGE: "+college);
		System.out.println("QUAL   : "+qualification);
		System.out.println("GRADE  : "+grade);

	}
	/*@Override
	public String toString() {
		return "Student [toString()=" + super.toString() + ", college=" + college + ", qualification=" + qualification
				+ ", grade=" + grade + "]";
	}*/
}

class Employee1 extends Student1 //isA
{
	String company; //hasA
	String job; //hasA
	double salary; //hasA
	
	public Employee1(char gender, String name, int age, String college, String qualification, char grade, String company,
			String job, double salary) {
		super(gender, name, age, college, qualification, grade);
		this.company = company;
		this.job = job;
		this.salary = salary;
	}
	
	

	public Employee1(char gender, String name, int age, AadharCard aadharCard, String college, String qualification,
			char grade, String company, String job, double salary) {
		super(gender, name, age, aadharCard, college, qualification, grade);
		this.company = company;
		this.job = job;
		this.salary = salary;
	}



	void printEmployee1() {
		super.printStudent1();
		System.out.println("COMPANY: "+company);
		System.out.println("JOB    : "+job);
		System.out.println("SALARY : "+salary);
	}

	/*@Override
	public String toString() {
		return "Employee [toString()=" + super.toString() + ", company=" + company + ", job=" + job + ", salary="
				+ salary + "]";
	}*/
	
	
	
}

/*
 * 
 * 		super()
 * 
 * 
 * 		super.
 * 
 * 
 */
