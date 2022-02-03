
public abstract class ThrowException 
{

	public static void main(String[] args) 
	{
		try
		{
			int [] myNumbers = { 1, 2, 3 };
			setIndex10 ( myNumbers );
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println ( e.getMessage());
			e.printStackTrace();
			System.exit(-1);
		}
		catch (Exception e)
		{
			System.out.println (e.getMessage());
		}
	}
		public static void setIndex10 ( int [] array) throws Exception 
		{
//			if (array.length < 11)
//			{
//				throw new ArrayIndexOutOfBoundsException ( "There are less than 11 elemenrs in the array" );
//			}
			if ( array.length < 6)
			{
				throw new Exception ( "Just faking!" );
			}
			array[10] = 55;
		}
}
