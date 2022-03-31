/*
 * Hridaya Bijayananda
 * Due: 02/07/22
 */

public class Staff extends Employee
{
	private String principal;
	
	// default constructor
	public Staff ( )
	{
		principal = "Principle";
	} // end of default constructor

	// Auto-generated constructor
	public Staff ( String principal ) 
	{
		super();
		this.principal = principal;
	} // end of auto-generated constructor 

	// getters and setters
	public String getPrincipal ( ) 
	{
		return principal;
	}

	public void setPrincipal ( String principal ) 
	{
		this.principal = principal;
	}
	// end of getters and setters

	// toString method
	@Override
	public String toString ( ) 
	{
		return "Staff: " + "\n" + "Principal = " + getPrincipal ( ) + "\n" + "Office = " + getOffice ( ) + "\n" + "Salary = " + getSalary ( ) + "\n" + "Date Hired = "
				+ getDateHired ( ) + "\n" + "Name = " + getName ( ) + "\n" + "Address = " + getAddress ( ) + "\n" + "Phone number = " + getPhoneNumber ( )
				+ "\n" + "Email Address = " + getEmailAddress ( );
	} // end of toString method
	
	
} // end of class Staff