package creational.builder;

public class Computer {

	//required parameters
	private String HDD;
	private String RAM;
	
	//opitional parameters
	private boolean isGraphicalCardEnabled;
	private boolean isBluetoothEnabled;
	
	public String getHDD() {
		return HDD;
	}
	
	public String getRAM() {
		return RAM;
	}
	
	public boolean isGraphicalCardEnabled() {
		return isGraphicalCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicalCardEnabled = builder.isGraphicalCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}
	
	public static class ComputerBuilder {
		
		//required parameters
		private String HDD;
		private String RAM;
		
		//opitional parameters
		private boolean isGraphicalCardEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String HDD, String RAM) {
			this.HDD = HDD;
			this.RAM = RAM;
		}
		
		public ComputerBuilder setGraphicalCardEnabled(boolean isGraphicalCardEnabled) {
			this.isGraphicalCardEnabled = isGraphicalCardEnabled;
			return this;
		}
		
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
}
