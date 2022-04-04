/*
 * Hridaya Bijayananda
 * Due: 02/07/22
 */

public class Person 
{
	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;
	
	// default constructor
	public Person ( )
	{
		name = "";
		address = "";
		phoneNumber = "";
		emailAddress = "";
	} // end of default constructor

	// Auto-generated constructor
	public Person ( String name, String address, String phoneNumber, String emailAddress ) 
	{
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	} // end of constructor

	// getters and setters
	public String getName ( ) 
	{
		return name;
	}

	public void setName ( String name ) 
	{
		this.name = name;
	}

	public String getAddress ( ) 
	{
		return address;
	}

	public void setAddress ( String address ) 
	{
		this.address = address;
	}

	public String getPhoneNumber ( ) 
	{
		return phoneNumber;
	}

	public void setPhoneNumber ( String phoneNumber ) 
	{
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress ( ) 
	{
		return emailAddress;
	}

	public void setEmailAddress ( String emailAddress ) 
	{
		this.emailAddress = emailAddress;
	}
	// end of getters and setters

	// toString method
	@Override
	public String toString ( ) 
	{
		return "Person [name=" + name + "\n" + "address=" + address + "\n" + "phoneNumber=" + phoneNumber + "\n" + "emailAddress="
				+ emailAddress + "\n" + "getClass()=" + getClass() + "\n" + "hashCode()=" + hashCode() + "\n" + "toString()="
				+ super.toString() + "]";
	}
	
} // end of class Person
