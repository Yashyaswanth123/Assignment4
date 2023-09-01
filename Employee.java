package Employ;

public class Employee {
	String name;
	int employeeId;
	String city;
	public Employee(String name, int employeeId, String city) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.city = city;
	}
	public Employee() {
		super();
		
	}
	@Override
	public String toString() {
		return "["+name+","+employeeId+","+city+"]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
