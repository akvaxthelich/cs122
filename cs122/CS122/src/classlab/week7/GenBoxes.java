package classlab.week7;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Shear;
import javafx.stage.Stage;

//************************************************************************
//  Boxes.java       Author: Lewis/Loftus
//
//  Demonstrates the use of loops and conditionals to draw.
//************************************************************************

public class GenBoxes extends Application {

	public void start(Stage primaryStage) {
		Group root = new Group();
		Random gen = new Random();

		for (int i = 1; i <= 20; i++) {
			
			int xPos = gen.nextInt(550) + 1;
			int yPos = gen.nextInt(550) + 1;

			int width = gen.nextInt(50) + 1;
			int height = gen.nextInt(50) + 1;

			Color fill = null;
			if (width < 10)
				fill = Color.YELLOW;
			else if (height < 10)
				fill = Color.GREEN;

			Rectangle box = new Rectangle(xPos, yPos, width, height);
			
			if(i % 2 == 0) {
				
				box.setRotate(20);
				
			}
			else if(i % 3 == 0) {
				
				box.setTranslateX(20);
				box.setTranslateY(20);
				
			}
			else if(i % 5 == 0) {
				
				box.getTransforms().add(new Shear(0.5, 0.5));
				
			}
			
			box.setStroke(Color.WHITE);
			box.setFill(fill);

			root.getChildren().add(box);
		}

		Scene scn = new Scene(root, 600, 600, Color.BLACK);

		primaryStage.setTitle("Rects !!!");
		
		primaryStage.setScene(scn);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
