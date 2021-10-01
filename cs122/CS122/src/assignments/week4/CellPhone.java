package assignments.week4;

public class CellPhone extends Electronics {

	String techStandard; //3G, 4G, etc
	
	public CellPhone(String manufacturer, float weight, float cost, float batteryLife, String techStandard) {
		super(manufacturer, weight, cost, batteryLife);
		this.techStandard = techStandard;
	}

	
	public void printDesc() {
		
		Text.print("Manufacturer: " + manufacturer + ".");
		Text.print("Battery Capacity: " + batteryLife + " amp/h.");
		Text.print("Weight: " + weight + " Kg.");
		System.out.println("Cost: $" + System.out.printf("%.2f%n", cost) + ".");
		
		Text.print("Telecommunications Standard: " + techStandard + ".");
	}
	
	public boolean sendMessage() {
		
		//code to send a message to another cellphone object
		return true; //boolean, false if message fails to send.
	}
	
	public boolean validateSIM(String simcard){
		
		//implementation
		return true;
	}
	
}
