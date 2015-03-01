package commands;

import java.util.Timer;
import java.util.TimerTask;


public class PeriodicTask{
	private Command cmd;
	private int msPeriode;
	private Timer timer;
	
	//Gestion de l'execution périodique d'une commande (Timer)
	public PeriodicTask(Command cmd, int msPeriode){
		this.cmd = cmd;
		this.msPeriode = msPeriode;
	}
	
	public Command getCommand(){
		return cmd;
	}
	
	public void start(){
		timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
	        	cmd.execute();     	
			}
		};
		timer.scheduleAtFixedRate(task, 0, msPeriode);
	}
	public void stop(){
		timer.cancel();
	}
	

}
