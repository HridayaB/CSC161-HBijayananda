package com.CSC161J.Exam4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.CSC161J.Exam4.Graph.Edge;
import com.CSC161J.Graph.Vertex;

public class GraphTest 
{

	public static void main ( String [ ] args ) 
	{
		List < Vertex > vertices = new ArrayList < > ( );
		for ( int i = 0; i < 11; i++ )
		{
			vertices.add ( new Vertex ( i ) );
		}
		
		int [ ] [ ] edges = {
				{0, 1, 0}, {0, 8, 0},
				{1, 0, 0}, {1, 2, 0}, {1, 5, 0},
				{2, 1, 0}, {2, 3, 0}, {2, 4, 0},
				{3, 2, 0},
				{4, 2, 0},
				{5, 1, 0}, {5, 6, 0}, {5, 7, 0},
				{6, 5, 0},
				{7, 5, 0},
				{8, 0, 0}, {8, 9, 0}, {8, 10, 0},
				{9, 8, 0},
				{10, 8, 0}
		};
		Graph < Vertex > graph1 = new Graph ( vertices, edges, 8 );
		graph1.printEdges ( );
		
		
		int node = 7;
		List < Vertex > lcv = ( List < Vertex > ) graph1.findMinimumSpanningTree ( edges, node );
		System.out.println ( lcv );
		for ( Vertex v : lcv ) 
		{
			System.out.print ( v.id + ", " );
		}
	
	}

}
