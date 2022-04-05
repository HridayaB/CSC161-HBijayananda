import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
 * Hridaya Bijayananda
 * Due: 02/07/22
 */

public class TestSchoolRecords 
{

	public static void main(String[] args) throws FileNotFoundException  
	{
		Person person = new Person ( );
//		for ( int i = 0; i < 6; i++ )
//		{
//			Person person1 = new Person ( );
//		}
//		
//		for ( int i = 0; i < 2; i++ )
//		{
//			Student student = new Student ( );
//			Faculty faculty = new Faculty ( );
//			Staff staff = new Staff ( );
//		}
		
		Student student1 = new Student ( );
		student1.setName ( "John Smith" );
		student1.setAddress ( "1234 Mathews St." );
		student1.setPhoneNumber ( "8874567945" );
		student1.setEmailAddress ( "JSmith@gmail.com" );
		student1.setStatus ( "Freshman" );
		
		Student student2 = new Student ( );
		student2.setName ( "Pi Smith" );
		student2.setAddress ( "314 Math St." );
		student2.setPhoneNumber ( "1234567890" );
		student2.setEmailAddress ( "3.14@gmail.com" );
		student2.setStatus ( "Sophomore" );
		
		Faculty faculty1 = new Faculty ( );
		faculty1.setName ( "Jennie Timbers" );
		faculty1.setAddress ( "5344 Rocky grass Dr." );
		faculty1.setPhoneNumber ( "5467891230" );
		faculty1.setEmailAddress ( "berber@gmail.com" );
		faculty1.setOffice ( "Human Resources" );
		faculty1.setSalary ( 55000.00 );
		faculty1.setDateHired ( "02/11/2009" );
		faculty1.setRank ( "Senior" );
		faculty1.setOfficeHours ( "10:30 - 2:00" );
		
		Faculty faculty2 = new Faculty ( );
		faculty2.setName ( "Nathan Owens" );
		faculty2.setAddress ( "4684 Wet roads St." );
		faculty2.setPhoneNumber ( "9632587410" );
		faculty2.setEmailAddress ( "NO@gmail.com" );
		faculty2.setOffice ( "Counseling" );
		faculty2.setSalary ( 45000.00 );
		faculty2.setDateHired ( "10/19/2016" );
		faculty2.setRank ( "Junior" );
		faculty2.setOfficeHours ( "09:00 - 5:00" );
		
		Staff staff1 = new Staff ( );
		staff1.setName ( "Josh Hidges" );
		staff1.setAddress ( "7539 Burning house Dr." );
		staff1.setPhoneNumber ( "0147258569" );
		staff1.setEmailAddress ( "Josh_Hidges@gmail.com" );
		staff1.setOffice ( "Security" );
		staff1.setSalary ( 67000.00 );
		staff1.setDateHired ( "05/26/2011" );
		staff1.setTitle ( "Armed Security Officer" );
		
		Staff staff2 = new Staff ( );
		staff1.setName ( "Gwen Stacy" );
		staff1.setAddress ( "7539 Falling St." );
		staff1.setPhoneNumber ( "1593574862" );
		staff1.setEmailAddress ( "freefall@gmail.com" );
		staff1.setOffice ( "Administration" );
		staff1.setSalary ( 77000.00 );
		staff1.setDateHired ( "08/06/2015" );
		staff1.setTitle ( "Principal" );
		
		System.out.println ( student1.toString ( ) );
		System.out.println ( );
		System.out.println ( student2.toString ( ) );
		System.out.println ( );
		System.out.println ( faculty1.toString ( ) );
		System.out.println ( );
		System.out.println ( faculty2.toString ( ) );
		System.out.println ( );
		System.out.println ( staff1.toString ( ) );
		System.out.println ( );
		System.out.println ( staff2.toString ( ) );
		System.out.println ( );
		

		Database database = new Database ( );
		for ( Person psn : database.readDataBase ( person ) )
		{
			System.out.println ( student1.toString ( ) );
			System.out.println ( student2.toString ( ) );
			System.out.println ( faculty1.toString ( ) );
			System.out.println ( faculty2.toString ( ) );
			System.out.println ( staff1.toString ( ) );
			System.out.println ( staff2.toString ( ) );
		}
		
	} // end of main

} // end of driver class TestSchoolRecords
