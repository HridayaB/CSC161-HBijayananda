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
		for ( int i = 0; i < 5; i++ )
		{
			vertices.add ( new Vertex ( i ) );
		}
		
		int [ ] [ ] edges = { { 0, 1, 1 }, { 1, 0, 2 }, { 1, 3, 3 }, { 3, 1, 4 }, { 1, 4, 5 }, { 4, 1, 6 }, { 0, 3, 7 }, { 3, 0, 8 } };
		
		Graph < Vertex > graph1 = new Graph ( vertices, edges, 8 );
		graph1.printEdges ( );
		
		
		int node = 7;
		List < Vertex > edge = (List<com.CSC161J.Exam4.Vertex>) graph1.findMinimumSpanningTree ( edges, node );
		System.out.println ( edge );for ( Vertex v : edge ) 
		{
			System.out.print ( v.id + "," );
		}
	
	}

}
