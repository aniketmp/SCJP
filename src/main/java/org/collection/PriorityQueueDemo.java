package org.collection;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String args[]) {
        Queue<String> q = new PriorityQueue<String>();
        q.add("1");
        q.add("2");
        q.add("3");
        System.out.println(q);
        System.out.println("Peek:"+q.peek());
        System.out.println("Polling:"+q.poll());
        System.out.println(q);
        System.out.println("Peek:"+q.peek());
        System.out.println("Polling:"+q.poll());
        System.out.println(q);
        
        System.out.println("--------------------------------------------------------------");
        
        Queue<Integer> q2 = new PriorityQueue<Integer>();
        q2.add(1);
        q2.add(2);
        q2.add(3);
        System.out.println(q2);
        System.out.println("Peek:"+q2.peek());
        System.out.println("Polling:"+q2.poll());
        System.out.println(q2);
        System.out.println("Peek:"+q2.peek());
        System.out.println("Polling:"+q2.poll());
        System.out.println(q2);
               
    }
    
}
//Queues typically, but not necessarily, order elements in a FIFO (first-in-first-out) manner. Among the exceptions are priority queues, which order elements according to their values