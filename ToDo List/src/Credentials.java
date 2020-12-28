import java.time.LocalDate;
import java.util.*;
public class Credentials {
	protected static String taskName1 = "Clean House";
	protected static String taskDescription1 = "Clean the top and bottom floor of the house.";
	protected static TaskDifficulty taskDifficulty1 = TaskDifficulty.MEDIUM;
	protected static LocalDate taskCompletionDate1 = LocalDate.of(2020, 12,29);
	
	
	protected static String taskName2 = "Update Resume";
	protected static String taskDescription2 = "Update the resume with new work experience"
			+ " and new projects.";
	protected static TaskDifficulty taskDifficulty2 = TaskDifficulty.EASY;
	protected static LocalDate taskCompletionDate2 = LocalDate.of(2020, 12,31);
}
