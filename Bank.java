
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Banking started....");
       
       BankAccount baObj1 = new BankAccount();
       BankAccount baObj2 = new BankAccount();
       
       baObj1.setBankAccount(101, "Vedangi", 75000);
       baObj2.setBankAccount(102, "Shital", 75300);
       
       baObj1.printBankAccount();
       baObj2.printBankAccount();
       
       System.out.println("Transfer initiated.....");
       float transAmt = 6000;
       baObj1.withdraw(transAmt);
       baObj2.deposit(transAmt);
       System.out.println("Transferred............");
       
      
       baObj1.printBankAccount();
       baObj2.printBankAccount();
	}
}
class BankAccount  // business entity - primary key
{
	int accountNumber; //PK
	String accountHolderName;
	double balance;  // FIELD /global data/ data member/
	
	void setBankAccount(int x, String y, double z)
	{
		System.out.println("setBankAccount(int,String,double.....)");
		accountNumber =x;
		accountHolderName =y;
		balance = z;
	}
	double calculateSimpleInterest(float rateOfInterest, int period) //3
	{
		double simpleInterest = (balance*rateOfInterest*period)/100.0f;
		return simpleInterest;
	}
	void withdraw(double amountToWithdraw)
	{
		System.out.println("Withdrawing....."+amountToWithdraw);
		balance = balance - amountToWithdraw;
	}
	void deposit(double amountToDeposit)
	{
		System.out.println("Depositing....."+amountToDeposit);
		balance = balance+amountToDeposit;
	}
	double getBalance()
	{
		return balance;
	}
	
	void printBankAccount()
	{
		System.out.println("ACNO      :"+accountNumber);
		System.out.println("ACNAME    :"+accountHolderName);
		System.out.println("ACBALANCE :"+balance);
		System.out.println("-----------------------------------------------");
	}
}

