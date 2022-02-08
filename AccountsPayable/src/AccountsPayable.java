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
		Employee [ ] payableEmployees = new Employee [ 6 ];
		
		for ( int i = 0; i < payableEmployees.length; i++)
		{
			payableEmployees [ i ] = getEmployeeDetails ( payableEmployees );
		} // end of for loop
		
		Double basePay;
		printEmployeeDetails ( payableEmployees );
		for ( int i = 0; i < payableEmployees.length; i++)
		{
			Employee bPCEmployee = payableEmployees [ i ];
			if ( bPCEmployee instanceof BasePlusCommissionEmployee )
			{
				basePay = ( ( BasePlusCommissionEmployee ) bPCEmployee ).getBasePay( ) * 1.1;
				( (BasePlusCommissionEmployee ) bPCEmployee ).setBasePay( basePay );
			} // end of if statement
		} // end of for loop
		printEmployeeDetails2 ( payableEmployees );
		input.close ( );
	} // end of main
	
	// gets all the details from an employee	
	public static Employee getEmployeeDetails ( Employee [ ] payableEmployees )
	{
		Employee employee = null;
		String firstName;
		String lastName;
		Long ssNumber;
		int employeeType = 0;
		for ( int i = 0; i < payableEmployees.length; i++ )
		{
			System.out.println ( "What is your first name?");
			firstName = input.nextLine ( );
			System.out.println ( "What is your last name?" );
			lastName = input.nextLine ( );
			System.out.println ( "What is your social security number?" );
			ssNumber = input.nextLong ( );
			input.nextLine ( );
			System.out.println ( "What type of employee are you? Type 1 for salaried employee, type 2 for commission employee, type 3 for hourly employee." );
			employeeType = input.nextInt ( );
			if ( employeeType == 1)
			{
				System.out.println( "Enter your weekly salary." );
				double weeklySalary = input.nextDouble ( );
				input.nextLine ( );
				SalariedEmployee sEmployee = new SalariedEmployee ( firstName, lastName, ssNumber, weeklySalary );
				employee = sEmployee;
			} // end of if statement
			else if ( employeeType == 2)
			{
				System.out.println ( "Enter your gross sales." );
				double grossSales = input.nextDouble ( );
				input.nextLine ( );
				System.out.println ( "Enter your commission rate." );
				double commissionRate = input.nextDouble ( );
				input.nextLine ( );
				CommissionEmployee cEmployee = new CommissionEmployee ( firstName, lastName, ssNumber, grossSales, commissionRate );
				employee = cEmployee;
			} // end of else if statement
			else if ( employeeType == 3 )
			{
				System.out.println ( "Enter your hourly wage." );
				double hourlyWage = input.nextDouble ( );
				input.nextLine ( );
				System.out.println ( "Enter your amount of hours." );
				int hours = input.nextInt ( );
				input.nextLine ( );
				HourlyEmployee hEmployee = new HourlyEmployee ( firstName, lastName, ssNumber, hourlyWage, hours );
				employee = hEmployee;
			} // end of else if statement
		} // end of for loop
		return employee;
	} // end of getEmployeeDetails

	// prints out details of the employees based on their type by calling the toString method
	public static void printEmployeeDetails ( Employee [ ] payableEmployees )
	{
		for ( Employee employee: payableEmployees )
		{
			employee.toString ( );
		} // end of for loop
	} // end of printDetails
	
	// prints out details of the employees based on their type without calling the toString method
	public static void printEmployeeDetails2 ( Employee [ ] payableEmployees )
	{
		for ( int i = 0; i < payableEmployees.length; i++ )
		{
			Employee employee = payableEmployees [i];
			if ( employee instanceof SalariedEmployee  )
			{
				System.out.println ( employee.getFirstName ( ) + employee.getLastName ( ) + employee.getSocialSecurityNumber ( ) + employee.getPaymentAmount ( ) + ( ( SalariedEmployee ) employee ).getWeeklySalary ( ) );
			} // end of if statement
			else if ( employee instanceof CommissionEmployee )
			{
				System.out.println ( employee.getFirstName ( ) + employee.getLastName ( ) + employee.getSocialSecurityNumber ( ) + employee.getPaymentAmount ( ) + ( ( CommissionEmployee ) employee ).getGrossSales ( ) + ( ( CommissionEmployee ) employee ).getCommissionRate ( ) );
			} // end of else if statement
			else if ( employee instanceof HourlyEmployee )
			{
				System.out.println ( employee.getFirstName ( ) + employee.getLastName ( ) + employee.getSocialSecurityNumber ( ) + employee.getPaymentAmount ( ) + ( ( HourlyEmployee ) employee ).getHourlyWage ( ) + ( ( HourlyEmployee ) employee ).getHours ( ) );
			} // end of else if statement
		}
		
	} // end of printEmployeeDetails2
	
} // end of driver class AccountsPayable
