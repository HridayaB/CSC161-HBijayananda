package com.CSC161J.Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphTest 
{

	public static void main ( String [ ] args ) 
	{
		List < Vertex > vertices = new ArrayList < > ( );
		for ( int i = 0; i < 5; i++ )
		{
			vertices.add ( new Vertex ( i ) );
		}
		
		int [ ] [ ] edges = { { 0, 1 }, {1, 0}, { 1, 3 }, { 3, 1 }, { 1, 4 }, { 4, 1 }, { 0, 3 }, { 3, 0 } };
		
		Graph < Vertex > graph1 = new Graph ( vertices, edges, 8 );
		graph1.printEdges ( );
		
		graph1.dfs ( edges, 0 );
		
		graph1.bfs ( edges, 2 );
		
		
	}

}
