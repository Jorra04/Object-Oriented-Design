package Main;

import java.util.*;

public class Course {
	private Map<Student, Integer> studentGradeMap;
	private String courseName;
	private String courseID;
	private Professor professor;
	private List<Student> students;
	private int cumulativeGradePoints;
	private double classAverage;
	private int classSize;
	
	
	public Course(String courseName, String courseID, Professor professor) {
		this.studentGradeMap = new HashMap();
		this.courseName = courseName;
		this.courseID = courseID;
		this.professor = professor;
		this.students = new ArrayList();
		this.classAverage = 0;
		this.cumulativeGradePoints = 0;
		this.classSize = 0;
	}
	
	public Course(Course other) {
		this.courseName = other.courseName;
		this.courseID = other.courseID;
		this.professor = other.professor;
		this.students = other.students;
		this.classAverage = other.classAverage;
		this.cumulativeGradePoints = other.cumulativeGradePoints;
		this.classSize = other.classSize;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public String getCourseID() {
		return this.courseID;
	}
	
	public Professor getCourseInstructor() {
		return this.professor;
	}
	
	public Map<Student, Integer> getGradeStudentMap(){
		return this.studentGradeMap;
	}
	
	public List<Student> getStudents(){
		return this.students;
	}
	
	public Student getTopStudent() {
		return this.students.get(0);
	}
	
	public Student getWeakestStudent() {
		return this.students.get(this.classSize -1);
	}
	
	public List<Student> getTopKStudents(int k){
		List<Student> outputList = new ArrayList();
		if(k > this.classSize || k < 1) {
			return outputList;
		}
		
		for(int i = 0; i < k; i ++) {
			outputList.add(this.students.get(i));
		}
		
		return outputList;
	}
	
	public double getCimulativeGPA() {
		return this.classAverage;
	}
	
	public int getClassSize() {
		return this.classSize;
	}
	
	public void addStudent(Student student, int grade) {
		student.addCourse(this);
		this.studentGradeMap.put(student, grade);
		this.students.add(student);
		this.classSize ++;
		this.cumulativeGradePoints += this.studentGradeMap.get(student);
		this.classAverage = this.cumulativeGradePoints / (1.0 *this.classSize);
		
		Collections.sort(this.students, new StudentComparator());
	}
	
	public String toString() {
		return "Course Name: " + this.courseName +"\nCourse ID: " +  this.courseID + "\nProfessor: "+ this.professor
				+ "People Enrolled: " + this.classSize + "\nClass Average: " + this.classAverage + "\n";
	}
}
