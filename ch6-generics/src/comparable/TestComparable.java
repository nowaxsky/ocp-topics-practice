package comparable;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestComparable {

	public static void main(String[] args) {
		System.out.println("---before sort---");
		Set<Student> students = new HashSet<>();
		students.add(new Student("John", 2, 3.9));
		students.add(new Student("Thomas", 1, 3.8));
		students.add(new Student("George", 3, 3.4));
		
		for(Student student: students) {
			System.out.println(student);
		}
		
		
		System.out.println("---after sort(self-defined)---");
		Set<Student> sortedStudents = new TreeSet<>();
		sortedStudents.add(new Student("John", 2, 3.9));
		sortedStudents.add(new Student("Thomas", 1, 3.8));
		sortedStudents.add(new Student("George", 3, 3.4));
		
		for(Student student: sortedStudents) {
			System.out.println(student);
		}
		

	}

}
