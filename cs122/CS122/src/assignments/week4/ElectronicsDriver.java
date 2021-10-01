package assignments.week4;

public class ElectronicsDriver {

	public static void main(String[] args) {
		
		Electronics generic = new Electronics("Apple", 0.5f, 10000, 0.0001f);
		Camera nikon = new Camera("Nikon", 0.7f, 249.99f, 16, 24);
		CellPhone samsungGalaxy = new CellPhone("Samsung", 0.4f, 1200f, 24, "5G");
		
		generic.printDesc();
		
		nikon.printDesc();
		System.out.println(nikon.getResolution());
		
		samsungGalaxy.printDesc();
		System.out.println(samsungGalaxy.sendMessage());
		
		System.out.println(samsungGalaxy.validateSIM("SIM1"));
		
	}
	
	
	
}
