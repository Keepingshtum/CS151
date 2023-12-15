package alyssarichie;

import javafx.animation.*;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * This is just a demonstration of various components in JavaFX
 * Date: Nov 21, 2023
 */


public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Create left box / rectangle
        Rectangle boxLeft = new Rectangle(100, 50, Color.BLUE);

        // Set position / rotation initially
        boxLeft.setTranslateX(-40);
        boxLeft.setTranslateY(0);
        boxLeft.setRotate(90);
        boxLeft.setScaleY(0.50);

        // Animation (up / down) of the box/rectangle
        TranslateTransition translateTransitionLeft = new TranslateTransition(Duration.seconds(2), boxLeft);
        translateTransitionLeft.setByY(250);
        translateTransitionLeft.setCycleCount(TranslateTransition.INDEFINITE);
        translateTransitionLeft.setAutoReverse(true);

        // Create right box/rectangle
        Rectangle boxRight = new Rectangle(100, 50, Color.BLUE);

        // Set position / rotation initially
        boxRight.setTranslateX(240);
        boxRight.setTranslateY(0);
        boxRight.setRotate(90);
        boxRight.setScaleY(0.50);

        // Animation (up / down) of the box/rectangle
        TranslateTransition translateTransitionRight = new TranslateTransition(Duration.seconds(2), boxRight);
        translateTransitionRight.setByY(250);
        translateTransitionRight.setCycleCount(TranslateTransition.INDEFINITE);
        translateTransitionRight.setAutoReverse(true);

        // Create button objects
        Button stopBtn = new Button("Stop Animation");
        Button startBtn = new Button("Start Animation");


        // Create a container to hold both the start and pause button
        HBox buttonsContainer = new HBox();
        HBox.setMargin(startBtn, new Insets(0, 20, 0, 0)); // helps position
        HBox.setMargin(stopBtn, new Insets(0, 20, 0, 0)); // helps position
        buttonsContainer.getChildren().addAll(startBtn, stopBtn);

        // Create a circle at specified position
        Circle circle = new Circle(25, Color.DEEPPINK);
        circle.setTranslateX(50);
        circle.setTranslateY(50);

        // Circle animation (Translation)
        // There's a translation for going to the right (from the top left to middle right)
        TranslateTransition translateTransitionCircle_Right = new TranslateTransition(Duration.seconds(1), circle);
        translateTransitionCircle_Right.setByX(200);
        translateTransitionCircle_Right.setByY(100);

        // There's a translation for going from the middle right to the bottom left
        TranslateTransition translateTransitionCircle_Left = new TranslateTransition(Duration.seconds(1), circle);
        translateTransitionCircle_Left.setByX(-200);
        translateTransitionCircle_Left.setByY(100);

        // This is a sequential transition - it combines multiple transitions to create one transition
        SequentialTransition seqT = new SequentialTransition(circle, translateTransitionCircle_Right, translateTransitionCircle_Left);
        seqT.setCycleCount(TranslateTransition.INDEFINITE); // Makes the animation repeatable forever
        seqT.setAutoReverse(true); // Does back tracking for animation


        // Event listener for the stop button (pauses animations)
        stopBtn.setOnAction(event -> {
            translateTransitionLeft.pause();
            translateTransitionRight.pause();
            seqT.pause();

        });

        // Event listener for the start button (starts animations)
        startBtn.setOnAction(event -> {
            translateTransitionLeft.play();
            translateTransitionRight.play();
            seqT.play();

        });

        // Add text to the screen
        Text text = new Text("JavaFX has many features!");
        text.setFill(Color.BLACK);
        text.setTranslateX(75);
        text.setTranslateY(290);

        // Create a Pane and add shapes & text to it
        Pane pane = new Pane();
        pane.getChildren().addAll(boxLeft, boxRight, buttonsContainer, circle, text);

        // Create a Scene and add the Pane to it
        Scene scene = new Scene(pane, 300, 300);

        // Set stage / window name and show stage
        stage.setTitle("My JavaFX Program");
        stage.setScene(scene);
        stage.show();
    }
}