/**
 * 
 * @author Hridaya Bijayananda
 * @due 02/21/22
 * @description This class reverses a string provided to it and stores the string with the 
 * chars in reverse order in a String data member.
 *
 */

public class StringReverser implements CharSequence
{

	private String reversedString; // the reversed String
	
	
	/**
	 * @param none
	 * @description Default constructor
	 * @return none
	 */
	public StringReverser ( )
	{
		reversedString = "Hello";
	} // end of default constructor
	
	/**
	 * @param reversedString - the reversed String
	 * @description Auto-generated constructor
	 * @return none 
	 */
	public StringReverser ( String reversedString ) 
	{
		super ( );
		this.reversedString = reversedString;
	} // end of auto-generated constructor

	/**
	 * @param int i - the index
	 * @description Returns the char value at the specified index.
	 * @return char
	 */
	@Override
	public char charAt ( int i )
	{
		char [ ] val = reversedString.toCharArray ( );
		if ( ( i < 0 ) || ( i >= val.length ) )
		{
			throw new StringIndexOutOfBoundsException ( i );
		}
		return val [ i ];
	} // end of charAt
	
	/**
	 * @param none
	 * @description Returns the length of this character sequence.
	 * @return int
	 */
	@Override
	public int length ( )
	{
		int length = 0;
		char [ ] strCharArray = reversedString.toCharArray ( );
		for ( char str : strCharArray )
		{
		   length++;
		} // end of enhanced for loop
		return length;
	} // end of length
	
	/**
	 * @param int start - the start of the word
	 * @param int end - the end of the word
	 * @description Returns a CharSequence that is a subsequence of this sequence.
	 * @return String
	 */
	@Override
	public String subSequence ( int start, int end )
	{
		int strStart = reversedString.length ( ) - end;
		int strEnd = reversedString.length ( ) - start;
		return reversedString;	
	} // end of subSequence
	
	/**
	 * @param none
	 * @description toString method
	 * @return String
	 */
	@Override
	public String toString ( ) 
	{
		return "reversedString = " + reversedString;
	} // end of toString

	
} // end of class StringReverser
