package com.CSC161J.Graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.CSC161J.Graph.Graph.Edge;

public class Graph < V >
{

	protected List < V > verticesList = new ArrayList < V > ( ); // List of vertices
	protected List < List < Edge > > neighbours = new ArrayList ( ); // List of lists
	protected int numV; // num of vertices
	
	public class Edge implements Comparable < Edge >
	{
		public int source;
		public int directory;
		public double weight;
		
		public Edge ( int source, int directory )
		{
			this.source = source;
			this.directory = directory;
		}
		
		public Edge ( int source, int directory, double weight )
		{
			this.source = source;
			this.directory = directory;
			this.weight = weight;
		}
		
		public boolean equals ( Object edge )
		{
			return source == ( ( Edge ) edge ).source && directory == ( ( Edge ) edge ).directory;
		}

		@Override
		public int compareTo ( Graph < V >.Edge other ) 
		{
			if ( this.weight < other.weight )
			{
				return -1;
			}
			else if ( this.weight > other.weight )
			{
				return 1;
			}
			return 0;
		}
		
	} // end of class Edge
	
	public Graph ( List < V > verticesList, int [ ] [ ] edges, int numV )
	{
		this.numV = numV;
		for ( V vertex : verticesList )
		{
			addVertex ( vertex );
		}
		createAdjacencyLists ( edges, verticesList.size ( ) );
	}
	
	public boolean addVertex ( V vertex )
	{
		if ( !verticesList.contains ( vertex ) )
		{
			verticesList.add ( vertex );
			neighbours.add ( new ArrayList < Edge > ( ) );
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean addEdge ( Edge edge )
	{
		if ( !neighbours.get ( edge.source ).contains ( edge ) )
		{
			neighbours.get ( edge.source ).add ( edge );
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private void createAdjacencyLists ( int [ ] [ ] edges, int numberOfVertices )
	{
		for ( int i = 0; i < edges.length; i++ )
		{
			addEdge ( new Edge ( edges [ i ] [ 0 ], edges [ i ] [ 1 ] ) );
		}
	}
	
	public void printEdges ( )
	{
		for ( int i = 0; i < neighbours.size ( ); i++ )
		{
			System.out.print ( "Vertex - " + i + ":" );
			for ( Edge edge : neighbours.get ( i ) )
			{
				System.out.print ( " " + "(" + edge.source + ", " + edge.directory + ")" + " " );
			}
			System.out.println ( );
		}
	}
	
	public List < V > dfs ( int [ ] [ ] edges, int V ) // pre-order, stack, array for visited or not, vertices and edges
	{
		boolean visited [ ] = new boolean [ numV ];
		
		for ( V v1 : verticesList )
		{
			visited [ V ] = false;
		} // end of enhanced for loop
		
		Stack < Integer > stack = new Stack < Integer > ( );
		//stack.push ( V );
		
		while ( !stack.isEmpty ( ) )
		{
			V = stack.pop ( );
			if ( visited [ V ] == false )
			{
				System.out.println ( "Dfs: " + V + " " );
				visited [ V ] = true;
				
				Iterator < Integer > itr = ( Iterator < Integer > ) verticesList.iterator ( );
				while ( itr.hasNext ( ) )
				{
					//int W = itr.next ( );
					if ( !visited [ V ] )
					{
						stack.push ( V );
					} // end of if statement
				} // end of while loop
			} // end of if statement
		} // end of while loop
		
		return verticesList;
	}
	
	public List < V > bfs ( int [ ] [ ] edges, int V ) // input for where to start, queue
	{
		boolean [ ] visited = new boolean [ numV ];
		
		for ( V v1 : verticesList )
		{
			visited [ V ] = false;
		} // end of enhanced for loop
		
		Queue < Integer >  queue = new LinkedList < Integer > ( );
		
//		visited [ V ] = true;
//		queue.add ( V );
	
		while ( !queue.isEmpty ( ) )
		{
			V = queue.poll ( );
			System.out.println ( "Bfs: " + V + " " );
			
			Iterator < Integer > itr = ( Iterator < Integer > ) verticesList.iterator ( );
			
			while ( itr.hasNext ( ) )
			{
				//int W = itr.next ( );
				if ( !visited [ V ] )
				{
					visited [ V ] = true;
					queue.add ( V );
				} // end of if statement
			} // end of while loop
		} // end of while loop
			
		return verticesList;
	}
	
} // end of Class Graph
