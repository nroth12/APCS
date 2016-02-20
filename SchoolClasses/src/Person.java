
public class Person {

	private String firstName;
	private String lastName;
	
	//Constructor that takes in String parameters representing the first and last names
	public Person(String fName, String lName)
	{
		firstName = fName;
		lastName = lName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	//Returns a string in the following format:
	//lastName, firstName
	public String toString()
	{
		return (lastName + ", " + firstName);
	}
}
