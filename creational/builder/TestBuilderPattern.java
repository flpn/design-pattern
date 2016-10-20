package creational.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {

		Computer computer = new Computer.ComputerBuilder("1TB", "16GB").build();
		Computer computer2 = new Computer.ComputerBuilder("1TB", "16GB").setGraphicalCardEnabled(true).build();
		Computer computer3 = new Computer.ComputerBuilder("1TB", "16GB").setGraphicalCardEnabled(true).setBluetoothEnabled(true).build();
	}

}
