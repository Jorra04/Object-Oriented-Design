package Main;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class School {
	
	
	private List<Course> courses;
	private int numberOfCourses;
	
	
	public School(List<Course> courses) {
		this.courses = courses;
		this.numberOfCourses = courses.size();
	}
	
	public School(School other) {
		this.courses = other.courses;
		this.numberOfCourses = other.numberOfCourses;
	}
	
	public List<Course> getCourses(){
		return this.courses;
	}
	
	public int getNumberOfCourses() {
		return this.numberOfCourses;
	}
	
	public void saveData() {
		
		File f = new File(Credentials.path);
		if(!f.exists() || f.isDirectory()) { 
			try {
			      File myObj = new File(Credentials.path);
			      if (myObj.createNewFile()) {
			        System.out.println("File created: " + myObj.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
		}
		try {
			
			
			
			
		      FileWriter myWriter = new FileWriter(Credentials.path);
		      String text = "";
		      
		     
		      
		      
		      for(Course tempCourse : this.courses) {
		    	  text += "======================== Class Data =====================================\n";
		    	  for(Student student : tempCourse.getStudents()) {
		    		 text +=  "First Name: " + student.getName() + "\tGrade: " + tempCourse.getGradeStudentMap().get(student) +"\n";
		    	  }
		    	  text += "========================= Student Data =====================================\n"
		      		+ tempCourse.toString()
		    		  +"\n========================= Top Student in Class ==============================\n"
		      		+ tempCourse.getTopStudent().toString() 
		      		+ "\n======================== Top 5 students ======================================\n"
		      		+tempCourse.getTopKStudents(5)
		      		+"\n======================== Weakest Student in Class =============================\n"
		      		+tempCourse.getWeakestStudent()
		      		+"\n======================== Next Class ===========================================\n\n";
		      }
		      myWriter.write(text);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

	
	
	
}
