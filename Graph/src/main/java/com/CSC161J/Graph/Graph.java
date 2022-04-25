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
	
	public List < V > dfs ( int [ ] [ ] edges, int v ) // pre-order, stack, array for visited or not, vertices and edges
	{
		boolean visited [ ] = new boolean [ numV ];
		
		for ( V v1 : verticesList )
		{
			visited [ v ] = false;
		} // end of enhanced for loop
		
		Stack < Integer > s = new Stack < Integer > ( );
		s.push ( v );
		
		while ( !s.isEmpty ( ) )
		{
			v = s.pop ( );
			if ( visited [ v ] == false )
			{
				System.out.println ( "Dfs: " + v + " " );
				visited [ v ] = true;
				
				Iterator < Integer > i = ( Iterator < Integer > ) verticesList.iterator ( );
				while ( i.hasNext ( ) )
				{
					//int w = i.next ( );
					if ( !visited [ v ] )
					{
						s.push ( v );
					} // end of if statement
				} // end of while loop
			} // end of if statement
		} // end of while loop
		
		return verticesList;
	}
	
	public List < V > bfs ( int [ ] [ ] edges, int v ) // input for where to start, queue
	{
		boolean [ ] visited = new boolean [ numV ];
		
		for ( V v1 : verticesList )
		{
			visited [ v ] = false;
		} // end of enhanced for loop
		
		Queue < Integer >  Q = new LinkedList < Integer > ( );
		
		visited [ v ] = true;
		Q.add ( v );
	
		while ( !Q.isEmpty ( ) )
		{
			v = Q.poll ( );
			System.out.println ( "Bfs: " + v + " " );
			
			Iterator < Integer > i = ( Iterator < Integer > ) verticesList.iterator ( );
			
			while ( i.hasNext ( ) )
			{
				//int w = i.next ( );
				if ( !visited [ v ] )
				{
					visited [ v ] = true;
					Q.add ( v );
				} // end of if statement
			} // end of while loop
		} // end of while loop
			
		return verticesList;
	}
	
} // end of Class Graph
