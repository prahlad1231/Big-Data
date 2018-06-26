import java.io.Serializable;

public class EmployeeDetails implements Serializable {
	public int id;
	public double salary;
	public String name;
	
	public EmployeeDetails(int id, double salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
}