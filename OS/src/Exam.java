
public class Exam extends Process{
	public Exam(int pid, String name, String period, int runTime) {
		super(pid, name, period, runTime);
		// TODO Auto-generated constructor stub
	}

	String[] students;
	int[] absenceLevel;
	
	public static void finalExam(String[] Students, int[] absenceLevel){
		System.out.println("this method outputs a list of all students that can attend the final exam and a list of those who won't be able to");
		
	}

}
