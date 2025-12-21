package basic;

import java.util.PriorityQueue;

/*Queue-->predefined interface in java.util
 * first in first out for LinkedList,PriorityOrder for PriorityQueue
 * Duplicates are allowed
 * Elements cant be accessed by index
 * 
 */

public class ExampleForQueue {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		System.out.println(pq);
		System.out.println("------------");
		for(Object i:pq) {
			System.out.println(i);
		}
       System.out.println("-----------");
       System.out.println(pq.poll());
	}

}
