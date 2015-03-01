package control;

import java.util.ArrayList;
import java.util.List;

import commands.Command;

public class HorlogeImpl implements Horloge {
	
	private List<PeriodicTask> tasks = new ArrayList<PeriodicTask>();

	@Override
	public void activerPeriodiquement(Command cmd, float periodeEnSecondes) {
		PeriodicTask task = new PeriodicTask(cmd, (int)(periodeEnSecondes*1000));
		tasks.add(task);
		task.start();
		
	}

	@Override
	public void activerApresDelai(Command cmd, float delaiEnSecondes) {
		try{
			Thread.sleep((int)(delaiEnSecondes*1000));
			cmd.execute();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void desactiver(Command cmd) {
		// TODO Auto-generated method stub
		for(PeriodicTask task : tasks){
			if(task.getCommand().equals(cmd)){
				task.stopExecution();
				tasks.remove(task);
			}
		}
		
	}

}
