/*
 * Hridaya Bijayananda
 * Due: 01/24/22
 */
public class CreditCardValidator 
{
	private long cardNum; // the credit card number
	
	public CreditCardValidator ( )
	{
		cardNum = 0;
	}
	
	public CreditCardValidator ( long cardNum ) 
	{
		super();
		this.cardNum = cardNum;
	} // end of constructor

	public boolean isValid ( long cardNum )
	{
		int [ ] digitArray = getDigitArray ( cardNum ); // the digit array for the credit card number
		int sum = sumOfDoubleEvenPlace ( digitArray ) + sumOfOddPlace ( digitArray ); // the sum of the odd and even numbers from the credit card
		System.out.println ( "Sum of double: " + sumOfDoubleEvenPlace ( digitArray ) + " " + "Sum of odd: " + sumOfOddPlace ( digitArray ) );
		System.out.println ( "Sum of double and odd: " + sum);
		return (sum % 10 == 0);
	} // end of isValid
	
	public int sumOfDoubleEvenPlace ( int [ ] digitArray )
	{
		int sum = 0;
		for ( int i = 1; i < digitArray.length; i += 2 )
		{
			sum += getDigit ( digitArray [ i ]  * 2 );
		}
		return sum;
	} // end of sumOfDoubleEvenPlace
	
	public int sumOfOddPlace ( int [ ] digitArray )
	{
		int sum = 0;
		for ( int i = 0; i < digitArray.length; i += 2 )
		{
			sum += getDigit ( digitArray [ i ]  * 1 );
		} // end of for loop
		return sum;
	} // end of sumOfOddPlace
	
	public int getDigit ( int cardNum)
	{
		int digit = cardNum; // the individual digit from the card number
		String chars = Integer.valueOf ( cardNum ).toString ( );
		if ( chars.length ( ) > 1 )
		{
			digit = Character.getNumericValue ( chars.charAt ( 0 ) ) + Character.getNumericValue ( chars.charAt ( 1 ) );
		} // end of if statement
		return digit;
	} // end of getDigit
	
	public int [ ] getDigitArray ( long cardNum )
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
} // end of class CreditCardValidator
