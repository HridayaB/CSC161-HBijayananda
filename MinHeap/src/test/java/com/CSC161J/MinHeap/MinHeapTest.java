package com.CSC161J.MinHeap;

import java.util.Arrays;

public class MinHeapTest 
{

	public static void main ( String [ ] args ) 
	{
		
		int [ ] nodes = { 88, 85, 83, 72, 73, 42, 57, 6, 48, 60 };
		
		MinHeap < Entry, String > heap = new MinHeap < Entry, String > ( );
		
		for ( int node : nodes )
		{
			Entry entry = new Entry ( "", node );
			heap.add ( entry );
		}

		System.out.println ( "Heap Array: " + Arrays.toString ( heap.getHeap ( ).toArray ( ) ) );
		
		System.out.println ( "Priority Removal: " );
		
		while ( !heap.isEmpty ( ) )
		{
			System.out.print ( heap.remove ( ) + " " );
		}
	}

}
