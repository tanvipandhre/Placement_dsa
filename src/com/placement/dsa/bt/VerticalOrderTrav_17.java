package com.placement.dsa.bt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

class Tuple{
	Node node;
	int row;
	int col;
	public Tuple(Node node, int row, int col) {
		this.node = node;
		this.row = row;
		this.col = col;
	}
	
}

public class VerticalOrderTrav_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(10);
		root.right.left = new Node(9);
		root.right.right = new Node(10);
		root.left.left.right = new Node(5);
		root.left.left.right.right = new Node(6);
		
		List<List<Integer>> list = verticalTrav(root);
		Iterator itr = list.iterator();
		while( itr.hasNext() )
			System.out.println( itr.next() );
	}
	public static List<List<Integer>> verticalTrav(Node root) {
		 	//vertical			//level					//multiple nodes
		TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
		Queue<Tuple> queue = new LinkedList<Tuple>();
		queue.offer(new Tuple(root, 0, 0));
		while( !queue.isEmpty() ) {
			Tuple tuple = queue.poll();
			Node node = tuple.node;
			int x = tuple.row;
			int y = tuple.col;
			
			if( !map.containsKey(x) )
				map.put(x, new TreeMap<>());
			
			if( !map.get(x).containsKey(y) )
				map.get(x).put(y, new PriorityQueue<>());
			map.get(x).get(y).offer(node.data);
			
			if( node.left != null )
				queue.offer( new Tuple(node.left, x-1, y+1) );
			if( node.right != null )
				queue.offer( new Tuple(node.right, x+1, y+1) );
			
		}
		List<List<Integer>> list = new ArrayList<>();
			for( TreeMap<Integer, PriorityQueue<Integer>> tm:map.values()) {
				list.add( new ArrayList<>());
				for( PriorityQueue<Integer> pq : tm.values()) {
					while( !pq.isEmpty() ) {
						//System.out.println(pq.peek());
						list.get( list.size() - 1).add( pq.poll() ); //add it to the end of the list
					}
				}
			}
			
		
		return list;
		
		
		
	}

}
