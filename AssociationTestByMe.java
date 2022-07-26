
public class AssociationTestByMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person8 per = new Person8("Narendra Modi",45, 'M');
		
		Area theArea = new Area();
		
		PartyTicket tkt = new  PartyTicket("BJP", "10m");
		
		Votes voters = new Votes("Varanasi", 100000, 70000);
		Politician8 primeMinister = theArea.conductElection(per, tkt, voters);
		
		System.out.println(primeMinister.personName+" is "+primeMinister.rulingOrNot);
		

	}

}
class Person8{
	String personName;
	int personAge;
	char gender;
	public Person8(String personName, int personAge, char gender) {
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.gender = gender;
	}
	
	void printPerson8() {
		System.out.println("+----Person INFO----");
		System.out.println("|Person Name  : "+personName);
		System.out.println("|Person Age   : "+personAge);
		System.out.println("|Gender       : "+gender);
		System.out.println("+-----------------------");
	}
	
}
class Politician8 extends Person8 //isA
{
	 EthicalCharacter moral; //hasA
	 String PoliticianTypes;
	 String rulingOrNot; //ruling or opposing
	 
	public Politician8(String personName, int personAge, char gender, EthicalCharacter moral, String politicianTypes) {
		super(personName, personAge, gender);
		this.moral = moral;
		PoliticianTypes = politicianTypes;
	}
	 
}
class PartyTicket{
      String party;
      String cost;
	
      public PartyTicket(String party, String cost) {
		super();
		this.party = party;
		this.cost = cost;
	}
}

class Votes{
	String constituency;
	int totalVoters;
	int votesWon;
	public Votes(String constituency, int totalVoters, int votesWon) {
		super();
		this.constituency = constituency;
		this.totalVoters = totalVoters;
		this.votesWon = votesWon;
	}
}
 
class EthicalCharacter{
	String honest;
	String fair;
	public EthicalCharacter(String honest, String fair) {
		super();
		this.honest = honest;
		this.fair = fair;
	}
	
}

class Area
{
	
	
	Politician8 conductElection(Person8 person, PartyTicket tkt, Votes votes ) {
	
		EthicalCharacter ethics = new EthicalCharacter("HONEST", "FAIR");
		
		Politician8 politician = new  Politician8(person.personName, person.personAge, 'M', ethics, "MLA");
			
		if(votes.votesWon > (0.5 * votes.totalVoters) ) // .. some condition
			politician.rulingOrNot="Ruling";
		else 
			politician.rulingOrNot="Opposing";
		return politician;
	}
}