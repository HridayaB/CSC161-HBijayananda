/**
 * @author Hridaya Bijayananda
 * @due 02/21/22
 * @description driver class for CharSeqInterface
 */

public class TestCharSeqInterface 
{
	public static void main ( String [ ] args ) 
	{
		String og = "Hell0";
		char [ ] charArray = og.toCharArray ( );
		String reversedString = "";
		for ( int i = charArray.length - 1; i >= 0; i-- )
		{
			reversedString = reversedString + charArray [i];
		} // end of for loop
		System.out.println ( "Original string: " + og );
		System.out.println ( "Reversed string: " + reversedString );
		System.out.println ( "The char is " + reversedString.charAt ( 0 ) + " at index 0.");
		System.out.println ( "The char is " + reversedString.charAt ( 1 ) + " at index 1.");
		System.out.println ( "The char is " + reversedString.charAt ( 2 ) + " at index 2.");
		System.out.println ( "The char is " + reversedString.charAt ( 3 ) + " at index 3.");
		System.out.println ( "The char is " + reversedString.charAt ( 4 ) + " at index 4.");
		System.out.println ( "The length is " + reversedString.length ( ) );
		System.out.println ( "subsequence is " + reversedString.subSequence ( 0, 5 ) );
		System.out.println ( "toString is " + reversedString.toString ( ) );
	} // end of main

} // end of driver class TestCharSeqInterface
