package control;

import java.util.ArrayList;
import java.util.List;

import commands.Command;
import commands.PeriodicTask;

public class HorlogeImpl implements Horloge {
	
	private List<PeriodicTask> tasks = new ArrayList<PeriodicTask>();

	@Override
	public void activerPeriodiquement(Command cmd, float periodeEnSecondes) {
		
		PeriodicTask task = new PeriodicTask(cmd,(int)(periodeEnSecondes*1000));
		task.start();
		tasks.add(task);	
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
		for(int i = 0; i<tasks.size(); i++){
			if(tasks.get(i).getCommand().equals(cmd)){
				tasks.get(i).stop();
				tasks.remove(i);
			}
		}
		
	}

}
