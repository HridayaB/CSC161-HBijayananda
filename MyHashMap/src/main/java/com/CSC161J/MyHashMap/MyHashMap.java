package com.CSC161J.MyHashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class MyHashMap < K, V > implements Map < K, V >
{

	private static int INITIAL_NUM_BUCKETS = 4;
	private int size = 0;
	private double loadFactorThreshold = 0.5;
	
	private LinkedList < Entry < K, V > > [ ] buckets;
	
	public static class Entry < K, V > implements Map.Entry < K, V >
	{
		K key;
		V value;
		
		public Entry ( K key, V value )
		{
			this.key = key;
			this.value = value;
		} // end of constructor
		
		public K getKey ( )
		{
			return key;
		} // end of getKey
		
		public V getValue ( )
		{
			return value;
		} // end of getValue

		@Override
		public V setValue ( V value ) 
		{
			// TODO Auto-generated method stub
			return null;
		}
	} // end of class Entry

	public MyHashMap ( )
	{
		buckets = new LinkedList [ INITIAL_NUM_BUCKETS ];
	}
	
	@Override
	public int size ( ) 
	{
		return size;
	}

	@Override
	public boolean isEmpty ( ) 
	{
		return size == 0;
	}

	@Override
	public boolean containsKey ( Object key ) 
	{
		if ( get ( key ) != null )
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean containsValue ( Object value ) 
	{
		for ( int i = 0; i < buckets.length; i++ )
		{
			if ( buckets [ i ] != null )
			{
				LinkedList < Entry < K, V > > bucket = buckets [ i ];
				for ( Entry < K, V > entry : bucket )
				{
					if ( entry.getValue ( ).equals ( value ) )
					{
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public V get ( Object key ) 
	{
		int bucketIndex = Math.abs ( key.hashCode ( ) ) % buckets.length;
		LinkedList < Entry < K, V > > bucket = buckets [ bucketIndex ];
		for ( Entry < K, V > entry : bucket )
		{
			if ( entry.getKey ( ).equals ( key ) )
			{
				return entry.getValue ( );
			}
		}
		return null;
	}

	@Override
	public V put ( K key, V value ) 
	{
		int bucketIndex = Math.abs ( key.hashCode ( ) ) % buckets.length;
		LinkedList < Entry < K, V > > bucket = buckets [ bucketIndex ];
		if ( bucket != null )
		{
			for ( Entry < K, V > entry : bucket )
			{
				if ( entry.getKey ( ).equals ( key ) )
				{
					V oldValue = entry.getValue ( );
					entry.value = value;
					return oldValue;
				}
			}
		}
		
		
		// Check for load factor has been exceeded and take action // double the buckets //brand new array with double the number of buckets // rehash
		double loadFactor = ( 1.0 * size ) / buckets.length;
		if ( loadFactor > loadFactorThreshold )
		{
			LinkedList < Entry < K, V > > [ ] oldBuckets = buckets;
			Set < Map.Entry < K, V > > old = entrySet ( );
			buckets =  new LinkedList [ 2 * buckets.length ];
			size = 0;
			rehash ( old );
		}
		// own method rehash to take two maps and move things around
		
		if ( buckets [ bucketIndex ] == null )
		{
			buckets [ bucketIndex ] = new LinkedList < Entry < K, V > > ( );
		}
		
		buckets [ bucketIndex ].add( new Entry < K, V > ( key, value ) );
		size++;
		
		return value;
	}

	@Override
	public V remove ( Object key ) 
	{
		int bucketIndex = Math.abs ( key.hashCode ( ) ) % buckets.length;
		LinkedList < Entry < K, V > > bucket = buckets [ bucketIndex ];
		if ( bucket != null )
		{
			for ( Entry < K, V > entry : bucket )
			{
				if ( entry.getKey ( ).equals ( key ) )
				{
					V oldValue = entry.getValue ( );
					size--;
					bucket.remove ( entry );
					return oldValue;
				}
			}
		}
		return null;
	}

	@Override
	public void putAll ( Map<? extends K, ? extends V> otherMap ) 
	{
		Set < ? extends Map.Entry < ? extends K, ? extends V > > entries = otherMap.entrySet ( );
		for ( Map.Entry < ? extends K, ? extends V > entry : entries )
		{
			put ( entry.getKey ( ), entry.getValue ( ) );
		}
		
	}

	@Override
	public void clear ( ) 
	{
		size = 0;
		for ( LinkedList < Entry < K, V > > bucket : buckets )
		{
			bucket.clear ( );
		}
		
	}

	@Override
	public Set < K > keySet ( ) 
	{
		Set < K > set = new HashSet < K > ( );
		for ( int i = 0; i < buckets.length; i++ )
		{
			if ( buckets [ i ] != null )
			{
				LinkedList < Entry < K, V > > bucket = buckets [ i ];
				for ( Entry < K, V > entry : bucket )
				{
					set.add ( entry.getKey ( ) );
				}
			}
		}
		return set;
	}

	@Override
	public Collection < V > values ( ) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set < Map.Entry < K, V > > entrySet ( ) 
	{
		Set < Map.Entry < K, V > > set = new HashSet < Map.Entry < K, V > > ( );
		for ( int i = 0; i < buckets.length; i++ )
		{
			if ( buckets [ i ] != null )
			{
				LinkedList < Entry < K, V > > bucket = buckets [ i ];
				for ( Entry < K, V > entry : bucket )
				{
					set.add ( entry );
				}
			}
		}
		return set;
	}
	
	/**
	 * @param
	 * @return void
	 * @description rehashing the buckets
	 */
	private void rehash ( Set < Map.Entry<K, V>> old)
	{  
		
		for ( Map.Entry < K, V > entry : old )
		{
			if ( entry != null )
			{
				K key = entry.getKey( );
				V value = entry.getValue ( );
				put ( key, value );
			} // end of while loop	
		} // end of for loop
		
	} // end of rehash
	
} // end of class MyHashMap