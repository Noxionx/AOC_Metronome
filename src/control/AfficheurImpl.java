package control;

import javafx.application.Platform;
import javafx.scene.paint.Color;
import app.MainApp;

public class AfficheurImpl implements Afficheur {
	
	private final int TEMPO_LED = 0;
	private final int BAR_LED = 1;
	
	@Override
	public void allumerLED(int numLED) {
		if(numLED==TEMPO_LED){
			Platform.runLater(new Runnable() {
				public void run() {
					MainApp.getView().getTempoLed().setFill(Color.GREEN);
			    }
			});
		}
		else if(numLED==BAR_LED){
			Platform.runLater(new Runnable() {
				public void run() {
					MainApp.getView().getBarLed().setFill(Color.BLUE);
			    }
			});
		}
	}

	@Override
	public void eteindreLED(int numLED) {
		if(numLED==TEMPO_LED){
			Platform.runLater(new Runnable() {
				public void run() {
					MainApp.getView().getTempoLed().setFill(Color.WHITE);
			    }
			});
		}
		else if(numLED==BAR_LED){
			Platform.runLater(new Runnable() {
				public void run() {
					MainApp.getView().getBarLed().setFill(Color.WHITE);
			    }
			});
		}	
	}

	@Override
	public void afficherTempo(int valeurTempo) {
		MainApp.getView().getTempoBox().setText("Tempo : "+valeurTempo);
	}

	@Override
	public void afficherMesure(int valeurMesure) {
		MainApp.getView().getBarBox().setText("Bar : "+valeurMesure);		
	}

}
