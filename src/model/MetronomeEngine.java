package model;

import control.Materiel;

public class MetronomeEngine {
	private boolean isRunning = false;
	private int tempo = 60;
	private int mesure = 4;
	
	public void start(){
		isRunning = true;
		
	}
	public void stop(){
		isRunning = false;
	}
	public void toggleOnOff(){
		if(isRunning){
			stop();
		}
		else{
			start();
		}
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public void incMesure(){
		if(this.mesure<7){
			this.mesure++;
		}
	}
	public void decMesure(){
		if(this.mesure>2){
			this.mesure --;
		}
	}
	public int getMesure(){
		return mesure;
	}
	
}
