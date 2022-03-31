/*
 * Hridaya Bijayananda
 * Due: 02/07/22
 */

public class TestSchoolRecords 
{

	public static void main(String[] args) 
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
		person.getName ( );
		person.getAddress ( );
		person.getPhoneNumber ( );
		person.getEmailAddress ( );
		Student student1 = new Student ( );
		
		Student student2 = new Student ( );
		Faculty faculty1 = new Faculty ( );
		Faculty faculty2 = new Faculty ( );
		Staff staff1 = new Staff ( );
		Staff staff2 = new Staff ( );
		
		Database database = new Database ( );
		for ( Person person1 : database.readDataBase ( person ) )
		{
			student1.toString ( );
			student2.toString ( );
			faculty1.toString ( );
			faculty2.toString ( );
			staff1.toString ( );
			staff2.toString ( );
		}
		
		

	} // end of main

} // end of driver class TestSchoolRecords
