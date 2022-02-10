/**
 * 
 * @author Hridaya Bijayananda
 *
 */

import java.time.LocalDate;
import java.util.ArrayList;

public class Account 
{

	protected int accountId; // the account id
	protected double accountBalance; // the balance of the account
	protected double annualInterestRate; // current interest rate
	protected LocalDate dateCreated = LocalDate.now ( ); // the date when the account was created
	protected String customerName; // the customer's name
	protected ArrayList transactions;
	
	// default constructor
	public Account ( )
	{
		accountId = 1122;
		accountBalance = 20000.00;
		annualInterestRate = 4.5;
		dateCreated = getDateCreated ( );
		customerName = "John Smith";
	} // end of default constructor

	// Auto-generated constructor
	public Account ( int accountId, double accountBalance, double annualInterestRate, LocalDate dateCreated, String customerName ) 
	{
		super();
		this.accountId = accountId;
		this.accountBalance = accountBalance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;
		this.customerName = customerName;
	} // end of auto-generated constructor
	
	// default constructor
	public Account ( int accountId, double accountBalance, String customerName )
	{
		accountId = 0;
		accountBalance = 0.0;
		customerName = " ";
	}

	public double getMonthlyInterestRate ( )
	{
		double monthlyInterestRate = annualInterestRate / 12; // the monthly interest rate of the account
		
		return monthlyInterestRate;
	} // end of getMonthlyInterestRate
	
	public double getMonthlyInterest ( )
	{
		double monthlyInterest = accountBalance * getMonthlyInterestRate ( ); // the monthly interest of the account
		
		return monthlyInterest;
	} // end of getMonthlyInterest
	
	public double withdraw ( double amountWithdrawn )
	{
		double withdrawAmount = accountBalance - amountWithdrawn; // the amount that is withdrawn
		
		return withdrawAmount;
	} // end of withdraw
	
	public double deposit ( double amountDeposited )
	{
		double depositAmount = accountBalance - amountDeposited; // the amount that is deposited
		
		return depositAmount;
	} // end of deposit
	
	// Accessors and mutators
	public int getAccountId ( ) 
	{
		return accountId;
	}

	public void setAccountId ( int accountId ) 
	{
		this.accountId = accountId;
	}

	public double getAccountBalance ( ) 
	{
		return accountBalance;
	}

	public void setAccountBalance ( double accountBalance ) 
	{
		this.accountBalance = accountBalance;
	}

	public double getAnnualInterestRate ( ) 
	{
		return annualInterestRate;
	}

	public void setAnnualInterestRate ( double annualInterestRate ) 
	{
		this.annualInterestRate = annualInterestRate;
	}

	public LocalDate getDateCreated ( ) 
	{
		return dateCreated;
	}
	
	public String getCustomerName ( ) 
	{
		return customerName;
	}

	public void setCustomerName ( String customerName ) 
	{
		this.customerName = customerName;
	}
	// end of Accessors and mutators

	

	// toString method
	@Override
	public String toString ( ) 
	{
		return "Account [accountId=" + accountId + "\n" + "accountBalance=" + accountBalance + "\n" + "annualInterestRate="
				+ annualInterestRate + "\n" + "dateCreated=" + dateCreated + "\n" + "getMonthlyInterestRate()="
				+ getMonthlyInterestRate() + "\n" + "getMonthlyInterest()=" + getMonthlyInterest() + "\n" + "getAccountId()="
				+ getAccountId() + "\n" + "getAccountBalance()=" + getAccountBalance() + "\n" + "getAnnualInterestRate()="
				+ getAnnualInterestRate() + "\n" + "getDateCreated()=" + getDateCreated() + "]";
	} // end of toString

	
} // end of class Account
