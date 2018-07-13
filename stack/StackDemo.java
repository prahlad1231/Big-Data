import java.util.Scanner;
import java.util.Stack;

class StackDemo {
	
	public static void main(String[] args) {
		System.out.println("\t\t\tStack Demo\n\n");
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Push  2. Pop  3. Peek  4. Empty  5. Search  6. Display  7. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.print("Enter element: ");
					int toPush = sc.nextInt();
					stack.push(toPush);
					System.out.println("Successfully pushed into stack!");
					break;
				
				case 2:
					if(!stack.empty()) {
						int popped = stack.pop();
						System.out.println("Popped element: "+popped);
						break;
					}
					else {
						System.out.println("Stack is already empty!");
					}
					break;
				
				case 3:
					if(!stack.empty()) {
						int peekElement = stack.peek();
						System.out.println("Peek element: "+peekElement);
						break;
					}
					else {
						System.out.println("Stack is empty!");
					}
					break;
				
				case 4:
					System.out.println(stack.empty());
					break;
				
				case 5:
					System.out.print("Enter element to search in stack: ");
					int toSearch = sc.nextInt();
					int pos = stack.search(toSearch);
					if(pos == -1) {
						System.out.println("Element not found!");
					}
					else {
						System.out.println("Element found in position: "+pos);
					}
					break;
					
				case 6:
					System.out.print("Elements in stack are: ");
					Object o[] = stack.toArray(); 
					for (int i = 0; i < stack.size(); i++) {
						System.out.print(o[i]+" ");
					}
					System.out.println();
					break;
				
				case 7:
					System.exit(0);
					break;
				
				default: 
					System.out.println("Invalid choice!");
					break;
			}
		} while(choice != 7);
	}
}