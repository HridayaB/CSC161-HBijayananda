/*
 * Hridaya Bijayananda
 * Due: 01/31/22
 */

public class Employee 
{
	private String firstName; // Employee's first name
	private String lastName; // Employee's last name
	private long socialSecurityNumber; // Employee's Social Security Number
	
	
	// default constructor
	public Employee ( )
	{
		firstName = "Hridaya";
		lastName = "Bijayananda";
		socialSecurityNumber = 123456789;
	} // end of default constructor
	
	// Auto-generated constructor
	public Employee ( String firstName, String lastName, long socialSecurityNumber ) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	} // end of Auto-generated constructor 


	// returns the amount the employee will be paid, may vary for different kinds of employees
	public double getPaymentAmount ( )
	{
		double payment = 0.00;
		return payment;
	} // end of getPaymentAmount

	// Auto-generated getters and setters below
	public String getFirstName ( ) 
	{
		return firstName;
	}

	public void setFirstName ( String firstName ) 
	{
		this.firstName = firstName;
	}

	public String getLastName ( ) 
	{
		return lastName;
	}

	public void setLastName ( String lastName ) 
	{
		this.lastName = lastName;
	}

	public long getSocialSecurityNumber ( ) 
	{
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber ( long socialSecurityNumber ) 
	{
		this.socialSecurityNumber = socialSecurityNumber;
	}
	// end of Auto-generated getters and setters
	
	// Auto-generated toString
	@Override
	public String toString ( ) 
	{
		return "Employee [firstName=" + getFirstName ( ) + "\n" + "lastName=" + getLastName ( ) + "\n" + "socialSecurityNumber="
				+ getSocialSecurityNumber ( ) + "\n" + "getPaymentAmount()=" + "]";
	}
	// end of Auto-generated toString

} // end of class Employee
