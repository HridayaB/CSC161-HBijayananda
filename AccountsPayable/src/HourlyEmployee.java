/*
 * Hridaya Bijayananda
 * Due: 01/31/22
 */

public class HourlyEmployee extends Employee
{

	private double hourlyWage; // Hourly employee's hourly wage
	private int hours; // Hourly employee's hours
	
	// default constructor	
	public HourlyEmployee ( )
	{
		hourlyWage = 0.00;
		hours = 45;
	} // end of default constructor
	
	// Auto-generated constructor
	public HourlyEmployee ( double hourlyWage, int hours ) 
	{
		super ( );
		this.hourlyWage = hourlyWage;
		this.hours = hours;
	} // end of Auto-generated constructor
	
	// default constructor
	public HourlyEmployee ( String firstName, String lastName, long socialSecurityNumber, double hourlyWage, int hours )
	{
		super ( firstName, lastName, socialSecurityNumber );
		this.hourlyWage = hourlyWage;
		this.hours = hours;
	} // end of default constructor

	// returns the amount the employee will be paid, may vary for different kinds of employees	
		@Override
		public double getPaymentAmount ( )
		{
			double payment = hourlyWage * hours;
			return payment;
		} // end of getPaymentAmount
	
	// Accessors and mutators	
	public double getHourlyWage ( ) 
	{
		return hourlyWage;
	}
	public void setHourlyWage ( double hourlyWage ) 
	{
		this.hourlyWage = hourlyWage;
	}
	public int getHours ( ) 
	{
		return hours;
	}
	public void setHours ( int hours ) 
	{
		this.hours = hours;
	}
	// end of accessors and mutators

	// toString that will now print Hourly employee's hourly wage and number of hours	
	@Override
	public String toString() {
		return "HourlyEmployee [getFirstName()=" + getFirstName() + "\n" + "getLastName()=" + getLastName()
				+ "\n" + "getSocialSecurityNumber()=" + getSocialSecurityNumber() + "\n" + "getPaymentAmount()=" + getPaymentAmount() + "\n" + "toString()=" + super.toString()
				+ "hourlyWage=" + hourlyWage + "\n" + "hours=" + hours + "]";
	} // end of toString
	
} // end of class HourlyEmployee
