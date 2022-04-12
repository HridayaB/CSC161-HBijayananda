/*
 * Hridaya Bijayananda
 * Due: 02/07/22
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database 
{
	private Person person = new Person ( );
	static File FILE = new File ( "PersonDatabase.txt" ); // file name
	private PrintWriter printWriter = new PrintWriter ( new FileOutputStream ( FILE.getName ( ), false ) );
	static Scanner input;
	
	public Database ( ) throws FileNotFoundException
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
		printWriter.println ( person.getClass ( ) );
		printWriter.println ( person.getName ( ) );
		printWriter.println ( person.getAddress ( ) );
		printWriter.println ( person.getPhoneNumber ( ) );
		printWriter.println ( person.getEmailAddress ( ) );
		printWriter.println ( );
		printWriter.flush ( );
		return null;
	}
	
	public ArrayList < Person > readDataBase ( Person person ) throws FileNotFoundException
	{
		ArrayList < Person > listOfPerson = new ArrayList < > ( );
		input = new Scanner ( FILE );
		String className = input.nextLine ( ).split( " " ) [ 1 ];
		if ( className.equals ( "class Student" ) )
		{
			Person person1 = new Student ( );
			person1.setName ( input.nextLine ( ) );
			person1.setAddress ( input.nextLine ( ) );
			person1.setPhoneNumber ( input.nextLine ( ) );
			person1.setEmailAddress ( input.nextLine ( ) );
			listOfPerson.add ( person1 );
		}
		if ( className.equals ( "class Faculty" ) )
		{
			Person person2 = new Faculty ( );
			person2.setName ( input.nextLine ( ) );
			person2.setAddress ( input.nextLine ( ) );
			person2.setPhoneNumber ( input.nextLine ( ) );
			person2.setEmailAddress ( input.nextLine ( ) );
			listOfPerson.add ( person2 );
		}
		if ( className.equals ( "class Staff" ) )
		{
			Person person3 = new Staff ( );
			person3.setName ( input.nextLine ( ) );
			person3.setAddress ( input.nextLine ( ) );
			person3.setPhoneNumber ( input.nextLine ( ) );
			person3.setEmailAddress ( input.nextLine ( ) );
			listOfPerson.add ( person3 );
		}
		return listOfPerson;
	}
	
	
} // end of class Database
