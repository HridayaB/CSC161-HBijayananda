import java.util.Arrays;

/*
 * Hridaya Bijayananda
 * Due: 02/07/22
 */

public class Faculty extends Employee 
{

	private String  [ ] RANK = { "Junior", "Senior" };
	private String officeHours;
	private String rank;
	
	// default constructor
	public Faculty ( )
	{
		officeHours = "10:30 - 11:00";
		rank = "Junior";
	}
	
	// Auto-generated constructor
	public Faculty ( String officeHours, String rank ) 
	{
		super();
		this.officeHours = officeHours;
		this.rank = rank;
	} // end of auto-generated constructor

	// Getters and setters
	public String [ ] getRANK ( ) 
	{
		return RANK;
	}

	public void setRANK ( String[] rANK) 
	{
		RANK = rANK;
	}

	public String getOfficeHours ( ) 
	{
		return officeHours;
	}

	public void setOfficeHours ( String officeHours ) 
	{
		this.officeHours = officeHours;
	}

	public String getRank ( ) 
	{
		return rank;
	}

	public void setRank ( String rank ) 
	{
		this.rank = rank;
	}
	// end of getters and setters

	// toSting method
	@Override
	public String toString ( ) 
	{
		return "Faculty: " + "\n" + "RANK = " + Arrays.toString(RANK) + "\n" + "Office Hours = " + getOfficeHours ( ) + "\n" + "Rank = " + getRank ( )
				+ "\n" + "Office = " + getOffice ( ) + "\n" + "Salary = " + getSalary ( ) + "\n" + "Date Hired = " + getDateHired ( )
				+ "\n" + "Name = " + getName ( ) + "\n" + "Address = " + getAddress ( )
				+ "\n" + "Phone number = " + getPhoneNumber ( ) + "\n" + "Email Address = " + getEmailAddress ( )
				+ "\n" + "Class = " + getClass ( );
	} // end of toString method
	
} // end of class Faculty
