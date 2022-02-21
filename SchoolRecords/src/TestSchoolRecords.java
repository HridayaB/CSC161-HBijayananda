/*
 * Hridaya Bijayananda
 * Due: 02/07/22
 */

public class TestSchoolRecords 
{

	public static void main(String[] args) 
	{
		Person person = new Person ( );
		for ( int i = 0; i < 6; i++ )
		{
			Person person1 = new Person ( );
		}
		
		for ( int i = 0; i < 2; i++ )
		{
			Student student = new Student ( );
			Faculty faculty = new Faculty ( );
			Staff staff = new Staff ( );
		}
		
		Database database = new Database ( );
		for ( String person1 : database.readDataBase ( person ) )
		{
			
		}
		
//		Person person1 = new Person ( );
//		Person person2 = new Person ( );
//		Person person3 = new Person ( );
//		Person person4 = new Person ( );
//		Person person5 = new Person ( );
//		Person person6 = new Person ( );
//		Student student1 = new Student ( );
//		Student student2 = new Student ( );
//		Faculty faculty1 = new Faculty ( );
//		Faculty faculty2 = new Faculty ( );
//		Staff staff1 = new Staff ( );
//		Staff staff2 = new Staff ( );

	} // end of main

} // end of driver class TestSchoolRecords
