package com.gluonapplica;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class GluonApplica extends Application {

	Stage window;
	Scene scene1, scene2;

	@Override
	public void start(Stage stage) throws Exception {
		window = stage;
		Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
		double width = visualBounds.getWidth();
		double height = visualBounds.getHeight();

		Label label1 = new Label("Click the button");
		Label label2 = new Label();
		Button button1 = new Button("Button");
		TextField textField = new TextField();
		button1.setOnAction(e -> window.setScene(scene2));
		button1.setOnAction((e) -> {
			window.setScene(scene2);
			label2.setText(textField.getText());
		});

		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, textField, button1);
		scene1 = new Scene(layout1, width, height);

		Button button2 = new Button("Go back");
		button2.setOnAction(e -> window.setScene(scene1));

		VBox layout2 = new VBox(20);
		layout2.getChildren().addAll(label2, button2);
		scene2 = new Scene(layout2, width, height);

		window.setScene(scene1);
		window.setTitle("Elenx");
		window.show();

	}

	// @Override
	// public void start(Stage stage) throws Exception {
	// Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
	// double width = visualBounds.getWidth();
	// double height = visualBounds.getHeight();
	//
	// Label label = new Label("Click the button.");
	// label.setTranslateY(30);
	//
	// TextField textField = new TextField();
	// textField.setTranslateY(60);
	//
	// Button button = new Button("Button");
	// button.setOnAction(e -> label.setText(textField.getText()));
	//
	// Rectangle rectangle = new Rectangle(width - 20, height - 20);
	// rectangle.setFill(Color.LIGHTBLUE);
	// rectangle.setArcHeight(6);
	// rectangle.setArcWidth(6);
	//
	// StackPane stackPane = new StackPane();
	//
	// stackPane.getChildren().addAll(rectangle, textField, button, label);
	//
	// Scene scene = new Scene(stackPane, width, height);
	//
	// stage.setScene(scene);
	// stage.show();
	// }
}