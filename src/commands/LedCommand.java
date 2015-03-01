package commands;

import control.Materiel;

public class LedCommand implements Command{
	
	private int num;
	public LedCommand (int num){
		this.num = num;
	}

	@Override
	public void execute() {
		Materiel.getAfficheur().allumerLED(num);
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Materiel.getAfficheur().eteindreLED(num);
	}

	
}
