package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import comparable.Student;

public class TestComparator {
	
	private static void showList(List<Student> students) {
		for(Student student: students) {
			System.out.println(student);
		}
	}

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>(3);
		students.add(new Student("Thomas", 1, 3.8));
		students.add(new Student("John", 2, 3.9));
		students.add(new Student("Annie", 4, 4.2));		
		students.add(new Student("George", 3, 3.4));
		
		
		System.out.println("---original---");
		showList(students);
		
		System.out.println("---sort by compareTo method in Student---");
		Collections.sort(students);
		showList(students);
		
		System.out.println("---sort by name---");
		Comparator<Student> sortByName = new NameSorter();
		Collections.sort(students, sortByName);
		showList(students);
		
		System.out.println("---sort by score---");
		Comparator<Student> sortByScore = new ScoreSorter();
		Collections.sort(students, sortByScore);
		showList(students);
		

	}

}
