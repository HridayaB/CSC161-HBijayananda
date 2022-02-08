/*
 * Hridaya Bijayananda
 * Due: 02/07/22
 */

public class Employee extends Person 
{

	protected String office; // the office the employee works at
	protected double salary; // the salary of the employee
	protected String dateHired; // the date the employee was hired
	
	// default constructor
	public Employee ( )
	{
		office = "ss";
		salary = 11.11;
		dateHired = "02/02/22";
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
		return "Employee [office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + ", name=" + name
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + "]";
	} // end of toString method
	
} // end of class Employee
