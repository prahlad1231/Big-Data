import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class SerializationDemo {
	
	public static void printObject(EmployeeDetails object) {
		System.out.println("id: "+object.id);
		System.out.println("salary: "+object.salary);
		System.out.println("name: "+object.name);
	}
	
	public static void main(String[] args) {
		int id;
		double salary;
		String name;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id: ");
		id = sc.nextInt();
		System.out.print("Enter salary: ");
		salary = sc.nextDouble();
		System.out.print("Enter name: ");
		name = sc.next();
		
		EmployeeDetails emp1 = new EmployeeDetails(id, salary, name);
		
		String file = "data.txt";
		// Serialization
		try {
			FileOutputStream fout = new FileOutputStream(file);
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			
			oout.writeObject(emp1);
			
			fout.close();
			oout.close();
			
			System.out.println("Successfully written in the file!");
		} catch(IOException ioe) {ioe.printStackTrace();}
		
		// deserialization
		EmployeeDetails temp = null;
		
		try {
			FileInputStream fin = new FileInputStream(file);
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			temp = (EmployeeDetails) oin.readObject();
			
			System.out.println("Details are: ");
			printObject(temp);
			
			fin.close();
			oin.close();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}