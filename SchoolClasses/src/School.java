import java.util.ArrayList;

public class School {

	// A list of students at the school.
	private ArrayList<Student> students;
	// A list of teachers at the school.
	private ArrayList<Teacher> teachers;
	
	// A constructor that specifies teachers and students at a school.
	public School(ArrayList<Student> students1, ArrayList<Teacher> teachers1)
	{
		students = students1;
		teachers = teachers1;
	}
	
	// Returns a String listing all the schools's students that are at the specified grade level.
	// Returns an empty String if the school has no students at the specified level.
	// See the Sample Run below for the format of the returned String.
	public String getGradeLevel(int level)
	{
		String whole = "";
		for(Student student1: students)
		{
			if(student1.getLevel() == level)
				whole = whole + student1 + "\n";
		}
		return whole;
	}
	
	// Returns a multi-line String listing the teachers and students at the school.
	// The String is formatted as follows:
	// Faculty:
	// {listing of faculty, one on each line}
    // 
	// Student Body:
	// {listing of students, one on each line}
	public String toString()
	{
		String wholeString = "";
		
		String wholeStudents = "";
		for(Student student1: students)
		{
			wholeStudents = wholeStudents + student1 + "\n";
		}
		
		String wholeTeachers = "";
		for(Teacher teacher1: teachers)
		{
			wholeTeachers = wholeTeachers + teacher1 + "\n";
		}
		wholeString = "Faculty:" + "\n" + wholeTeachers + "\n\n";
		wholeString = wholeString + "Student Body:" + "\n" + wholeStudents;
		return wholeString;
	}
	
	
	
	
}
