package classSamples.polymorphism.SearchingAndSorting;


public class Section{

	
	public static void doStuff() {
		
		doStuff();
		
	}
	
	
	public static void main(String[] args) {
		//create 5 student objects out of order
		//use binary search to sort, then search for a specific student.
	
		
		doStuff();
		
		Student john = new Student("Jane Doe", 20);
		Student jane = new Student("John Smith", 21);
		Student unknown = new Student("Unn Known", 25);
		Student mrman = new Student("Mister Man", 1000);
		Student giant = new Student("Theodore Large", 2);
		Student[] section = new Student[]{john, jane, unknown, mrman, giant};
		
		Student studentToFind = jane;
		
		Sorting sort = new Sorting<Student>();
		Searching search = new Searching<Student>();
		sort.selectionSort(section);
		
		//pass sort.selectionsort value into binary search, looking for studentToFind
		
		System.out.print(search.binarySearch(section, studentToFind));	
		}


}
