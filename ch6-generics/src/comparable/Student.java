package comparable;

public class Student implements Comparable<Student> {

	private String name;
	private long id;
	private double score;
	
	public Student(String name, long id, double score) {
		super();
		this.name = name;
		this.id = id;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public double getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		return this.name + "\t" + this.id + "\t" + this.score;
	}

	@Override
	public int compareTo(Student s) {
		
		//you have to use class to compareTo instead of basic type
		int sortById = ((Long) this.id).compareTo((Long) (s.id));
		int sortByName = this.name.compareTo(s.getName());
		int sortByScore = new Double(this.score).compareTo(new Double(s.score));
		return sortById;
	}
	
}
