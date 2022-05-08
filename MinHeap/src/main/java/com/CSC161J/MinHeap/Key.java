package com.CSC161J.MinHeap;

public interface Key  < E, T > extends Comparable < E >
{
	
	T getKey ( );
	
	int compareTo ( E e );
} // end of interface Key
