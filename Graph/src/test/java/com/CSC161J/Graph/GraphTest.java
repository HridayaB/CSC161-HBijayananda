package com.CSC161J.Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphTest 
{

	public static void main (String[] args) 
	{
		List < Vertex > vertices = new ArrayList < > ( );
		for ( int i = 0; i < 11; i++ )
		{
			vertices.add ( new Vertex ( i ) );
		}
		
<<<<<<< HEAD
		int [ ] [ ] edges = {
=======
		int[][] edges = {
>>>>>>> 25e9d846900b6533b3f2c3825d3a2154663a274a
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
		
<<<<<<< HEAD
		List < Vertex > list = graph1.dfs ( edges, 0 );
		System.out.print ( "DFS:" );
		for ( Vertex v : list ) 
		{
			System.out.print ( v.id + ", " );
		}

		System.out.println ( );
		list = graph1.bfs ( edges, 2 );
		System.out.print ( "BFS:" );
		for ( Vertex v : list ) 
		{
			System.out.print ( v.id + ", " );
=======
		List<Vertex> list = graph1.dfs ( edges, 0 );
		System.out.print("DFS:");
		for (Vertex v : list) {
			System.out.print(v.id + "," );
>>>>>>> 25e9d846900b6533b3f2c3825d3a2154663a274a
		}
		
		list = graph1.bfs ( edges, 2 );
		System.out.print("BFS:");
		for (Vertex v : list) {
			System.out.print(v.id + "," );
		}
	}

}
