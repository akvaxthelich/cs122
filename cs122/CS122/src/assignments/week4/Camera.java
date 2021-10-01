package assignments.week4;

public class Camera extends Electronics {

	protected int resolution; //in megapixels
	public Camera(String manufacturer, float weight, float cost, float batteryLife, int resolution) {
		super(manufacturer, weight, cost, batteryLife);
		
		this.resolution = resolution;
		
		
	}

	public void printDesc() {
		
		Text.print("Manufacturer: " + manufacturer + ".");
		Text.print("Battery Capacity: " + batteryLife + " amp/h.");
		Text.print("Weight: " + weight + " Kg.");
		System.out.println("Cost: $" + System.out.printf("%.2f%n", cost) + ".");
		
		Text.print("Resolution: " + resolution + " megapixels.");
	}
	
	public int getResolution(){
		
		return resolution;
		
	}
	
	public void capturePhoto() {
		
		try {
			throw new UnsupportedOperationException();
			
		}
		catch(UnsupportedOperationException e){
			
			Text.print("Camera not recognized. Check cables?");
			
		}
		
	}
}
