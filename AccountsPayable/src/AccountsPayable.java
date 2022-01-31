/*
 * Hridaya Bijayananda
 * Due: 01/31/22
 */

import java.util.Scanner;

public class AccountsPayable 
{
	static Scanner input;
	public static void main(String[] args) 
	{
		input = new Scanner ( System.in );
		int [ ] payableEmployees = new int [ 6 ];
		Employee employee = new Employee ( );
		SalariedEmployee sEmployee = new SalariedEmployee ( );
		CommissionEmployee cEmployee = new CommissionEmployee ( );
		HourlyEmployee hEmployee = new HourlyEmployee ( );
		printEmployeeDetails (null, sEmployee, cEmployee, hEmployee );
		
	} // end of main
	
// gets all the details from an employee	
	public static void getEmployeeDetails ( int [ ] payableEmployees )
	{
		String firstName;
		String lastName;
		Long ssNumber;
		String employeeType;
		for ( int i = 0; i < payableEmployees.length; i++ )
		{
			System.out.println ( "What is you first name?" );
			firstName = input.nextLine ( );
			System.out.println ( "What is your last name?" );
			lastName = input.nextLine ( );
			System.out.println ( "What is your social security number?" );
			ssNumber = input.nextLong ( );
			System.out.println ( "What type of employee are you?" );
			employeeType = input.nextLine ( );
		} // end of for loop
	}

// prints out details of the employees based on their type by calling the toString method
	public static void printEmployeeDetails ( String employee, SalariedEmployee sEmployee, CommissionEmployee cEmployee, HourlyEmployee hEmployee )
	{
		employee = getEmployeeDetails ( );
		if ( employee == "salaried employee" )
		{
			System.out.println ( sEmployee.toString ( ) );
		} // end of if statement
		else if ( employee == "commission employee" )
		{
			System.out.println ( cEmployee.toString ( ) );
		} // end of else if statement
		else if ( employee == "hourly employee" )
		{
			System.out.println ( hEmployee.toString ( ) );
		} // end of else if statement
	} // end of printDetails
	
//
	public static void printEmployeeDetails2 ( )
} // end of driver class AccountsPayable
