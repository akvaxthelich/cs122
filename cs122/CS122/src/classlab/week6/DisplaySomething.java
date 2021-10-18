package classlab.week6;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DisplaySomething extends Application {
	// --------------------------------------------------------------------
	// Displays an image centered in a window.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		Image img = new Image("file:src/Assimilator.PNG");
		ImageView imgView = new ImageView(img);

		StackPane pane = new StackPane(imgView);
		pane.setStyle("-fx-background-color: linear-gradient(to right, darkslateblue, midnightblue);");

		Scene scene = new Scene(pane, 500, 350);

		primaryStage.setTitle("Assimilator in all its glory");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}