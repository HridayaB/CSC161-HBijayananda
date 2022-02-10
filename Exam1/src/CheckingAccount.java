/**
 * 
 * @author Hridaya Bijayananda
 *
 */

public class CheckingAccount extends Account
{

	private double overdraftLimit; //the limit of the overdraft
	
	// default constructor
	public CheckingAccount ( )
	{
		overdraftLimit = 300.0;
	} // end of default constructor

	// Auto-generated constructor
	public CheckingAccount ( double overdraftLimit ) 
	{
		super();
		this.overdraftLimit = overdraftLimit;
	} // end of auto-generated constructor

	@Override
	public double withdraw ( double amountWithdrawn )
	{
		double withdrawAmount = accountBalance - amountWithdrawn; // the amount that is withdrawn
		if ( withdrawAmount > overdraftLimit )
		{
			System.out.println ( "You have exceeded your overdraft limit." );
		}
		
		return withdrawAmount;
	} // end of withdraw
	
	// Accessors and mutators
	public double getOverdraftLimit ( ) 
	{
		return overdraftLimit;
	}

	public void setOverdraftLimit ( double overdraftLimit ) 
	{
		this.overdraftLimit = overdraftLimit;
	}
	// end of accessors and mutators

	
	
	// toString method
	@Override
	public String toString ( ) 
	{
		return "CheckingAccount [overdraftLimit=" + overdraftLimit + "\n" + "getOverdraftLimit()=" + getOverdraftLimit()
				+ "\n" + "getMonthlyInterestRate()=" + getMonthlyInterestRate() + "\n" + "getMonthlyInterest()="
				+ getMonthlyInterest() + "\n" + "getAccountId()=" + getAccountId() + "\n" + "getAccountBalance()="
				+ getAccountBalance() + "\n" + "getAnnualInterestRate()=" + getAnnualInterestRate() + "\n" + "getDateCreated()="
				+ getDateCreated() + "\n" + "toString()=" + super.toString() + "\n" + "getClass()=" + getClass() + "\n" + "hashCode()="
				+ hashCode() + "]";
	} // end of toString method
	
} // end of class CheckingAccount
