package Main;
import java.util.*;
public class Student {
	private double GPA;
	private String name;
	private String UID;
	private List<Course> enrolledCourses; //can go through the list of courses and update gpa
	
	public Student(int GPA, String name, String UID) {
		this.enrolledCourses = new ArrayList();
		this.GPA = GPA;
		this.name = name;
		this.UID = UID;
	}
	
	public double getGPA() {
		double cumulativeGradePoints = 0;
		for(Course course : enrolledCourses) {
			cumulativeGradePoints += course.getGradeStudentMap().get(this);
		}
		
		this.GPA = (cumulativeGradePoints * 1.0)/this.enrolledCourses.size();
		return this.GPA;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getUID() {
		return this.UID;
	}
	
	public void addCourse(Course course) {
		this.enrolledCourses.add(course);
	}
	
	public void setGPA(int gpa) {
		this.GPA = gpa;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Name: " + this.name + "\nUID: "+ this.UID  + "\nGrade: " + this.GPA + "\n";
	}
	
	




	
	
}
