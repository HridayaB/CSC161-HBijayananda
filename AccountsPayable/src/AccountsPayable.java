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
		Employee employee1 = new Employee ( );
		SalariedEmployee sEmployee = new SalariedEmployee ( );
		CommissionEmployee cEmployee = new CommissionEmployee ( );
		HourlyEmployee hEmployee = new HourlyEmployee ( );
		BasePlusCommissionEmployee bPCEmployee = new BasePlusCommissionEmployee ( );
		Double basePay;
		printEmployeeDetails ( sEmployee, cEmployee, hEmployee );
		
		for ( int i = 0; i < payableEmployees.length; i++)
		{
			System.out.println ( employee1.toString ( ) );
			if ( bPCEmployee != null )
			{
				basePay = bPCEmployee.getBasePay() * 1.1;
			}
			System.out.println ( employee1.toString ( ) );
		} // end of for loop
		
	} // end of main
	
// gets all the details from an employee	
	public static String getEmployeeDetails ( int [ ] payableEmployees )
	{
		String firstName;
		String lastName;
		Long ssNumber;
		String employeeType = null;
		for ( int i = 0; i < payableEmployees.length; i++ )
		{
			System.out.println ( "What is you first name?");
			firstName = input.nextLine ( );
			System.out.println ( "What is your last name?" );
			lastName = input.nextLine ( );
			System.out.println ( "What is your social security number?" );
			ssNumber = input.nextLong ( );
			System.out.println ( "What type of employee are you?" );
			employeeType = input.nextLine ( );
		} // end of for loop
		return employeeType;
	} // end of getEmployeeDetails

// prints out details of the employees based on their type by calling the toString method
	public static void printEmployeeDetails ( SalariedEmployee sEmployee, CommissionEmployee cEmployee, HourlyEmployee hEmployee )
	{
		String employee = getEmployeeDetails ( null );
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
	
// prints out details of the employees based on their type without calling the toString method
	public static void printEmployeeDetails2 ( String employee, SalariedEmployee sEmployee, CommissionEmployee cEmployee, HourlyEmployee hEmployee )
	{
		employee = getEmployeeDetails ( null );
		printEmployeeDetails ( sEmployee, cEmployee, hEmployee );
	} // end of printEmployeeDetails2
} // end of driver class AccountsPayable
