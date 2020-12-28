package Main;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		
		List<Course> courses = new ArrayList();
		
		Professor professor1 = new Professor(Credentials.fname1, Credentials.lname1, Credentials.age1, Credentials.faculty1 );
		Professor professor2 = new Professor(Credentials.fname2, Credentials.lname2, Credentials.age2, Credentials.faculty2 );
		Course course1 = new Course(Credentials.courseName1,Credentials.courseCode1 ,professor1);
		Course course2 = new Course(Credentials.courseName2,Credentials.courseCode2 ,professor2);
		
		Student s1 = new Student(Credentials.studentGPA1 ,Credentials.studentName1,Credentials.studentID1 );
		Student s2 = new Student(Credentials.studentGPA2 ,Credentials.studentName2,Credentials.studentID2 );
		Student s3 = new Student(Credentials.studentGPA3 ,Credentials.studentName3,Credentials.studentID3 );
		Student s4 = new Student(Credentials.studentGPA4 ,Credentials.studentName4,Credentials.studentID4 );
		Student s5 = new Student(Credentials.studentGPA5 ,Credentials.studentName5,Credentials.studentID5 );
		
		
		course1.addStudent(s1, Credentials.course1GPA1);
		course1.addStudent(s2 , Credentials.course1GPA2);
		course1.addStudent(s3 , Credentials.course1GPA3);
		course1.addStudent(s4 , Credentials.course1GPA5);
		course1.addStudent(s5 , Credentials.course1GPA5);
		
		
		course2.addStudent(s1, Credentials.course2GPA1);
		course2.addStudent(s2 , Credentials.course2GPA2);
		course2.addStudent(s3 , Credentials.course2GPA3);
		courses.add(course1);
		courses.add(course2);
		
		School school = new School(courses);
		
		System.out.println(school.getCourses());
		System.out.println(school.getNumberOfCourses());
		
		school.saveData();
		

	}

}
