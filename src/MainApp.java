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
	private static ViewHandler viewHandler;
	
	public static MetronomeEngine getEngine(){
		return engine;
	}
	public static ViewHandler getView(){
		return viewHandler;
	}
	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view/View.fxml"));
        Parent root = (Parent)loader.load(getClass().getResource("view/View.fxml").openStream());
		stage.setTitle("Nox's Metronome");
		
		scene = new Scene(root, 640, 480);
		viewHandler = loader.<ViewHandler>getController() ;
		engine = new MetronomeEngine();

		stage.setScene(scene);
		stage.show();
		
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
