
public class GPA extends Process{
	public GPA(int pid, String name, String period, int runTime) {
		super(pid, name, period, runTime);
		// TODO Auto-generated constructor stub
	}


	double oldGPA;
	double newGPA;
	
	
	public static void updateGPA(double oldGPA, double newGPA){
		System.out.println("this methd updates the students' gpa");
	}

}
