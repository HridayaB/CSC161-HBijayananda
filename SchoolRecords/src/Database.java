/*
 * Hridaya Bijayananda
 * Due: 02/07/22
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Database 
{
	private Person person = new Person ( );
	static File FILE = new File ( "PersonDatabase.txt" ); // file name
	static java.io.File 

	private PrintWriter printWriter = new PrintWriter ( outFile );
	
	public Database ( )
	{
		try
		{
			FILE = new File ( "PersonDatabase.txt" );
			if ( !FILE.exists ( ) )
			{
				if ( FILE.createNewFile ( ) )
				{
					System.out.println ("New file: " + FILE.getName ( ) );
				}
			}
		}
		catch ( IOException e )
		{
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	
	public Database writePerson ( Person person )
	{
		person.getName ( );
		person.getAddress ( );
		person.getPhoneNumber ( );
		person.getEmailAddress ( );
		System.out.println ( ( ( List < Person > ) FILE ).add ( person ) );
		return null;
	}
	
	public ArrayList < Person > readDataBase ( Person person )
	{
		ArrayList < Person > listOfPerson = new ArrayList < > ( );
		for ( Person person1 : listOfPerson )
		{
			FILE.canRead ( );
		}
		return listOfPerson;
	}
	
	
} // end of class Database
