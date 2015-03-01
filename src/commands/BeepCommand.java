package commands;

import control.Materiel;

public class BeepCommand implements Command{

	@Override
	public void execute() {
		Materiel.getEmetteurSonore().emettreClic();	
	}

	
}
