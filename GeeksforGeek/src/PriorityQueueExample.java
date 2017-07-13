import java.util.*;
import java.io.IOException;

public class PriorityQueueExample {
	
	public static void main(String args[]) throws IOException{
		PriorityQueue<String> pqueue = new PriorityQueue<String>();
		pqueue.add("A");
		pqueue.add("B");
		pqueue.add("C");
		pqueue.add("D");
		pqueue.add("E");
		
		Iterator<String> ltr = pqueue.iterator();
		System.out.println("Priority Queue:\n");
		while(ltr.hasNext()){
			System.out.println(ltr.next());
		}
		
		System.out.println("Peek value is:\t"+pqueue.peek());
		pqueue.poll();
		System.out.println("Priority Queue After using poll method:\n");
		Iterator<String> ltr1 = pqueue.iterator();
		while(ltr1.hasNext()){
			System.out.println(ltr1.next());
		}
		System.out.println("Priority queue contains D or not:\t"+pqueue.contains("D"));
		pqueue.remove("D");
		System.out.println("Priority Queue After removing D item:\n");
		Iterator<String> ltr3 = pqueue.iterator();
		while(ltr3.hasNext()){
			System.out.println(ltr3.next());
		}
	}

}

