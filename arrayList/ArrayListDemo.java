import java.util.ArrayList;
import java.util.Scanner;

class ArrayListDemo {
	
	private boolean created = false;
	ArrayList<Integer> arrayList;
	
	private void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\t\tArrayList Demo\n");
		int choice;
		do {
			System.out.println("1. Create  2. Insert  3. Delete	4. Display	5. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
		
			switch(choice) {
				case 1:
			
					if(!created) {
						arrayList = new ArrayList<Integer>();
						created = true;
						System.out.println("Array List created successfully!");
						break;
					}
					else {
						System.out.println("Array List already exists!");
						break;
					}
			
				case 2:
				
					if(!created) {
						System.out.println("Error: Please create array list first!");
						break;
					}
				
					System.out.print("Enter data: ");
					Integer data = sc.nextInt();
					System.out.println("1. Insert at beginning	2. Insert at ending  3. Insert at position p");
					System.out.print("Enter choice: ");
					int insChoice = sc.nextInt();
				
					switch(insChoice) {
						case 1:
							arrayList.add(0, data);
							System.out.println("Inserted!");
							break;
						
						case 2:
							arrayList.add(data);
							System.out.println("Inserted!");
							break;
						
						case 3:
							System.out.print("Enter a position: ");
							int pos = sc.nextInt();
							
							if(pos > arrayList.size()) {
								System.out.println("Error: Position out of range!");
								break;
							}
							
							arrayList.add(pos, data);
							System.out.println("Inserted!");
							break;
						
						default: 
							System.out.println("Invalid choice!");
							break;	
					}
				
					break;
				
				case 3:
			
					if(!created) {
						System.out.println("Error: Please create array list first!");
						break;
					}
				
					System.out.println("1. Delete at beginning	2. Delete at ending  3. Delete at position p	4. Delete all elements from the list");
					System.out.print("Enter choice: ");
					int delChoice = sc.nextInt();
				
					switch(delChoice) {
						case 1:
							arrayList.remove(0);
							System.out.println("Deleted!");
							break;
						
						case 2:
							arrayList.remove(arrayList.size() - 1);
							System.out.println("Deleted!");
							break;
						
						case 3:
							System.out.print("Enter a position: ");
							int pos = sc.nextInt();
							
							if(pos > arrayList.size()) {
								System.out.println("Error: Position out of range!");
								break;
							}
							
							arrayList.remove(pos);
							System.out.println("Deleted!");
							break;
							
						case 4:
							created = false;
							arrayList.clear();
							System.out.println("All elements deleted from array list");
							break;
						
						default: 
							System.out.println("Invalid choice!");
							break;

					}
				
					break;
				
				case 4:
				
					if(!created) {
						System.out.println("Error: Please create array list first!");
						break;
					}
				
					System.out.print("Data in the array list: ");
					for(Integer value : arrayList) {
							System.out.print(value+" -> ");
					}
					System.out.println();
					break;
				
				case 5:
					sc.close();
					System.exit(0);
					break;
					
				default: 
						System.out.println("Invalid choice!");
						break;
			}
		} while(choice != 5);
		sc.close();
	}
	
	public static void main(String[] args) {
		ArrayListDemo demo = new ArrayListDemo();
		demo.test();
	}
}