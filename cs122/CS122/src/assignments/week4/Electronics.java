package assignments.week4;

public class Electronics {

	protected float batteryLife; //in amp hours
	protected String manufacturer;
	protected float weight; //in kilograms
	
	protected float cost;
	
	public Electronics(String manufacturer, float weight, float cost, float batteryLife){
		
		this.manufacturer = manufacturer;
		this.weight = weight;
		this.cost = cost;
		this.batteryLife = batteryLife;
		
	}
	
	public void printDesc() {
		
		Text.print("Manufacturer: " + manufacturer + ".");
		Text.print("Battery Capacity: " + batteryLife + " amp/h.");
		Text.print("Weight: " + weight + " Kg.");
		System.out.println("Cost: $" + System.out.printf("%.2f%n", cost) + ".");
	}
	
	
	
}
