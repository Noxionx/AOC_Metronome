package model;

import commands.BeepCommand;
import commands.Command;
import commands.LedCommand;
import control.Materiel;

public class MetronomeEngine {
	private boolean isRunning;
	private int tempo;
	private int mesure;
	private Command beepCmd;
	private Command tempoLed;
	private Command mesureLed;
	
	public MetronomeEngine(){
		this.isRunning = false;
		this.tempo = 60;
		this.mesure = 4;
		beepCmd = new BeepCommand();
		tempoLed = new LedCommand(0);
		mesureLed = new LedCommand(1);
		
	}
	
	public boolean isRunning(){
		return isRunning;
	}
	public void start(){
		if(!isRunning){
			isRunning = true;
			Materiel.getHorloge().activerPeriodiquement(beepCmd, getPeriode());
			Materiel.getHorloge().activerPeriodiquement(tempoLed, getPeriode());
			Materiel.getHorloge().activerPeriodiquement(mesureLed, getPeriode()*mesure);	
		}
		
		
		
	}
	public void stop(){
		if(isRunning){
			isRunning = false;
			Materiel.getHorloge().desactiver(beepCmd);
			Materiel.getHorloge().desactiver(tempoLed);
			Materiel.getHorloge().desactiver(mesureLed);
		}
		
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
		if(tempo!=this.tempo){
			this.tempo = tempo;
			stop();
			start();
		}
	}
	public void incMesure(){
		if(this.mesure<7){
			this.mesure++;
			stop();
			start();
		}
	}
	public void decMesure(){
		if(this.mesure>2){
			this.mesure --;
			stop();
			start();
		}
	}
	public int getMesure(){
		return mesure;
	}
	private float getPeriode(){
		float secsInMin = 60;
		return (float)(secsInMin/Float.parseFloat(Integer.toString(tempo)));
	}
	
}
