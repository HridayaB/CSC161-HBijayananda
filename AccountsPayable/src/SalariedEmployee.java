/*
 * Hridaya Bijayananda
 * Due: 01/31/22
 */

public class SalariedEmployee extends Employee
{
 
	private double weeklySalary; // Salaried employee's weekly salary
 
// default constructor
	public SalariedEmployee ( )
	{
		weeklySalary = 2322;
	} // end of default constructor
	
// Auto-generated constructor
	public SalariedEmployee ( double weeklySalary ) 
	{
	super ( );
	this.weeklySalary = weeklySalary;
	} // end of Auto-generated constructor

// returns the amount the employee will be paid, may vary for different kinds of employees	
	@Override	
	public double getPaymentAmount ( )
	{
		double payment = weeklySalary;
		return payment;
	} // end of getPaymentAmount

// Accessors and mutators	
	public double getWeeklySalary ( ) 
	{
		return weeklySalary;
	}

	public void setWeeklySalary ( double weeklySalary ) 
	{
		this.weeklySalary = weeklySalary;
	}
// end of accessors and mutators
	
// toSring method that now prints the Salaries employee's weekly salary
	@Override
	public String toString ( ) 
	{
		return "SalariedEmployee [getFirstName()=" + getFirstName() + "\n" + "getLastName()=" + getLastName() + "\n" + "getSocialSecurityNumber()=" + getSocialSecurityNumber()
		+ " toString()=" + super.toString() + "\n" + "weeklySalary=" + "$" + weeklySalary + "\n" + "]";
	} // end of toString

} // end of class SalariedEmployee
