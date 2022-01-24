/*
 * Hridaya Bijayananda
 * Due: 01/24/22
 */
import java.util.Scanner;

public class CreditCardValidationProc 
{
	static Scanner input;
	public static void main(String[] args) 
	{
		input = new Scanner (System.in);
		long cardNum = 0; // the credit card number
		System.out.println ( "Enter your credit card number." );
		cardNum = input.nextLong ( );
//		if ( cardNum <= 12 || cardNum >= 17 )
//		{
//			System.out.println ( "Your number is either too short or too long. "
//					+ "Your number has to be between 13 and 16 digits. Please enter your number again." );
//			cardNum = input.nextLong ( );
//		} // end of if statement

		if ( isValid ( cardNum ) )
		{
			System.out.println ( "This card is valid." );
		} // end of if statement
		else 
		{
			System.out.println ( "This card is invalid." );
		} // end of else
	} // end of main
	
	public static boolean isValid ( long cardNum )
	{
		int [ ] digitArray = getDigitArray ( cardNum ); // the digit array for the credit card number
		int sum = sumOfDoubleEvenPlace ( digitArray ) + sumOfOddPlace ( digitArray ); // the sum of the odd and even numbers from the credit card
		System.out.println ( "Sum of double: " + sumOfDoubleEvenPlace ( digitArray ) + " " + "Sum of odd: " + sumOfOddPlace ( digitArray ) );
		System.out.println ( "Sum of double and odd: " + sum);
		return (sum % 10 == 0);
	} // end of isValid
	
	public static int sumOfDoubleEvenPlace ( int [ ] digitArray )
	{
		int sum = 0;
		for ( int i = 1; i < digitArray.length; i += 2 )
		{
			sum += getDigit ( digitArray [ i ]  * 2 );
		}
		return sum;
	} // end of sumOfDoubleEvenPlace
	
	public static int sumOfOddPlace ( int [ ] digitArray )
	{
		int sum = 0;
		for ( int i = 0; i < digitArray.length; i += 2 )
		{
			sum += getDigit ( digitArray [ i ]  * 1 );
		} // end of for loop
		return sum;
	} // end of sumOfOddPlace
	
	public static int getDigit ( int cardNum)
	{
		int digit = cardNum; // the individual digit from the card number
		String chars = Integer.valueOf ( cardNum ).toString ( );
		if ( chars.length ( ) > 1 )
		{
			digit = Character.getNumericValue ( chars.charAt ( 0 ) ) + Character.getNumericValue ( chars.charAt ( 1 ) );
		} // end of if statement
		return digit;
	} // end of getDigit
	
	public static int [ ] getDigitArray ( long cardNum )
	{
		char[ ] charArray = Long.toUnsignedString ( cardNum ).toCharArray ( ); // converting long to string to char
		//System.out.println ( Arrays.toString( charArray ) );
		int [ ] digitArray = new int [ charArray.length ];
		for ( int i = 0; i < charArray.length; i++ )
		{
			digitArray [ charArray.length - i - 1 ] = Character.getNumericValue ( charArray [ i ] );
		} // end of for loop
		return digitArray;
	} // end of getDigitArray
	
//	public static boolean prefixMatched ( long cardNum, int d )
//	{
//		
//	} // end of prefixMatched
//	
//	public static int getSize ( int d )
//	{
//		
//	} // end of getSize
//	
//	public static long getPrefix ( long cardNum, int k )
//	{
//		
//	} // end of getPrefix

} // end of class CreditCardValidationProc
