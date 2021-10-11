package classlab.week5;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DisplayAThing extends Application {

	public void start(Stage firstStage) {
		Text name = new Text(240, 120, "Andrew Dinspechin");
		
		Group root = new Group(name);
		
		Scene scene = new Scene(root, 480, 240, Color.PINK);

		firstStage.setTitle("Run.");
		
		firstStage.setScene(scene);
		firstStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}