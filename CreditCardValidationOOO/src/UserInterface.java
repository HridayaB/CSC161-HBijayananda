/*
 * Hridaya Bijayananda
 * Due: 01/24/22
 */
import java.util.Scanner;
public class UserInterface 
{
	static Scanner input;
	public static void main(String[] args) 
	{
		input = new Scanner (System.in);
		long cardNum = 0; // the credit card number
		System.out.println ( "Enter your credit card number." );
		cardNum = input.nextLong ( );
		CreditCardValidator card = new CreditCardValidator ( ) ; // object of the class CreditCardValidator
		
		if ( card.isValid ( cardNum ) )
		{
			System.out.println ( "This card is valid." );
		} // end of if statement
		else 
		{
			System.out.println ( "This card is invalid." );
		} // end of else

	} // end of main

} // end of class UserInterface
