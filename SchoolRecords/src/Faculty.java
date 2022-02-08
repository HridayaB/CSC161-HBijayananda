/*
 * Hridaya Bijayananda
 * Due: 02/07/22
 */

public class Faculty extends Employee 
{

	protected String  [ ] RANK = { "Junior", "Senior" };
	protected String officeHours;
	protected String rank;
	
	// default constructor
	public Faculty ( )
	{
		officeHours = "10:30 - 11:00";
		rank = " ";
	}
	
	// Auto-generated constructor
	public Faculty ( String officeHours, String rank ) 
	{
		super();
		this.officeHours = officeHours;
		this.rank = rank;
	} // end of auto-generated constructor
	
	
} // end of class Faculty
