/*
 * Hridaya Bijayananda
 * Due: 01/31/22
 */
public class BasePlusCommissionEmployee extends CommissionEmployee
{

	private double basePay;
	
// default constructor	
	public BasePlusCommissionEmployee ( )
	{
		basePay = 673.00;
	} // end of default constructor
	
// Auto-generated constructor	
	public BasePlusCommissionEmployee ( double basePay ) 
	{
		super ( );
		this.basePay = basePay;
	} // end of Auto-generated constructor

// returns the amount the employee will be paid, may vary for different kinds of employees	
		@Override
		public double getPaymentAmount ( )
		{
			double payment = basePay + getCommissionRate();
			return payment;
		} // end of getPaymentAmount


// Getters and setters
	public double getBasePay ( ) 
	{
		return basePay;
	}

	public void setBasePay ( double basePay ) 
	{
		this.basePay = basePay;
	}
// end of getters and setters

// toString methods that now prints the payment amount	
	@Override
	public String toString ( ) 
	{
		return "BasePlusCommissionEmployee [getFirstName()= " + getFirstName() + "\n" + "getLastName()= " +
				getLastName() + "\n" + "getSocialSecurityNumber()= " + getSocialSecurityNumber() + "\n" + "basePay=" + basePay + "\n" + "getPaymentAmount()=" + getPaymentAmount()
				+ "\n" + "getGrossSales()=" + getGrossSales() + "\n" + "getCommissionRate()=" + getCommissionRate()
				+ "\n" + "toString()=" + super.toString() + "]";
	}	
	
} // end of class BasePlusCommissionEmployee
