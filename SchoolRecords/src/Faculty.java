import java.util.Arrays;

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
		return "Faculty [RANK=" + Arrays.toString(RANK) + "\n" + "officeHours=" + officeHours + "\n" + "rank=" + rank
				+ "\n" + "getOffice()=" + getOffice() + "\n" + "getSalary()=" + getSalary() + "\n" + "getDateHired()=" + getDateHired()
				+ "\n" + "toString()=" + super.toString() + "\n" + "getName()=" + getName() + "\n" + "getAddress()=" + getAddress()
				+ "\n" + "getPhoneNumber()=" + getPhoneNumber() + "\n" + "getEmailAddress()=" + getEmailAddress()
				+ "\n" + "getClass()=" + getClass() + "\n" + "hashCode()=" + hashCode() + "]";
	} // end of toString method
	
} // end of class Faculty
