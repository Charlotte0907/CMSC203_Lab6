package LAB6;

public class SavingsAccount extends BankAccount 
{
	private final double rate = 0.025;
	private int savingsNumber =0;
	private int accountNumber;
	
	public SavingsAccount (String name, int balance)
	{
		super(name, balance);
		this.setAccountNumber(getAccountNumber()+ "-"+ savingsNumber);
		
	}
	public void postInterest()
	{
		//super(balance);
		double interrestpermonth = (rate/12)*getBalance() ;
		deposit(interrestpermonth);
		
		
	}
	
	@Override
	public String getAccountNumber()
	{
		String	result = super.getAccountNumber();
		return result;	
	}
	
	public SavingsAccount (SavingsAccount Number, int sbalance)
	{
		super (Number, sbalance);
		this.savingsNumber= Number.savingsNumber+1;
		
		this.setAccountNumber(getAccountNumber()+ savingsNumber);
		
		
	}
	
	

}
