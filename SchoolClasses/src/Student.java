
public class Student extends Person{
	
	private static int studentId;
	private int level;
	
	// Constructor that accepts the first and last names and the student level.
	// Student level should be assigned 0 if gLevel is not between 0 and 12 inclusive.
	// The first and last names should be set by calling the constructor of the parent class.
	// The Student constructor also sets the studentId to the next available positive integer.
	// The first Student created should have a studentId of 1, the second will
	// have an ID of 2, third of 3, etc.
	public Student(String fName, String lName, int gLevel)
	{
		super(fName, lName);
		if(gLevel >= 0 && gLevel <= 12)
			level = gLevel;
		else
			level = 0;
		studentId = studentId;
		studentId++;
	}
	
	// Returns the student's grade level.
	public int getLevel()
	{
		return level;
	}
	
	public int getId()
	{
		return studentId;
	}

	// Returns a three line String with Student info formatted as follows:
	// Smith, Mary
	//   Grade Level: 2
	//   ID #: 1 
	// Note: there are three spaces before "Grade Level: ..." and "ID #: ...".
	public String toString()
	{
		String whole ="";
		whole = lastName + ", " + firstName;
		whole = whole + "\n   " + "Grade Level: " + level;
		whole = whole + "\n   " + "ID #: " + studentId;
		return whole;
	}
	
	
	
	
}

