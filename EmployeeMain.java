package Employ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee("Yash",1,"Vakkalagadda"),
				new Employee("Gopi",2,"Guntur"),
				new Employee("Yash",3,"Bangalore"),
				new Employee("Kumar",4,"Tirupathi")
		);

		for(Employee emp:list) {
			System.out.println(emp);
		}
		System.out.println();
		List<String> sameCity=new ArrayList<>();
		for(Employee emp:list) {
			if(emp.getCity().equals("Guntur")) {
				sameCity.add(emp.getName());
			}
		}
		for(String name:sameCity) {
			System.out.println(name);
		}
		
	}


	

}
