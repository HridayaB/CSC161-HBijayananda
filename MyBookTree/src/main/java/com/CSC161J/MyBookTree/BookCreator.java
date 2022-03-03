package com.CSC161J.MyBookTree;

public class BookCreator {

	public static void main ( String [ ] args ) 
	{
		MyBookTree myBook = new MyBookTree ( "Trees for Dummies" );
		
		myBook.addBookNode ( "Chapter 5", 5, 0, 0 );
		myBook.addBookNode ( "Chapter 4", 4, 0, 0 );
		myBook.addBookNode ( "Chapter 2", 2, 0, 0 );
		myBook.addBookNode ( "Chapter 1", 1, 0, 0 );
		myBook.addBookNode ( "Chapter 3", 3, 0, 0 );
		
		myBook.addBookNode ( "Section 5", 5, 4, 0 );
		myBook.addBookNode ( "Section 4", 4, 3, 0 );
		myBook.addBookNode ( "Section 2", 2, 2, 0 );
		myBook.addBookNode ( "Section 1", 1, 1, 0 );
		myBook.addBookNode ( "Section 3", 3, 5, 0 );
		
		myBook.addBookNode ( "Section 5", 5, 3, 0 );
		myBook.addBookNode ( "Section 4", 4, 2, 0 );
		myBook.addBookNode ( "Section 2", 2, 1, 0 );
		myBook.addBookNode ( "Section 1", 1, 4, 0 );
		myBook.addBookNode ( "Section 3", 3, 5, 0 );
		
		myBook.addBookNode ( "Chapter 5", 5, 3, 5 );
		myBook.addBookNode ( "Chapter 4", 4, 2, 4 );
		myBook.addBookNode ( "Chapter 2", 2, 1, 3 );
		myBook.addBookNode ( "Chapter 1", 1, 4, 2 );
		myBook.addBookNode ( "Chapter 3", 3, 5, 1 );

	}

}
