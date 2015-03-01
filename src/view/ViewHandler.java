package view;

import app.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;

public class ViewHandler {
	
	@FXML
	private TextField tempoBox;

	@FXML
	private TextField barBox;
	
	@FXML
	private Circle tempoLed;
	
	@FXML 
	private Circle barLed;
	
	@FXML
	private Slider slider;
	
	public TextField getTempoBox() {
		return tempoBox;
	}

	public TextField getBarBox() {
		return barBox;
	}

	public Circle getTempoLed() {
		return tempoLed;
	}

	public Circle getBarLed() {
		return barLed;
	}

	public Slider getSlider() {
		return slider;
	}
	
	@FXML
	private void onStartBtn(ActionEvent e){
		MainApp.getController().startCommand();
	}

	@FXML
	private void onStopBtn(ActionEvent e){
		MainApp.getController().stopCommand();
	}
	
	@FXML
	private void onDecBarBtn(ActionEvent e){
		MainApp.getController().decBarCommand();
	}
	
	@FXML
	private void onIncBarBtn(ActionEvent e){
		MainApp.getController().incBarCommand();
	}
	
	@FXML
	private void onSliderChanged(MouseEvent e){
		MainApp.getController().sliderChanged();
	}
	
	

}
