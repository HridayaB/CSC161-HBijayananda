package com.CSC161J.Graph;

import java.util.ArrayList;
import java.util.List;

import com.CSC161J.Graph.Graph.Edge;

public class Graph < V >
{

	protected List < V > verticesList = new ArrayList < V > ( ); // List of vertices
	protected List < List < Edge > > neighbours = new ArrayList ( ); // List of lists
	
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
	
	public Graph ( List < V > verticesList, int [ ] [ ] edges )
	{
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
	
	public List < V > dfs ( ) // pre-order, stack, array for visited or not, vertices and edges
	{
		return null;
	}
	
	public List < V > bfs ( ) // input for where to start, queue
	{
		return null;
	}
	
} // end of Class Graph
