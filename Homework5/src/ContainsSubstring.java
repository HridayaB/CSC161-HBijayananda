/**
 * 
 * @author Hridaya Bijayananda
 * @due 02/28/22
 * @description Prompting the user to enter two strings and checking if the first string is a substring of the first string.
 *
 */

public class ContainsSubstring 
{

	private String str1; // the first string
	private String str2; // the second string / the possible substring
	
	/**
	 * @param none
	 * @description default constructor
	 * @return none
	 */
	public ContainsSubstring ( )
	{
		str1 = "";
		str2 = "";
	} // end of default constructor

	/**
	 * @param str1
	 * @param str2
	 * @description auto-generated constructor
	 * @return none
	 */
	public ContainsSubstring ( String str1, String str2 ) 
	{
		super ( );
		this.str1 = str1;
		this.str2 = str2;
	} // end of auto-generated constructor

	/**
	 * @param str1
	 * @param str2
	 * @description checking if str2 is a Substring of str1
	 * @return boolean returns true if str2 is a substring of str1
	 */
	public boolean checkString ( String str1, String str2 )
	{
		boolean subString = str1.contains(str2);
		return subString;
	} // end of checkString
	
	// getters and setters below
	public String getStr1 ( ) 
	{
		return str1;
	}

	public void setStr1 ( String str1 ) 
	{
		this.str1 = str1;
	}

	public String getStr2 ( ) 
	{
		return str2;
	}

	public void setStr2 ( String str2 ) 
	{
		this.str2 = str2;
	}
	// end of getters and setters

	/**
	 * @param none
	 * @description toString method
	 * @return String
	 */
	@Override
	public String toString ( ) 
	{
		return "ContainsSubstring [str1=" + str1 + ", str2=" + str2 + ", getStr1()=" + getStr1() + ", getStr2()="
				+ getStr2() + "]";
	} // end of toString method
	
} // end of ContainsSubstring
