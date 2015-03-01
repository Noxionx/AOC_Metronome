package app;
import control.Controller;
import view.ViewHandler;
import model.MetronomeEngine;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class MainApp extends Application{
	
	private Scene scene;
	private static MetronomeEngine engine;
	private static ViewHandler view;
	private static Controller controller;
	
	
	public static MetronomeEngine getEngine(){
		return engine;
	}
	
	public static ViewHandler getView(){
		return view;
	}
	
	public static Controller getController(){
		return controller;
	}
	
	
	@Override
	public void start(Stage stage) throws Exception {
		//Récupération du fichier de description de la vue (FXML)
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/View.fxml"));
        Parent root = (Parent)loader.load(getClass().getResource("/view/View.fxml").openStream());
		//Titre de la fenètre
        stage.setTitle("Nox's Metronome");
		
        //Dimentionnement de la scene
		scene = new Scene(root, 640, 480);
		
		//Création du model / vue / controlleur
		view = loader.<ViewHandler>getController() ;
		engine = new MetronomeEngine();
		controller = new Controller(engine);
		

		//Ajout de la scene à la fenètre et affichage
		stage.setScene(scene);
		stage.show();
		
		//Gestion de bouton de fermeture de la fenètre
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
	          public void handle(WindowEvent we) {
	              engine.stop();
	          }
	      }); 
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
