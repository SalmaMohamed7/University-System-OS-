import java.util.ArrayList;
import java.util.Queue;


public class CPUscheduling {
	Queue<Process> ready;
	Queue<Process> blocked;
	ArrayList<Process> processesList;
	
	
	public CPUscheduling(Queue<Process> ready, Queue<Process> blocked,
			ArrayList<Process> processesList) {
		super();
		this.ready = ready;
		this.blocked = blocked;
		this.processesList = processesList;
	}
	
	
	

}
