
public class NewTestFlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Flight{
	
	String passangerName;
	int ticketNo;
	String destinationStation;
	String boardingStation;
	
	
	Double cost;


	public Flight(String passangerName, int ticketNo) {
		super();
		this.passangerName = passangerName;
		this.ticketNo = ticketNo;
	}


	public Flight(String destinationStation, String boardingStation, Double cost) {
		super();
		this.destinationStation = destinationStation;
		this.boardingStation = boardingStation;
		this.cost = cost;
	}


	public Flight(String boardingStation, Double cost) {
		super();
		this.boardingStation = boardingStation;
		this.cost = cost;
	}


	public Flight(String passangerName, int ticketNo, String destinationStation, String boardingStation, Double cost) {
		super();
		this.passangerName = passangerName;
		this.ticketNo = ticketNo;
		this.destinationStation = destinationStation;
		this.boardingStation = boardingStation;
		this.cost = cost;
	}

	
}