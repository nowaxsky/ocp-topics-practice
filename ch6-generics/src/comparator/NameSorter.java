package comparator;

import java.util.Comparator;

import comparable.Student;

public class NameSorter implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}

}
