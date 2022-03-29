package com.CSC161J.MyHashMap;

public class MyHashMapTest
{

	public static void main(String[] args) 
	{
		MyHashMap hashMap = new MyHashMap < Integer, String > ( );
		hashMap.put( 1, "Hello" );
		hashMap.put ( 2, "Hi" );
		hashMap.put ( 3, "Hey" );
		hashMap.put ( 4, "Hola" );
		hashMap.put ( 5, "Hey" );
		hashMap.put ( 6, "Hey" );
		hashMap.put ( 7, "Hey" );
		
		System.out.println ( "Size: " + hashMap.size());
 
	}

}
