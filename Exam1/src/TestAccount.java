/**
 * 
 * @author Hridaya Bijaayananda
 *
 */

public class TestAccount 
{

	public static void main ( String [ ] args ) 
	{
		Account account1 = new Account ( );
		double withdraw = account1.withdraw ( 2500 );
		double deposit = account1.deposit( 3000 );
		double monthlyInterest = account1.getMonthlyInterest ( );
		System.out.println ( withdraw  + deposit );
		System.out.println ( monthlyInterest );
		System.out.println ( account1.getDateCreated ( ) );
		
		Account account2 = new Account ( );
		CheckingAccount cAccount = new CheckingAccount ( );
		SavingsAccount sAccount = new SavingsAccount ( );
		System.out.println ( account2.toString ( ) + cAccount.toString ( ) + sAccount.toString ( ) );
		
		Account account3 = new Account ( );
		
	} // end of main

} // end of driver class TestAccount
