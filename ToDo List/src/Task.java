import java.time.LocalDate;
import java.util.*;

public class Task {
	private String taskName;
	private String taskDescription;
	private TaskDifficulty difficulty;
	private LocalDate completionDate;
	
	public Task(String taskName, String taskDescription, TaskDifficulty taskDifficulty, LocalDate completionDate) {
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.difficulty = taskDifficulty;
		this.completionDate = completionDate;
	}
	
	public Task(Task other) {
		this.taskName = other.taskName;
		this.taskDescription = other.taskDescription;
		this.difficulty = other.difficulty;
		this.completionDate = other.completionDate;
	}
	
	
	public String getTaskDescription() {
		return this.taskDescription;
	}
	
	public TaskDifficulty getTaskDifficulty() {
		return this.difficulty;
	}
	
	public LocalDate getCompletionDate() {
		return this.completionDate;
	}
	
	public String toString() {
		return "Task Name: " + this.taskName + "\nTask Description: " + this.taskDescription 
				+ "\nTask Difficulty: " + this.difficulty + "\nDeadline: " + this.completionDate;
	}
}
