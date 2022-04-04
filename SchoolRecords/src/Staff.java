/*
 * Hridaya Bijayananda
 * Due: 02/07/22
 */

public class Staff extends Employee
{
	private String title;
	
	// default constructor
	public Staff ( )
	{
		title = "";
	} // end of default constructor

	// Auto-generated constructor
	public Staff ( String title ) 
	{
		super();
		this.title = title;
	} // end of auto-generated constructor 

	// getters and setters
	public String getTitle ( ) 
	{
		return title;
	}

	public void setTitle ( String title ) 
	{
		this.title = title;
	}
	// end of getters and setters

	// toString method
	@Override
	public String toString ( ) 
	{
		return "Staff: " + "\n" + "Title = " + getTitle ( ) + "\n" + "Office = " + getOffice ( ) + "\n" + "Salary = " + getSalary ( ) + "\n" + "Date Hired = "
				+ getDateHired ( ) + "\n" + "Name = " + getName ( ) + "\n" + "Address = " + getAddress ( ) + "\n" + "Phone number = " + getPhoneNumber ( )
				+ "\n" + "Email Address = " + getEmailAddress ( );
	} // end of toString method
	
	
} // end of class Staff