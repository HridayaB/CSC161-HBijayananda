/**
 * 
 * @author Hridaya Bijayananda
 *
 */
public class SavingsAccount extends Account
{

	private double overdrawn;
	
	public SavingsAccount ( )
	{
		overdrawn = 0.0;
	}

	public SavingsAccount ( double overdrawn ) 
	{
		super();
		this.overdrawn = overdrawn;
	}

	public void overdraw ( )
	{
		double overdraw = getOverdrawn ( );
		if ( overdraw > 0 )
		{
			System.out.println ( "You cannot overdraw in a savings account." );
		}
	}
	
	public double getOverdrawn ( ) 
	{
		return overdrawn;
	}

	public void setOverdrawn ( double overdrawn ) 
	{
		this.overdrawn = overdrawn;
	}

	@Override
	public String toString() {
		return "SavingsAccount [overdrawn=" + overdrawn + "\n" + "getOverdrawn()=" + getOverdrawn()
				+ "\n" + "getMonthlyInterestRate()=" + getMonthlyInterestRate() + "\n" + "getMonthlyInterest()="
				+ getMonthlyInterest() + "\n" + "getAccountId()=" + getAccountId() + "\n" + "getAccountBalance()="
				+ getAccountBalance() + "\n" + "getAnnualInterestRate()=" + getAnnualInterestRate() + "\n" + "getDateCreated()="
				+ getDateCreated() + "\n" + "toString()=" + super.toString() + "\n" + "getClass()=" + getClass() + "\n" + "hashCode()="
				+ hashCode() + "]";
	}
	
	
} // end of class SavingsAccount
