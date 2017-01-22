package controller;

import java.util.Timer;

public class ScheduleMain {

	public static void main(String[] args) throws InterruptedException {
		
		Timer time = new Timer(); // Instantiate Timer Object
		ScheduleTask st = new ScheduleTask(); 
		time.schedule(st, 0, 1000); // Repetitive task for every 1 sec

		//for demo
		for (int i = 0; i <= 20; i++) {
			System.out.println("Execution in Main Thread..." + i);
			Thread.sleep(2000);
			if (i == 18) {
				System.out.println("Application Terminates...");
				
				System.exit(0);
			}
		}
	}

}
