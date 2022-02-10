/**
 * 
 * @author Hridaya Bijayananda
 *
 */

import java.time.LocalDate;

public class Transaction extends Account
{
	private LocalDate dateTransacted = LocalDate.now ( );
	private String transactionType;
	private int transactionAmount;
	private double newBalance;
	
	public Transaction ( )
	{
		dateTransacted = getDateTransacted ( );
		transactionType = "W";
		transactionAmount = 9000;
		newBalance = 2228;
	}

	public Transaction ( LocalDate dateTransacted, String transactionType, int transactionAmount, double newBalance ) 
	{
		super();
		this.dateTransacted = dateTransacted;
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
		this.newBalance = newBalance;
	}

	public LocalDate getDateTransacted ( ) 
	{
		return dateTransacted;
	}

	public void setDateTransacted ( LocalDate dateTransacted ) 
	{
		this.dateTransacted = dateTransacted;
	}

	public String getTransactionType ( ) 
	{
		return transactionType;
	}

	public void setTransactionType ( String transactionType ) 
	{
		this.transactionType = transactionType;
	}

	public int getTransactionAmount ( ) 
	{
		return transactionAmount;
	}

	public void setTransactionAmount ( int transactionAmount ) 
	{
		this.transactionAmount = transactionAmount;
	}

	public double getNewBalance ( ) 
	{
		return newBalance;
	}

	public void setNewBalance ( double newBalance ) 
	{
		this.newBalance = newBalance;
	}

	@Override
	public String toString() {
		return "Transaction [dateTransacted=" + dateTransacted + ", transactionType=" + transactionType
				+ ", transactionAmount=" + transactionAmount + ", newBalance=" + newBalance + ", getDateTransacted()="
				+ getDateTransacted() + ", getTransactionType()=" + getTransactionType() + ", getTransactionAmount()="
				+ getTransactionAmount() + ", getNewBalance()=" + getNewBalance() + ", getMonthlyInterestRate()="
				+ getMonthlyInterestRate() + ", getMonthlyInterest()=" + getMonthlyInterest() + ", getAccountId()="
				+ getAccountId() + ", getAccountBalance()=" + getAccountBalance() + ", getAnnualInterestRate()="
				+ getAnnualInterestRate() + ", getDateCreated()=" + getDateCreated() + ", getCustomerName()="
				+ getCustomerName() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
} // end of class Transaction
