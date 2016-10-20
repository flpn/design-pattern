package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private List<String> employeeList;
	
	public Employees() {
		employeeList = new ArrayList<>();
	}
	
	public Employees(List list) {
		employeeList = list;
	}
	
	public void loadData() {
		employeeList.add("Frodo");
		employeeList.add("Legolas");
		employeeList.add("Gandalf");
		employeeList.add("Aragorn");
	}
	
	public List<String> getEmployeeList() {
		return employeeList;
	}
	
	@Override
	public Object clone() {
		List<String> temp = new ArrayList<>();
		
		for (String employee : employeeList) {
			temp.add(employee);
		}
		
		return new Employees(temp);
	}
}
