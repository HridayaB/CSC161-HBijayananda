/*
 * Hridaya Bijayananda
 * Due: 01/31/22
 */

public class CommissionEmployee extends Employee
{

	private double grossSales; // Commission Employee's gross sales
	private double commissionRate; // Commission Employee's commission rate
	
	// default constructor
	public CommissionEmployee ( )
	{
		grossSales = 80982;
		commissionRate = 55.0;
	} // end of default constructor

	// Auto-generated constructor	
	public CommissionEmployee ( double grossSales, double commissionRate ) 
	{
		super ( );
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	} // end of Auto-generated constructor
	
	// default constructor
	public CommissionEmployee ( String firstName, String lastName, long socialSecurityNumber, double grossSales, double commissionRate )
	{
		super ( firstName, lastName, socialSecurityNumber );
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	} // end of default constructor
	
	// returns the amount the employee will be paid, may vary for different kinds of employees	
	@Override
	public double getPaymentAmount ( )
	{
		double payment = grossSales * commissionRate;
		return payment;
	} // end of getPaymentAmount
	
	// Accessors and mutators
	public double getGrossSales ( ) 
	{
		return grossSales;
	}

	public void setGrossSales ( long grossSales ) 
	{
		this.grossSales = grossSales;
	}

	public double getCommissionRate ( ) 
	{
		return commissionRate;
	}

	public void setCommissionRate ( double commissionRate ) 
	{
		this.commissionRate = commissionRate;
	}
	// end of accessors and mutators

	// toString method that now prints the Commission Empoyee's gross sales and commission rate
	@Override
	public String toString ( ) 
	{
		return "CommissionEmployee [getFirstName()=" + getFirstName() + "\n" + "getLastName()=" + getLastName()
				+ "\n" + "getSocialSecurityNumber()=" + getSocialSecurityNumber() + "\n" + "getPaymentAmount()=" + getPaymentAmount() + "\n" +" toString()=" + super.toString() + 
				"grossSales=" + grossSales + "\n" + "commissionRate=" + commissionRate + "]";
	} // end of toSring	
	
	
} // end of class CommissionEmployee
