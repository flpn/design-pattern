package creational.abstractfactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer(new PCFactory("16GB", "1TB", "I7"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("2GB", "500GB", "I3"));
		
		System.out.println(pc);
		System.out.println(server);
	}
}
