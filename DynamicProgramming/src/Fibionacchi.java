
public class Fibionacchi 
{

	static long COUNT;
	static long [ ] fibArray =  new long [ 200 ];
	public static void main ( String [ ] args ) 
	{
//		System.out.println ( Fibionacchi.fibRecursive ( 45 ) );	
//		System.out.println ( COUNT );
		
//		System.out.println ( Fibionacchi.fibRecursiveDynamic ( 45 ) );	
//		System.out.println ( COUNT );
//		
		System.out.println ( Fibionacchi.fibDynamic ( 45 ) );	
		System.out.println ( COUNT );
	}
	
	public static long fibRecursive ( int n )
	{
		COUNT++;
		
		if ( n == 0 )
		{
			return 0;
		}
		if ( n == 1 ) 
		{
			return 1;
		}
		long ans = fibRecursive ( n - 1 ) + fibRecursive ( n - 2 );
		return ans;
	}
	
	public static long fibRecursiveDynamic ( int n )
	{
		COUNT++;
		
		if ( n == 0 )
		{
			return 0;
		}
		if ( n == 1 ) 
		{
			return 1;
		}
		if ( fibArray [ n ] > 0 )
		{
			return fibArray [ n ];
		}
		long ans = fibRecursiveDynamic ( n - 1 ) + fibRecursiveDynamic ( n - 2 );
		fibArray [ n ] = ans;
		return ans;
	}
	
	public static long fibDynamic ( int n )
	{
		COUNT++;
		
		if ( n == 0 )
		{
			return 0;
		}
		if ( n == 1 )
		{
			return 1;
		}
		fibArray [ 0 ] = 0;
		fibArray [ 1 ] = 1;
		for ( int i = 2; i <= n; i++ )
		{
			long ans = fibArray [ i - 1 ] + fibArray [ i - 2 ];
			fibArray [ i ] = ans;
		}
		return fibArray [ n ];
	}

}