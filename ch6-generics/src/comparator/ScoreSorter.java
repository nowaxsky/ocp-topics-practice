package comparator;

import java.util.Comparator;

import comparable.Student;

public class ScoreSorter implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return new Double(s1.getScore()).compareTo(s2.getScore());
	}

}
