/*
 * Hridaya Bijayananda
 * Due: 02/07/22
 */

public class Staff extends Employee
{
	protected String principal;
	
	// default constructor
	public Staff ( )
	{
		principal = "ss";
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
	
	
} // end of class Staff