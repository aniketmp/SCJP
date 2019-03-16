package org.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo2 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q=new PriorityQueue<>();
		q.offer(1);//similar to add
		q.offer(2);
		q.offer(1); //duplicate allowed? yes.
		q.offer(3);
//		q.offer(null);// Runtime Exception thrown. java.lang.NullPointerException
		q.offer(5);//doesn't throw exception like add instead return false if violate rules.
		q.add(4);//Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, 
		         //returning true upon success and throwing an IllegalStateException if no space is currently available
		System.out.println(q);
		System.out.println(q.poll());//Retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println(q.remove());//Retrieves and removes the head of this queue. This method differs from poll only in that it throws an exception if this queue is empty.
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
//        System.out.println(q.remove());  //throws exception java.util.NoSuchElementException since trying to remove element from empty queue
        System.out.println(q.poll());  //return null.
        
	}
}
