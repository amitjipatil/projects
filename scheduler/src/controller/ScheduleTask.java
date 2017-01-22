package controller;

import java.util.Date;
import java.util.TimerTask;

public class ScheduleTask extends TimerTask{
	
	Date now; 
	@Override
	public void run() {
		now = new Date(); // initialize date
		System.out.println("Time is :" + now);
		
	}

}
