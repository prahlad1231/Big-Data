import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class HashMapDemo {
	
	private boolean created = false;
	HashMap<Integer, String> hashMap;
	
	private void test() {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Create  2. Insert  3. Delete  4. Search  5. Display  6. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					if(!created) {
						hashMap = new HashMap<Integer, String>();
						created = true;
						System.out.println("HashMap created Successfully!");
						break;
					}
					else {
						System.out.println("Error: HashMap already exists!");
						break;
					}
					
				case 2:
					Integer key;
					String value;
					
					System.out.print("Enter key-value pair separated by space: ");
					key = sc.nextInt();
					value = sc.next();
					
					hashMap.put(key, value);
					System.out.println("Successfully inserted!");
					break;
					
				case 3:
					System.out.println("Enter the key: ");
					Integer toDelete = sc.nextInt();
					
					if(!hashMap.containsKey(toDelete)) {
						System.out.println("Error: No such key found!");
						break;
					}
					hashMap.remove(toDelete);
					System.out.println("Successfully removed!");
					break;
					
				case 4:
					System.out.println("Enter the key: ");
					int toSearch = sc.nextInt();
					
					if(!hashMap.containsKey(toSearch)) {
						System.out.println("Error: No such key found!");
						break;
					}
					System.out.println("Key: "+toSearch+", Value: "+hashMap.get(toSearch));
					break;
					
				case 5:
					System.out.println("Key-Value Pairs are: ");
					Set<Integer> keySet = hashMap.keySet();
					for(Integer hashValue : hashMap.keySet()) {
						System.out.println("Key: "+hashValue+", Value: "+hashMap.get(hashValue));
					}
					break;
				
				case 6:
					sc.close();
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid choice!");
					break;
			}
		} while(choice != 6);
	}

	public static void main(String[] args) {
		HashMapDemo demo = new HashMapDemo();
		demo.test();
	}
}