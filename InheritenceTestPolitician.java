
public class InheritenceTestPolitician {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People thePeopleObj = new People('F',"Janet", 25);
		thePeopleObj.printPeople();
		System.out.println("-----------");
		
		MemberOfParliament theMemberOfParliamentObj = new MemberOfParliament('M',"Gadkari", 54, "BJP", "NAGPUR", "LOTUS");
		theMemberOfParliamentObj.printMemberOfParliament();
		System.out.println("-----------");
		
		CabinetMinistry theCabinetMinistryObj = new CabinetMinistry('M', "thakur", 44, "BJP", "NAGPUR", "LOTUS", 1, "SPORTS");
		theCabinetMinistryObj.printCabinetMinistry();
		System.out.println("-----------");
	}

}

class People {
	char gender;
	String name;
	int age;

	public People(char gender, String name, int age) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
	}

	void printPeople() {
		System.out.println("GENDER : " + gender);
		System.out.println("AGE    : " + age);
		System.out.println("NAME   : " + name);
	}
}
	class MemberOfParliament extends People {
		String party;
		String constituency;
		String partysymbol;

		public MemberOfParliament(char gender, String name, int age, String party, String constituency,
				String partysymbol) {
			super(gender, name, age);
			this.party = party;
			this.constituency = constituency;
			this.partysymbol = partysymbol;
		}

		void printMemberOfParliament() {
			super.printPeople();
			System.out.println("PARTY         : " + party);
			System.out.println("CONSTITUENCY  : " + constituency);
			System.out.println("PARTYSYMBOL   : " + partysymbol);
		}
	}

	class CabinetMinistry extends MemberOfParliament {
		int noofposition;
		String ministryname;

		public CabinetMinistry(char gender, String name, int age, String party, String constituency, String partysymbol,
				int noofposition, String ministryname) {
			super(gender, name, age, party, constituency, partysymbol);
			this.noofposition = noofposition;
			this.ministryname = ministryname;
		}

		void printCabinetMinistry() {
			super.printMemberOfParliament();
			System.out.println("COLLEGE: " + noofposition);
			System.out.println("QUAL   : " + ministryname);

		}
	
}
