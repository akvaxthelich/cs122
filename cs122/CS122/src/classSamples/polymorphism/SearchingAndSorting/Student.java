package classSamples.polymorphism.SearchingAndSorting;

public class Student implements Comparable<Student>{

	public String name;
	public int age;
	
	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	

	@Override
	public int compareTo(Student that) {
		
		if(this.age > that.age) {
			
			return 1;
			
		}
		else if(this.age < that.age) {
			
			return -1;
		}
		
		return 0;
	}
	
	//don't care about the name, just comparing the age with equals
	
	public boolean equals(Student that) {
		
		return this.age == that.age;
		
		
	}
	
	public String toString() {
		
		return this.name;
		
	}
	
}
