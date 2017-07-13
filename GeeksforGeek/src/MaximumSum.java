/**Code to Maximize array sum after K negations -> Priority queue*/
import java.util.*;
import java.io.IOException;

public class MaximumSum {
	PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();
	//Method to insert the items into priority queue
	public void InsertElement(int items){
		pqueue.add(items);
	}
	
	//Method to find the sum of the items of priority queue
	public int addItems(PriorityQueue<Integer> pq){
		int sum = 0;
		Iterator<Integer> ltr1 = pqueue.iterator();
		while(ltr1.hasNext()){
			sum += (int)ltr1.next();
		}
		return sum;	
	}
	
	//Main method to find the maximize array value
	void calculateMaxSum(int k){
		for(int i=0;i<k;i++){
			int c = pqueue.poll();
			c*=-1;
			pqueue.add(c);
			displayQueue();
		}
		int final_value = addItems(pqueue);
		System.out.println("Maximum Sum is:\t"+final_value);
	}
		
	//Method to display the priority queue	
	void displayQueue(){
		Iterator ltr = pqueue.iterator();
		while(ltr.hasNext()){
			System.out.println(ltr.next());
		}
	}
	public static void main(String args[]) throws IOException{
		
		MaximumSum m1 = new MaximumSum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for K:\t");
		int k = sc.nextInt();
		System.out.println("Enter size of array:\t");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			m1.InsertElement(a);
		}
		System.out.println("Priority queue is:\t");
		m1.displayQueue();
		m1.calculateMaxSum(k);
		sc.close();
	}

}
