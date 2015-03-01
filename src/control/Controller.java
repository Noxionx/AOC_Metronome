package control;

import model.MetronomeEngine;

public class Controller {
	private final int MIN_TEMPO = 40;
	private final int MAX_TEMPO = 240;
	
	private MetronomeEngine engine;
	public Controller(MetronomeEngine engine){
		this.engine = engine;
	}
	
	public void startCommand(){
		engine.start();
	}
	public void stopCommand(){
		engine.stop();
	}
	public void decBarCommand(){
		engine.decMesure();
	}
	public void incBarCommand(){
		engine.incMesure();
	}
	public void sliderChanged(){
		engine.setTempo((int) ((MAX_TEMPO-MIN_TEMPO)*Materiel.getMolette().position()+MIN_TEMPO));
	}
}
