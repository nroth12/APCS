
public class HighSchoolStudent extends Student{

	private double gpa;
	
	// The first and last names and the level should be set by calling the
	// constructor of the parent class. The GPA should be between 0 and 5 
	// inclusive, otherwise set to 0.
	public HighSchoolStudent(String fName, String lName, int gLevel, double inputGpa)
	{
		super(fName, lName, gLevel);
		if(inputGpa >= 0 && inputGpa <= 5)
			gpa = inputGpa;
		else
			gpa = 0;
		
	}
	
	// Returns a four line String with HighSchoolStudent info formatted as follows:
	// 	Lee, Sarah
	// 	   Grade Level: 9
	//	   ID #: 2
	//	   GPA: 3.7 
	//	Note: there are three spaces before "Grade Level: ...", "ID #: ..." and "GPA: ...".
	public String toString()
	{
		String whole = super.toString();
		whole = whole + "\n   " + "GPA: " + gpa;
		return whole;
	}
	
	
}
