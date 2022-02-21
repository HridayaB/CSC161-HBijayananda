/**
 * @author Hridaya Bijayananda
 * @due 02/21/22
 * @description driver class for CharSeqInterface
 */

public class TestCharSeqInterface 
{
	public static void main ( String [ ] args ) 
	{
		String og = "Hello";
		char [ ] charArray = og.toCharArray ( );
		String reversedString = "";
		for ( int i = charArray.length - 1; i >= 0; i-- )
		{
			reversedString = reversedString + charArray [i];
		} // end of for loop
		System.out.println ( "Original string: " + og );
		System.out.println ( "Reversed string: " + reversedString );
		reversedString.charAt(0);
		reversedString.length();
		reversedString.subSequence(0, 0);
		System.out.println ( reversedString.toString ( ) );
	} // end of main

} // end of driver class TestCharSeqInterface
