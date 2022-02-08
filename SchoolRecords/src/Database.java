/*
 * Hridaya Bijayananda
 * Due: 02/07/22
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Database 
{
	final static Person person = null;
	static File FILE = new File ( "PersonDatabase.txt" ); // file name
	
	
	public Database ( )
	{
		try
		{
			FILE = new File ("PersonDatabase.txt");
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
		person = FILE.getName ( );
		return null;
		
	}
	
	public ArrayList < String > readDataBase ( Person person )
	{
		ArrayList < String > listOfPerson = new ArrayList < > ( );
		for ( int i = 0; i < 9; i++ )
		{
			
			FILE = listOfPerson;
		}
		return listOfPerson;
	}
	
	
} // end of class Database
