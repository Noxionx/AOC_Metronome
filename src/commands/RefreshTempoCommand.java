package commands;

import control.Materiel;
import model.MetronomeEngine;

public class RefreshTempoCommand implements Command {

	private final int MIN = 30;
	private final int MAX = 240;
	
	private MetronomeEngine engine;
	public RefreshTempoCommand (MetronomeEngine engine){
		this.engine = engine;
	}
	@Override
	public void execute() {
		float pos = Materiel.getMolette().position();
		engine.setTempo((int)((pos*MAX-MIN)+MIN));
		
	}
	

}
