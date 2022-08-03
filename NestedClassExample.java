import java.time.LocalDate;

public class NestedClassExample {

	public static void main(String[] args) {
		
		PoliticalCandidate acc = new PoliticalCandidate(101,"Jack",50000);

		PoliticalCandidate.Statement bankStatement1 = new PoliticalCandidate.Statement();
		PoliticalCandidate.Statement bankStatement2 = new PoliticalCandidate.Statement();
		PoliticalCandidate.Statement bankStatement3 = new PoliticalCandidate.Statement();
		PoliticalCandidate.Statement bankStatement4 = new PoliticalCandidate.Statement();
		
acc.activateWithdrawl(true);
		
		double transAmt1=500;
		acc.withdraw(transAmt1);
		bankStatement1.setSerialId(1);
		bankStatement1.setTransactionAmount(transAmt1);
		bankStatement1.setTransactionDate(LocalDate.now());
		bankStatement1.setTransactionType("Debit");
		bankStatement1.setRemaniningBalance(acc.getBalance() - transAmt1);
		
		
		double transAmt2=500;
		acc.withdraw(transAmt2);
		bankStatement2.setSerialId(1);
		bankStatement2.setTransactionAmount(transAmt2);
		bankStatement2.setTransactionDate(LocalDate.now());
		bankStatement2.setTransactionType("Debit");
		bankStatement2.setRemaniningBalance(acc.getBalance() - transAmt2);
		
			
		double transAmt3=700;
		acc.withdraw(transAmt3);
		bankStatement3.setSerialId(3);
		bankStatement3.setTransactionAmount(transAmt3);
		bankStatement3.setTransactionDate(LocalDate.now());
		bankStatement3.setTransactionType("Debit");
		bankStatement3.setRemaniningBalance(acc.getBalance() - transAmt3);
		
		double transAmt4=800;
		acc.withdraw(transAmt4);
		bankStatement4.setSerialId(4);
		bankStatement4.setTransactionAmount(transAmt4);
		bankStatement4.setTransactionDate(LocalDate.now());
		bankStatement4.setTransactionType("Debit");
		bankStatement4.setRemaniningBalance(acc.getBalance() - transAmt4);
		
		
		System.out.println(bankStatement1);
		System.out.println(bankStatement2);
		System.out.println(bankStatement3);
		System.out.println(bankStatement4);
		
		acc.deActivateWithdrawl(false);
		
		acc.withdraw(6000);
	}

}
class PoliticalCandidate
{
	private int ticketno;
	private String pollname;
	private double tickammount;
	private ExpensePermission exPer = new ExpensePermission(false,true,true);
	
	public double getBalance() {
		return tickammount;
	}
	public void setBalance(double balance) {
		this.tickammount = balance;
	}

	void activateWithdrawl(boolean activate)
	{
		System.out.println("Activating the withdrawal....");
		exPer.setWithdraw(activate);
	}
	
	void deActivateWithdrawl(boolean deActivate)
	{
		System.out.println("de-Activating the withdrawal....");
		exPer.setWithdraw(deActivate);
	}
	
	public PoliticalCandidate(int ticketno, String pollname, double tickammount) {
		super();
		this.ticketno = ticketno;
		this.pollname = pollname;
		this.tickammount = tickammount;
	}
	
	void withdraw(double amt) {
		if(exPer.isWithdraw()==false) {
			throw new RuntimeException("Withdraw is not yet allowed...");
		}
		else {
			
			tickammount = tickammount - amt;
			System.out.println("Withdraw is done...");
		}
	}
	

	public static class Statement // can be referred via BankAccount.Statement
	{
		int serialId;
		LocalDate transactionDate;
		String transactionType;
		double transactionAmount;
		double remaniningBalance;
		public int getSerialId() {
			return serialId;
		}
		public void setSerialId(int serialId) {
			this.serialId = serialId;
		}
		public LocalDate getTransactionDate() {
			return transactionDate;
		}
		public void setTransactionDate(LocalDate transactionDate) {
			this.transactionDate = transactionDate;
		}
		public String getTransactionType() {
			return transactionType;
		}
		public void setTransactionType(String transactionType) {
			this.transactionType = transactionType;
		}
		public double getTransactionAmount() {
			return transactionAmount;
		}
		public void setTransactionAmount(double transactionAmount) {
			this.transactionAmount = transactionAmount;
		}
		public double getRemaniningBalance() {
			return remaniningBalance;
		}
		public void setRemaniningBalance(double remaniningBalance) {
			this.remaniningBalance = remaniningBalance;
		}
		@Override
		public String toString() {
			return "Statement [serialId=" + serialId + ", transactionDate=" + transactionDate + ", transactionType="
					+ transactionType + ", transactionAmount=" + transactionAmount + ", remaniningBalance="
					+ remaniningBalance + "]";
		}
		
		
	}
	
	
	private class ExpensePermission
	{
		boolean withdraw; 
		boolean deposit ;
		boolean transfer;
		
		
		public ExpensePermission(boolean withdraw, boolean deposit, boolean transfer) {
			super();
			this.withdraw = withdraw;
			this.deposit = deposit;
			this.transfer = transfer;
		}


		public boolean isWithdraw() {
			return withdraw;
		}


		public void setWithdraw(boolean withdraw) {
			this.withdraw = withdraw;
		}


		public boolean isDeposit() {
			return deposit;
		}


		public void setDeposit(boolean deposit) {
			this.deposit = deposit;
		}


		public boolean isTransfer() {
			return transfer;
		}


		public void setTransfer(boolean transfer) {
			this.transfer = transfer;
		} 
		
		
		
	}
}