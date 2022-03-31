import java.util.Arrays;

/*
 * Hridaya Bijayananda
 * Due: 02/07/22
 */

public class Student extends Person
{
	private final String [ ] STATUS = { "Freshman", "Sophomore", "Junior", "Senior" };
	private String status;
	
	// default constructor
	public Student ( )
	{
		status = "Freshman";
	} // end of default constructor

	// Auto-generated constructor
	public Student ( String status ) 
	{
		super();
		this.status = status;
	} // end of auto-generated constructor

	// Getters and setters
	public String getStatus ( ) 
	{
		return status;
	}

	public void setStatus ( String status ) 
	{
		this.status = status;
	}

	public String [ ] getSTATUS ( ) 
	{
		return STATUS;
	}
	// end of getters and setters
	
	// toString method
	@Override
	public String toString ( ) 
	{
		return "Student: " + "\n" + "STATUS = " + Arrays.toString(STATUS) + "\n" + "Status = " + getStatus ( ) + "\n" + "Name = " + getName ( ) + "\n" + "Address = "
				+ getAddress ( ) + "\n" + "Phone number = " + getPhoneNumber ( ) + "\n" + "Email Address = " + getEmailAddress ( );
	} // end of toString method
	
	
} // end of class Student
