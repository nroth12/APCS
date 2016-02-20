
public class Teacher extends Person{
	
	// A String representing the academic subject taught by the teacher.
	private String subject;
	
	// The first and last names should be set by calling the constructor of the parent class.
	public Teacher(String fName, String lName, String subject1)
	{
		super(fName, lName);
		subject = subject1;
	}
	
	// Returns a two line String with Teacher info formatted as follows:
	// Dovi, Rebecca 
	//    Subject: Computer Science
	// Note: there are three spaces before "Subject: ...".
	public String toString()
	{
		String whole = super.toString();
		whole = whole + "\n   " + "Subject: " + subject;
		return whole;
	}
	

}
