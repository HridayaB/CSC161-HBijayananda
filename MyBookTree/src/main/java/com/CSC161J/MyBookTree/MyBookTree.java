package com.CSC161J.MyBookTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class MyBookTree implements Iterable
{
	private MyBookNode root;
	
	/**
	 * @param title
	 * @description default constructor
	 * @return none
	 */
	public MyBookTree ( String title ) 
	{
		root = new MyBookNode ( title, 0, 0, 0 );
	} // end of default constructor

	public MyBookNode getBook ( ) 
	{
		return root;
	}

	/**
	 * @param title
	 * @param chapterNum
	 * @param sectionNum
	 * @param subSectionNum
	 * @description adding the book node
	 * @return boolean
	 */
	public boolean addBookNode ( String title, int chapterNum, int sectionNum, int subSectionNum )
	{
		MyBookNode node = new MyBookNode ( title, chapterNum, sectionNum, subSectionNum );
		if ( sectionNum == 0 )
		{
			root.getChildNodes ( ).add ( node );
			Collections.sort( root.getChildNodes ( ) );
			return true;
		} // end of if statement
		
		if ( subSectionNum == 0 )
		{
			for ( MyBookNode aNode: root.childNodes )
			{
				if ( chapterNum == aNode.getChapterNum ( ) )
				{
					aNode.childNodes.add ( node );
					return true;
				} // end of if statement
			} // end of enhanced for loop
		} // end of if statement
		
		MyBookNode chapterNode = null;
		for ( MyBookNode chNode: root.getChildNodes ( ) )
		{
			if ( chapterNum == chNode.getChapterNum ( ) )
			{
				chapterNode = chNode;
				break;
			} // end of if statement
		} // end of enhanced for loop
		
		for ( MyBookNode sectionNode: chapterNode.getChildNodes ( ) )
		{
			if ( sectionNum == sectionNode.getSectionNum ( ) )
			{
				sectionNode.childNodes.add ( node );
				return true;
			} // end of if statement
		} // end of enhanced for loop
		return true;
	} // end of addBookNode method
	
	@Override
	public Iterator iterator ( )
	{
		return new BookNodeIterator ( root );
	} // end of Iterartor
	
	private class BookNodeIterator implements Iterator < MyBookNode > 
	{
		Deque < MyBookNode > stack;
		
		public BookNodeIterator ( MyBookNode node )
		{
			stack = new ArrayDeque < MyBookNode > ( );
			stack.push ( root );
		}
		
		@Override
		public boolean hasNext ( )
		{
			return !stack.isEmpty ( );
		}
		
		@Override 
		public MyBookNode next ( )
		{
			MyBookNode node = stack.pop ( );
			List < MyBookNode > nodes = new ArrayList < MyBookNode > ( node.getChildNodes ( ) );
			Collections.reverse ( nodes );
			for ( MyBookNode child: nodes )
			{
				stack.push ( child );
			}
			return node;
		}
	} // end of class BookNodeIterator
	

} // end of class MyBookTree
