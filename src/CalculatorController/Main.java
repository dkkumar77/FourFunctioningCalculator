package CalculatorController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../FXMLDiagram/GUI_set.fxml"));
        primaryStage.setScene(new Scene(root, 272, 411));
        primaryStage.show();
        primaryStage.setMaxHeight(411);
        primaryStage.setMinWidth(272);
        primaryStage.setMaxWidth(272);
        primaryStage.setMinHeight(411);
        primaryStage.setTitle("Calculator");




    }


    public static void main(String[] args) {
        launch(args);
    }
}
