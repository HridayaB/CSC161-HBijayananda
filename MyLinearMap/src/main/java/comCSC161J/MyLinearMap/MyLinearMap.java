package comCSC161J.MyLinearMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyLinearMap  < K, V > implements Map < K, V >
{

	private List < Entry > entries = new ArrayList < Entry > ( );
	
	
	public class Entry implements Map.Entry < K, V >
	{
		private K key;
		private V value;
		
		public Entry ( K key, V value )
		{
			this.key = key;
			this.value = value;
		}

		@Override
		public K getKey ( ) 
		{
			return key;
		}

		public K setKey ( K key ) 
		{
			this.key = key;
			return key;
		}

		@Override
		public V getValue ( ) 
		{
			return value;
		}

		@Override
		public V setValue ( V value ) 
		{
			
			this.value = value;
			return value;
		}
		
	} // end of class Entry


	@Override
	public int size ( ) 
	{
		return entries.size ( );
	}


	@Override
	public boolean isEmpty ( ) 
	{
		return entries.isEmpty ( );
	}

	private Entry findEntry ( Object target )
	{
		for ( Entry entry : entries )
		{
			if ( equals ( target, entry.getKey ( ) ) )
			{
				return entry;
			}
		}
		return null;
	}
	
	@Override
	public boolean containsKey ( Object key ) {
		return findEntry ( key ) != null;
	}


	private boolean equals ( Object target, Object obj )
	{
		if ( target == null )
		{
			return obj == null;
		}
		return target.equals ( obj );
	}
	@Override
	public boolean containsValue ( Object value ) 
	{
		for ( Map.Entry < K, V > entry : entries )
		{
			if ( equals ( value, entry.getValue ( ) ) )
			{
				return true;
			}
		}
		return false;
	}


	@Override
	public V get ( Object key ) 
	{
		Entry entry = findEntry ( key );
		if ( entry == null )
		{
			return null;
		}
		return entry.getValue ( );
	}


	@Override
	public V put ( K key, V value ) 
	{
		Entry entry = findEntry ( key );
		if ( entry == null )
		{
			entries.add ( ( new Entry ( key, value ) ) );
			return null;
		}
		else
		{
			V oldValue = entry.getValue ( );
			entry.setValue ( value );
			return oldValue;
		}
	}


	@Override
	public V remove ( Object key ) 
	{
		Entry entry = findEntry ( key );
		if ( entry  ==  null )
		{
			return null;
		}
		else 
		{
			V value = entry.getValue ( );
			entries.remove ( entry );
			return value;
		}
	}


	@Override
	public void putAll( Map<? extends K, ? extends V> m ) 
	{
		
		
	}


	@Override
	public void clear ( ) 
	{
		
		
	}


	@Override
	public Set < K > keySet ( ) 
	{
		
		return null;
	}


	@Override
	public Collection < V > values ( ) 
	{
		
		return null;
	}


	@Override
	public Set < java.util.Map.Entry < K, V > > entrySet ( ) 
	{
		
		return null;
	}
}
