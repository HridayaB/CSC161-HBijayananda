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
		reversedString = "";
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
	 * @return
	 */
	public char charAt ( int i )
	{
		return 0;
	} // end of charAt
	
	/**
	 * @param none
	 * @description Returns the length of this character sequence.
	 * @return reversedString.length ( )
	 */
	public int length ( )
	{
		return reversedString.length ( );
	} // end of length
	
	/**
	 * @param int start - the start of the word
	 * @param int end - the end of the word
	 * @description Returns a CharSequence that is a subsequence of this sequence.
	 * @return reversedString.subSequence(strStart, strEnd)
	 */
	public CharSequence subSequence ( int start, int end )
	{
		int strStart = reversedString.length ( ) - end;
		int strEnd = reversedString.length ( ) - start;
		return reversedString;	
	} // end of subSequence
	
	
	/**
	 * @param none
	 * @description Returns a string containing the characters in this sequence in the same order as this sequence.
	 * @return reversedString.toString ( )
	 */
	public String toString ( )
	{
		return reversedString.toString ( );
	}

} // end of class StringReverser
