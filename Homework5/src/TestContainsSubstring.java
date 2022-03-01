/**
 * 
 * @author Hridaya Bijayananda
 * @due 02/28/22
 * @description Prompting the user to enter two strings and checking if the first string is a substring of the first string.
 *
 */

import java.util.Scanner;

public class TestContainsSubstring 
{
	static Scanner input;
	public static void main ( String [ ] args ) 
	{
		input = new Scanner ( System.in );
		ContainsSubstring subString = new ContainsSubstring ( );
		System.out.println ( "Enter the first string." );
		String str1 = input.nextLine ( );
		System.out.println ( "Enter the second string." );
		String str2 = input.nextLine ( );
		boolean result = subString.checkString ( str1, str2 );
		if ( result == true )
		{
			System.out.println ( "str2 is a substring of str1." );
			int res = subStringIndex ( str1, str2 );
			System.out.println ( "str2 matched str1 at index " + res + "." );
		} // end of if statement
		else
		{
			System.out.println ( "str2 is not a substring of str1." );
		} // end of else statement

	} // end of main
	
	/**
	 * @param str1
	 * @param str2
	 * @description checking the index of the matched substring
	 * @return int the index of the matched substring
	 */
	public static int subStringIndex ( String str1, String str2 )
	{
		int i = 0;
		int m = str1.length ( );
	    int n = str2.length ( );
	 
	    for ( ; i < m - n; i++ ) 
	    {
	        int j = 0;
	        for ( ; j < n; j++ )
	        {
                if ( str2.charAt ( i + j ) != str1.charAt ( j ) )
                {
                    break;
	        	} // end of if statement
	        } // end of for loop
	        if ( j == n )
	        {
	        	return i;
	        } // end of if statement
	    } // end of for loop
	    return i;
	} // end of subStringIndex

} // end of driver class TestContainsSubstring
