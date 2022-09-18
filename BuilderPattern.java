//$Id$
package Cooks;

public class BuilderPattern {
	private String OS;
	private int size;
	private int price;
	private int ram;
	private int battery;
	
	public BuilderPattern() {
		
	}
	
	private BuilderPattern(String oS, int size, int price, int ram, int battery) {
		this.OS = oS;
		this.size = size;
		this.price = price;
		this.ram = ram;
		this.battery = battery;
	}
	
	@Override
	public String toString() {
		return ("OS :"+OS+"\nSize :"+size+"\nprice :"+price+"\nRam :"+ram+"\nBattery :"+battery);
	}
	
	public class MobileBuilder{
		private String OS;
		private int size;
		private int price;
		private int ram;
		private int battery;
		
		public MobileBuilder() {
			
		}
		public MobileBuilder setOS(String oS) {
			OS = oS;
			return this;
		}
		public MobileBuilder setSize(int size) {
			this.size = size;
			return this;
		}
		public MobileBuilder setPrice(int price) {
			this.price = price;
			return this;
		}
		public MobileBuilder setRam(int ram) {
			this.ram = ram;
			return this;
		}
		public MobileBuilder setBattery(int battery) {
			this.battery = battery;
			return this;
		}
		public BuilderPattern getMobile() {
			return new BuilderPattern(OS,size,price,ram,battery);
		}
		
	}
}
