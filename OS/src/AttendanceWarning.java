
public class AttendanceWarning extends Process{
	
	public AttendanceWarning(int pid, String name, String period, int runTime) {
		super(pid, name, period, runTime);
		// TODO Auto-generated constructor stub
	}

	String[] students;
	int[] absence;
	
	public static void warn(String[] students, int[] absence){
		System.out.println("This method warns the students that were absent more than 2 times a week");
	}
	
	
}
