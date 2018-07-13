import java.util.Queue;
import java.util.LinkedList;

class QueueDemo {
	
	public static void printElements(Queue<Integer> queue) {
		System.out.print("Elements in stack are: ");
		Object o[] = queue.toArray(); 
		for (int i = 0; i < queue.size(); i++) {
			System.out.print(o[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		// adding elements in queue
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		printElements(queue);
		
		// retrieving head of queue without removing it
		int headElement = queue.element();
		System.out.println("Head of queue: "+headElement);
		
		// add element in queue
		queue.offer(100);
		System.out.println("After adding 100");
		printElements(queue);
		
		// removing head of queue
		int afterPoll = queue.poll();
		System.out.println("Removed element: "+afterPoll);
		System.out.println("After deleting:");
		printElements(queue);
		
		// retrieving head of queue
		int retrieveHead = queue.element();
		System.out.println("Retrieved head: "+retrieveHead);
		printElements(queue);
		
	}
}