package LAB6;

public class CheckingAccount extends BankAccount{
	private final double FEE =0.15;
	
	public CheckingAccount (String name, double x)
	{
		super (name, x);
		this.setAccountNumber(getAccountNumber()+"-10");
	}
	
	@Override
	public boolean withdraw(double y)
	{
		boolean decision = super.withdraw(y+FEE);
		return decision;
		
	}

}
