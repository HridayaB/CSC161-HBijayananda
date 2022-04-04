/*
 * Hridaya Bijayananda
 * Due: 02/07/22
 */

public class Employee extends Person 
{

	private String office; // the office the employee works at
	private double salary; // the salary of the employee
	private String dateHired; // the date the employee was hired
	
	// default constructor
	public Employee ( )
	{
		office = "";
		salary = 0.00;
		dateHired = "";
	} // end of default constructor

	// Auto-generated constructor
	public Employee( String office, double salary, String dateHired ) 
	{
		super();
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	} // end of auto-generated constructor

	// getters and setters
	public String getOffice ( ) 
	{
		return office;
	}

	public void setOffice ( String office ) 
	{
		this.office = office;
	}

	public double getSalary ( ) 
	{
		return salary;
	}

	public void setSalary ( double salary ) 
	{
		this.salary = salary;
	}

	public String getDateHired ( ) 
	{
		return dateHired;
	}

	public void setDateHired ( String dateHired ) 
	{
		this.dateHired = dateHired;
	}
	// end of getters and setters

	// toString method
	@Override
	public String toString ( ) 
	{
		return "Employee: " + "\n" + "Office = " + getOffice ( ) + "\n" + "Salary = " + getSalary ( ) + "\n" + "Date Hired = " + getDateHired ( ) + "\n" + "Name = " + getName ( )
				+ "\n" + "Address = " + getAddress ( ) + "\n" + "Phone number = " + getPhoneNumber ( ) + "\n" + "Email Address = " + getEmailAddress ( );
	} // end of toString method
	
} // end of class Employee
