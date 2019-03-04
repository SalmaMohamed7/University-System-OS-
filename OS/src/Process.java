
public class Process {
	int pid;
	//Status? ===> create ready run block
	String name;
	String period;
	int runTime;
	
	//create a process
	public Process(int pid, String name, String period, int runTime) {
		super();
		this.pid = pid;
		this.name = name;
		this.period = period;
		this.runTime = runTime;
	}
	
	public static void Ready(){
		System.out.println("The process is ready to run");
	}
	
	public static void Run(){
		System.out.println("the process is running");
		
	}
	
	public static void blocked(){
		System.out.println("The process is currently blocked");
		
	}
	
	public static void finished(){
		System.out.println("The process is finished");
	}

}
