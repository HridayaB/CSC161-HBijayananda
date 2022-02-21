import java.util.Arrays;

/*
 * Hridaya Bijayananda
 * Due: 02/07/22
 */

public class Student extends Person
{
	protected final String [ ] STATUS = { "Freshman", "Sophomore", "Junior", "Senior" };
	protected String status;
	
	// default constructor
	public Student ( )
	{
		status = " ";
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
		return "Student [STATUS=" + Arrays.toString(STATUS) + "\n" + "status=" + status + "\n" + "name=" + name + "\n" + "address="
				+ address + "\n" + "phoneNumber=" + phoneNumber + "\n" + "emailAddress=" + emailAddress + "]";
	} // end of toString method
	
	
} // end of class Student
