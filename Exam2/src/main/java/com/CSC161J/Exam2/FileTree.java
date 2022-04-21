package com.CSC161J.Exam2;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import org.w3c.dom.Node;



public class FileTree implements Iterable <FileNode> {

	private FileNode root;
	private int height;
	
	public FileTree(String path) {
		root = new FileNode(path);
		buildTree(root, height);
	}

	/**
	 * Return a depth first post-order traversal iterator 
	 */
	@Override
	public Iterator<FileNode> iterator() {

		return new DepthFirstIterator( root );
	}
	
	/**
	 * 	TODO for Exam 2
	 *  Use recursion to build the tree from the directory structure.
	 *  For each of node starting from the root node use listFiles() from File to get 
	 *  the list of files in that directory/folder.
	 *  Create a node for each of the files and add it to a list of child nodes for the node
	 *  Do this recursively for all the nodes.  
	 * 
	 * @param fileNode
	 * @return 
	 */
	private void buildTree ( FileNode fileNode, int height ) 
	{
		height = 0;
		List < FileNode > childNodesList = new ArrayList < FileNode > ( );
		
		String filePath = "C:\\Users\\HRBCR\\Downloads\\FileSizeTest";
		File file = new File ( filePath );
		FileNode node = new FileNode ( file );
		String fPath = file.getAbsolutePath ( );
		//System.out.println ( fPath );
	
		
	
		for ( FileNode node1 : root.getChildNodes ( ) )
		{
			File [ ] files = file.listFiles ( );
			//System.out.println ( node.toString ( ) );
		
			for ( File file1 : files )
			{
				node1.getChildNodes ( ).add ( node );
				childNodesList.add ( node );
				buildTree ( node, height - 1 );
			}
		
		}
//		for ( FileNode node1 : nodeList )
//		{
//			if ( node1.equals ( file ) )
//			{
//				rootNode.add ( node1 );
//			}
//			for ( FileNode node2 : rootNode )
//			{
//				File [ ] files = file.listFiles ( );
//				childNodes.add ( fileNode );
//				buildTree ( node2 );
//				System.out.println ( node.toString ( ) );
//				//childNodes.add ( buildTree ( node1 ) );
//			}
//			
//		}
		
	} // end of buildTree
	
	/**
	 * TODO for Exam 2
	 * Iterator that does a post order traversal of the tree.
	 * For post-order traversal use the 2 stack approach outlined here: 
	 * https://www.geeksforgeeks.org/iterative-postorder-traversal/
	 * 
	 * @return 
	 */
	private class DepthFirstIterator implements Iterator < FileNode > 
	{
		private FileNode root;
		private Stack < FileNode > nodes;
		private Stack < Boolean > expanded;
		
		public DepthFirstIterator( FileNode root ) 
		{
			this.root = root ;
			nodes = new Stack < FileNode > ( );
			expanded = new Stack < Boolean > ( );
			if ( root != null )
			{
				nodes.push ( root );
				expanded.push ( false );
			} // end of if statement
		} // end of DepthFirstIterator

		@Override
		public boolean hasNext ( ) 
		{
			if ( nodes.isEmpty ( ) )
			{
				return false;
			} // end of if statement
			while ( !expanded.peek ( ) )
			{
				expanded.pop ( );
				expanded.push ( true );
				FileNode node = nodes.peek ( );
				if ( node.right != null )
				{
					nodes.push ( ( FileNode ) node.right );
					expanded.push ( false );
				}
				if ( node.left != null )
				{
					nodes.push ( ( FileNode ) node.left );
					expanded.push ( false );
				}
			} // end of while loop
			return true;
		} // end of hasNext
		
		@Override
		public FileNode next ( ) 
		{
			if ( !hasNext ( ) )
			{
				throw new NoSuchElementException ( "End reached" );
			}
			expanded.pop ( );			
			return nodes.pop ( );
		} // end of next
		
	} // end of class DepthFirstIterator
	
	/**
	 *  Returns an iterator that does a breadth first traversal of the tree using a queue.
	 * 
	 * @return
	 */
	public Iterator<FileNode> breadthFirstIterator() {
		
		return new BreadthFirstIterator ( root, root );

	}	
	
	/** 
	 * TODO for Exam 2
	 * Iterator that does a breadth first traversal of the tree using a queue.
	 * 
	 */
	private class BreadthFirstIterator implements Iterator < FileNode > 
	{
		private Queue < FileNode > queue = new LinkedList < > ( );
		private Set < FileNode > visited = new HashSet < > ( );
		private FileNode root;

		BreadthFirstIterator ( FileNode root, FileNode vertex ) 
		{
			if ( root.equals(vertex) )
			{
				this.root = root;
				this.queue.add ( vertex );
				this.visited.add ( vertex );
			}
			else 
			{
				throw new IllegalArgumentException ( "Vertex does not exist" );
			}
			
		} // end of BreadthFirstiaterator
		
		@Override
		public boolean hasNext ( ) 
		{
			return !this.queue.isEmpty ( );
		} // end of hasNext

		@Override
		public FileNode next ( ) 
		{
			if ( !hasNext ( ) )
			{
				throw new NoSuchElementException ( );
			} // end of if statement
			FileNode next = queue.remove ( );
			for ( FileNode node : this.root.getChildNodes ( ) )
			{
				if ( !this.visited.contains ( node ) )
				{
					this.queue.add ( node );
					this.visited.add ( node );
				} // end of if statement
			} // end of for loop
			return next;
		} // end of next
		
	} // end of class BreadthFirstIterator
}
