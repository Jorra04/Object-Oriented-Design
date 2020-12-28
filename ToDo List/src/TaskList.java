import java.util.*;
public class TaskList {
	private List<Task> taskList;
	private int numberOfTasks;
	
	public TaskList() {
		this.taskList = new ArrayList();
		this.numberOfTasks = 0;
	}
	
	public TaskList(List<Task> taskList) {
		this.taskList = taskList;
		this.numberOfTasks = taskList.size();
	}
	
	public TaskList(TaskList other) {
		this.taskList = other.taskList;
		this.numberOfTasks = other.numberOfTasks;
	}
	
	public List<Task> getTaskList(){
		return this.taskList;
	}
	
	public int getNumberOfTasks() {
		return this.numberOfTasks;
	}
	
	
	public void addTask(Task task) {
		this.taskList.add(task);
		this.numberOfTasks ++;
	}
	
	public void removeTask(Task task) {
		if(!this.taskList.contains(task)) {
			System.out.println("Task Does not Exist.");
			return;
		}
		
		this.taskList.remove(task);
	}
	
	public String toString() {
		if(taskList.isEmpty()) {
			return "You Have No Assigned Tasks.";
		}
		return this.taskList.toString();
	}
}
