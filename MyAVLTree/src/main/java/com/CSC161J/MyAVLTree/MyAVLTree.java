package com.CSC161J.MyAVLTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;


public class MyAVLTree < K, V > implements Map < K, V >, Iterable < com.CSC161J.MyAVLTree.MyAVLTree.Node >
{
	private int size = 0;
	private Node root = null;
	
	private ArrayList < Node > path = new ArrayList < Node > ( );
	
	protected class Node
	{
		public K key;
		public V value;
		public Node left = null;
		public Node right = null;
		public int height;
		
		public Node ( K key, V value )
		{
			this.key = key;
			this.value = value;
		}
		
		public K getKey ( )
		{
			return key;
		}
		
		public V getValue ( )
		{
			return value;
		}
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue ( Object value ) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get ( Object key ) 
	{
		Comparable < ? super K > k = ( Comparable < ? super K > ) key;
		Node current = root;
		
		while ( current != null)
		{
			if ( k.compareTo ( current.key ) < 0 )
			{
				current = current.left;
				path.add ( current );
			}
			else if ( k.compareTo ( current.key ) < 0 )
			{
				current = current.right;
				path.add ( current );
			}
			else
			{
				return current.value;
			}
		}
		return null;
	}

	@Override
	public V put ( K key, V value ) 
	{	
		if ( root == null )
		{
			Node newNode = new Node ( key, value );
			root = newNode;
			size++;
			return value;
		}
		Node parent = null;
		Node current = root;
		
		Comparable < ? super K > k = ( Comparable < ? super K > ) key;
		
		while ( current != null )
		{
			if ( k.compareTo ( current.key ) < 0)
			{
				parent = current;
				current = current.left;
				
				//path.add ( parent );
			}
			else if ( k.compareTo ( current.key ) > 0 )
			{
				
				parent = current;
				current = current.right;
			
				//path.add ( parent );
			}
			else
			{
				return null;
			}
		}
		Node newNode = new Node ( key, value );
		if ( k.compareTo ( parent.key ) < 0 )
		{
			parent.left = newNode;
			int balanceFactor = balanceFactor ( newNode );
			path.add ( parent );
			
		
//			if ( balanceFactor <= 0 )
//			{
//				balanceLL ( newNode, parent ); // LL rotation, right rotation
//			}
//			else
//			{
//				balanceLR ( newNode, parent ); // LR rotation, right then left rotation
//			}
			//path = null;
			updateHeight ( newNode );
		}
		else
		{
			parent.right = newNode;
			int balanceFactor = balanceFactor ( parent );
			path.add ( parent );
//			if ( balanceFactor >= 0 )
//			{
//				balanceRR ( newNode, parent ); // RR rotation, left rotation
//			}
//			else
//			{
//				balanceRL ( newNode, parent ); // RL rotation, left then right rotation
//			}
			//path = null;
			updateHeight ( newNode );
		}
		size++;
		
		balancePath ( newNode );
		//path = null;
		return value;
	}

	private int balanceFactor ( Node current )
	{
		int balanceFactor = 0;
		if ( current.right == null )
		{
			balanceFactor = -current.height;
		}
		else if ( current.left == null)
		{
			balanceFactor = current.height;
		}
		else
		{
			balanceFactor = current.right.height - current.left.height;
		}
		return balanceFactor;
	}
	
	private void balancePath ( Node node )
	{
		for ( int i = path.size ( ) - 1; i >= 0; i-- )
		{
			Node current = path.get ( i );
			Node parent = path.get ( i ); // original : Node parent = path.get ( i - 1 );
			updateHeight ( current );
			switch ( balanceFactor ( current ) )
			{
				case -2:
					if ( balanceFactor ( current.left ) <= 0 )
					{
						balanceLL ( current, parent ); // LL rotation, right rotation
					}
					else
					{
						balanceLR ( current, parent ); // LR rotation, right then left rotation
					}
				case 2:
					if ( balanceFactor ( current.right ) >= 0 )
					{
						balanceRR ( current, parent ); // RR rotation, left rotation
					}
					else
					{
						balanceRL ( current, parent ); // RL rotation, left then right rotation
					}
			}
		}
	}
	
	private void balanceLL ( Node node, Node parent )
	{
		Node leftNode = node.left;
		if ( node == root )
		{
			root = leftNode;
		}
		else 
		{
			if ( parent.left == node )
			{
				parent.left = leftNode;	
			}
			else
			{
				parent.right = leftNode;
			}
		}
		node.left = leftNode.right;
		leftNode.right = node;
		updateHeight ( node );
		updateHeight ( leftNode );
	}
	
	private void balanceLR ( Node node, Node parent )
	{
		Node node1 = node.left;
		Node node2 = node1.right;
		
		if ( node == root )
		{
			root = node2;
		}
		else
		{
			if ( parent.left == node )
			{
				parent.left = node2;
			}
			else 
			{
				parent.right = node2;
			}
		}
		node.left = node2.right;
		node1.right = node2.left;
		node2.left = node1;
		node2.right = node;
		updateHeight ( node );
		updateHeight ( node1 );
		updateHeight ( node2 );
	}
	
	private void balanceRR ( Node node, Node parent )
	{
		Node rightNode = node.right;
		if ( node == root )
		{
			root = rightNode;
		}
		else 
		{
			if ( parent.right == node )
			{
				parent.right = rightNode;	
			}
			else
			{
				parent.left = rightNode;
			}
		}
		node.right = rightNode.left;
		rightNode.left = node;
		updateHeight ( node );
		updateHeight ( rightNode );
	}
	
	private void balanceRL ( Node node, Node parent )
	{
		Node node1 = node.right;
		Node node2 = node1.left;
		
		if ( node == root )
		{
			root = node2;
		}
		else
		{
			if ( parent.right == node )
			{
				parent.right = node2;
			}
			else 
			{
				parent.left = node2;
			}
		}
		node.right = node2.left;
		node1.left = node2.right;
		node2.right = node1;
		node2.left = node;
		updateHeight ( node );
		updateHeight ( node1 );
		updateHeight ( node2 );
	}
	
	private void updateHeight ( Node node )
	{
		if ( node.left == null && node.right == null )
		{
			node.height = 0;
		}
		else if ( node.left == null )
		{
			node.height = 1 + node.right.height;
		}
		else if ( node.right == null )
		{
			node.height = 1 + node.left.height;
		}
		else
		{
			node.height = 1 + Math.max ( node.left.height , node.right.height );
		}
	}
	
	@Override
	public V remove ( Object key ) 
	{
		root = remove2 ( root, key );
//		Node parent = null;
//		Node current = root;
//		
//		Comparable < ? super K > k = ( Comparable < ? super K > ) key;
//	
//		while ( key != null )
//		{
//			if ( k.compareTo ( current.key ) < 0 )
//			{
//				parent = current;
//				current = current.left;
//				current = null;
//				parent = current.left;
//			}
//			if ( k.compareTo ( current.key ) > 0 )
//			{
//				parent = current;
//				current = current.right;
//				current = null;
//				parent = current.right;
//			}
//			
//		}
//		size--;
		return null;
	}
	
	public Node remove2 ( Node root, Object key )
	{
//		Node parent = null;
		Node current = root;
		
		Comparable < ? super K > k = ( Comparable < ? super K > ) key;
		
		if ( root == null ) { return null; }
		
		if ( k.compareTo ( current.key ) < 0 )
		{
			root.left = remove2 ( root.left, key );
		}
		else if ( k.compareTo ( current.key ) > 0 )
		{
			root.right = remove2 ( root.right, key );
		}
		else
		{
			if ( root.left == null ) { return root.right; }
			else if ( root.right == null ) { return root.left; }
		}
		return root;
	}

	@Override
	public void putAll ( Map < ? extends K, ? extends V > m ) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear ( ) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set < K > keySet ( ) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection < V > values ( ) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set < Entry < K, V > > entrySet ( ) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator iterator ( ) 
	{
		return new InOrderIterator ( );
	}
	
	private class InOrderIterator implements Iterator < Node >
	{
		private ArrayList < Node > list = new ArrayList < Node > ( );
		private int currentIndex = 0;
		
		private void inOrder ( Node node )
		{
			if ( node == null )
			{
				return;
			}
			inOrder ( node.left );
			list.add ( node );
			inOrder ( node.right );
		}
		
		public InOrderIterator ( )
		{
			inOrder ( root );
		}
		
		
		@Override
		public boolean hasNext ( ) 
		{
			return ( currentIndex < list.size ( ) );
		}

		@Override
		public Node next ( ) 
		{
			return list.get ( currentIndex++ );
		}
		
	}
}
