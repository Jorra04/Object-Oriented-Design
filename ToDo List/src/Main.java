
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task1 = new Task(Credentials.taskName1, Credentials.taskDescription1, 
				Credentials.taskDifficulty1, Credentials.taskCompletionDate1);
		
		Task task2 = new Task(Credentials.taskName2, Credentials.taskDescription2, 
				Credentials.taskDifficulty2, Credentials.taskCompletionDate2);
		
		TaskList taskList = new TaskList();
		taskList.addTask(task1);
		taskList.addTask(task2);
		
		System.out.println(taskList.toString());
		System.out.println("======================================================");
		taskList.removeTask(task1);
		System.out.println(taskList.toString());
		
		System.out.println("======================================================");
		taskList.removeTask(task2);
		System.out.println(taskList.toString());
		
	}

}
