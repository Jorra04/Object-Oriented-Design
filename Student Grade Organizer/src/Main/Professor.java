package Main;

public class Professor {

	private String firstName;
	private String lastName;
	private int age;
	private String faculty;

	public Professor(String firstName, String lastName, int age, String faculty) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.faculty = faculty;
	}

	public Professor(Professor other) {
		this.firstName = other.firstName;
		this.lastName = other.lastName;
		this.age = other.age;
		this.faculty = other.faculty;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getAge() {
		return this.age;
	}

	public String getFaculty() {
		return this.faculty;
	}
	
	public String getAbbreviatedName() {
		return this.firstName.charAt(0) + ". " + this.lastName;
	}
	
	public String toString() {
		return "Name: " +  this.firstName + " " + this.lastName + "\nAge: "+ this.age  + "\nFaculty: " + this.faculty + "\n";
	}

}
