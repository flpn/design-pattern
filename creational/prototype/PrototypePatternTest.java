package creational.prototype;

public class PrototypePatternTest {

	public static void main(String[] args) {

		Employees emps = new Employees();
		emps.loadData();
		
		Employees newEmps = (Employees)emps.clone();
	}

}
