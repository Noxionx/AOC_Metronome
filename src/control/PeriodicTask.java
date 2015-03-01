package control;

import commands.Command;

public class PeriodicTask extends Thread{
	private Command cmd;
	private int msPeriode;
	private boolean exec = true;
	
	public PeriodicTask(Command cmd, int msPeriode){
		this.cmd = cmd;
		this.msPeriode = msPeriode;
	}
	
	public Command getCommand(){
		return cmd;
	}
	public void stopExecution(){
		exec = false;
	}
	public void reset(){
		exec = true;
	}
	
	@Override
	public void run(){
		while(exec){
			try{
				cmd.execute();
				sleep(msPeriode);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
