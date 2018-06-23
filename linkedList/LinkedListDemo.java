import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

class LinkedListDemo {
	
	private boolean created = false;
	LinkedList<Integer> linkedList;
	
	private void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\t\t\tLinked List Demo\n");
		int choice;
		do {
			System.out.println("1. Create  2. Insert  3. Delete	4. Display 5. Search  6. Sort  7. Size of linked list  8. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
		
			switch(choice) {
				case 1:
			
					if(!created) {
						linkedList = new LinkedList<Integer>();
						created = true;
						System.out.println("Linked List created successfully!");
						break;
					}
					else {
						System.out.println("Linked List already exists!");
						break;
					}
			
				case 2:
				
					if(!created) {
						System.out.println("Error: Please create linked list first!");
						break;
					}
				
					System.out.print("Enter data: ");
					Integer data = sc.nextInt();
					System.out.println("1. Insert at beginning	2. Insert at ending  3. Insert at position p");
					System.out.print("Enter choice: ");
					int insChoice = sc.nextInt();
				
					switch(insChoice) {
						case 1:
							linkedList.addFirst(data);
							System.out.println("Inserted!");
							break;
						
						case 2:
							linkedList.addLast(data);
							System.out.println("Inserted!");
							break;
						
						case 3:
							System.out.print("Enter a position: ");
							int pos = sc.nextInt();
							
							if(pos > linkedList.size()) {
								System.out.println("Error: Position out of range!");
								break;
							}
							
							linkedList.add(pos, data);
							System.out.println("Inserted!");
							break;
						
						default: 
							System.out.println("Invalid choice!");
							break;	
					}
				
					break;
				
				case 3:
			
					if(!created) {
						System.out.println("Error: Please create linked list first!");
						break;
					}
				
					System.out.println("1. Delete at beginning	2. Delete at ending  3. Delete at position p");
					System.out.print("Enter choice: ");
					int delChoice = sc.nextInt();
				
					switch(delChoice) {
						case 1:
							linkedList.removeFirst();
							System.out.println("Deleted!");
							break;
						
						case 2:
							linkedList.removeLast();
							System.out.println("Deleted!");
							break;
						
						case 3:
							System.out.print("Enter a position: ");
							int pos = sc.nextInt();
							
							if(pos > linkedList.size()) {
								System.out.println("Error: Position out of range!");
								break;
							}
							
							linkedList.remove(pos);
							System.out.println("Deleted!");
							break;
						
						default: 
							System.out.println("Invalid choice!");
							break;	
					}
				
					break;
				
				case 4:
				
					if(!created) {
						System.out.println("Error: Please create linked list first!");
						break;
					}
				
					System.out.print("Data in the linked list: ");
					for(Integer value : linkedList) {
							System.out.print(value+" -> ");
					}
					System.out.println();
					break;
					
				case 5:
					System.out.print("Enter the element you want to search in the linked list: ");
					int searchElement = sc.nextInt();
					boolean found = false;
					int index = 0;
					for(int listElement : linkedList) {
						if(listElement == searchElement) {
							found = true;
							System.out.println("Index of "+searchElement+": "+index);
						}
						index++;
					}
					if(!found) {
						System.out.println("Element not found in the linked list");
					}
					break;
				
				case 6:
					if(!created) {
						System.out.println("Error: Please create linked list first!");
						break;
					}
					Collections.sort(linkedList);
					System.out.println("Linked List Sorted Successfully!");
					break;
				
				case 7:
					System.out.println("Size of linked list: "+linkedList.size());
					break;
				
				case 8:
					sc.close();
					System.exit(0);
					break;
					
				default: 
						System.out.println("Invalid choice!");
						break;
			}
		} while(choice != 8);
		sc.close();
	}
	
	public static void main(String[] args) {
		LinkedListDemo demo = new LinkedListDemo();
		demo.test();
	}
	
}
